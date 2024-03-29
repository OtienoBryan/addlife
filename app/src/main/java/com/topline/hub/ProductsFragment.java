package com.topline.hub;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ProductsFragment extends Fragment {
    Activity act;

    //CardView newAppointments,tasks, follow;
    CardView lnOffer, lnArrival,lnGift,lnPopular;
    CardView cvWhisky, cvWines, cvCognac, cvVapes;
    Button btnNew;
    LinearLayout category, home, notification, profile, call, orders;
    TextView user_name, user_phone, user_role, user_team,activity,txtDate;

    RecyclerView recyclerView;
    List<ProductModel> cats;
    private final int MY_PERMISSIONS_CALL= 7;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_products_fragment, container, false);
        act=getActivity();

        home = (LinearLayout) v.findViewById(R.id.home);
        notification = (LinearLayout) v.findViewById(R.id.notification);
        profile = (LinearLayout) v.findViewById(R.id.profile);
        call = (LinearLayout) v.findViewById(R.id.call);
        orders = (LinearLayout) v.findViewById(R.id.orders);
        //notice = (LinearLayout) v.findViewById(R.id.notice);

        final String number = "+254790193625";

        recyclerView = (RecyclerView) v.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(act, 2));

        cats = new ArrayList<>();
        loadCategories();


        lnPopular = (CardView)v.findViewById(R.id.lnPopular);
        lnOffer = (CardView)v.findViewById(R.id.lnOffer);
        lnArrival = (CardView)v.findViewById(R.id.lnArrival);
        lnGift = (CardView)v.findViewById(R.id.lnGift);


        if (ContextCompat.checkSelfPermission(act, Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {
            // Permission is not granted
            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) act,
                    Manifest.permission.CALL_PHONE)) {
                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.
            } else {
                // No explanation needed; request the permission
                ActivityCompat.requestPermissions((Activity) act,
                        new String[]{Manifest.permission.CALL_PHONE},
                        MY_PERMISSIONS_CALL);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        }

//        category.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(act, ProductCat.class));
//
//            }
//        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(act, MainActivity.class));

            }
        });

        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(act, Cart.class));

            }
        });

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(act, MyOrders.class));

            }
        });

//        profile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(act, User.class));
//
//            }
//        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "+254 790 193625";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phone));

                if (ActivityCompat.checkSelfPermission(act, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    //ActivityCompat.requestPermissions(context, new String[] { permission }, requestCode);

                    Toast.makeText(act, "Enable call permission in APP Settings", Toast.LENGTH_SHORT).show();
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions

                    return;
                }
                startActivity(intent);

            }
        });



        //Product Category

//        cvWhisky.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final String id = "2";
//                final String cat_id = "16";
//                final String name = "Whisky";
//
//                openCategory(id, cat_id, name);
//            }
//        });

//        cvWines.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final String id = "2";
//                final String cat_id = "17";
//                final String name = "Wines";
//
//                openCategory(id, cat_id, name);
//            }
//        });

//        cvWines.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(act, WineCategory.class));
//            }
//        });

//        cvCognac.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final String id = "2";
//                final String cat_id = "6";
//                final String name = "Cognac";
//
//                openCategory(id, cat_id, name);
//            }
//        });
//        cvVapes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final String id = "2";
//                final String cat_id = "14";
//                final String name = "Cigarettes";
//
//                openCategory(id, cat_id, name);
//            }
//        });


//        lnOffer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(act, OfferFragment.class));
//            }
//        });

//        lnPopular.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(act, PopularWines.class));
//            }
//        });

//        lnArrival.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(act, NewArrivals.class));
//            }
//        });

//        lnGift.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(act, GiftPack.class));
//            }
//        });

        return v;
    }

    private void loadCategories() {

        StringRequest stringRequest = new StringRequest(Request.Method.GET, Constants.URL_MY_PRODUCTS,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        //progressBar.setVisibility(View.GONE);

                        try {
                            //converting the string to json array object
                            JSONArray array = new JSONArray(response);

                            //traversing through all the object
                            for (int i = 0; i < array.length(); i++) {

                                //getting product object from json array
                                JSONObject cat = array.getJSONObject(i);

                                //adding the Task to Task list
                                cats.add(new ProductModel(
                                        cat.getInt("id"),
                                        cat.getString("cat_id"),
                                        cat.getString("cat_name"),
                                        cat.getString("image"),
                                        cat.getString("price"),
                                        cat.getString("description"),
                                        cat.getString("status")
                                        //cat.getString("catcolor_id")

                                ));
                            }

                            //creating adapter object and setting it to recyclerview
                            ProductAdapter adapter = new ProductAdapter(act, cats);
                            recyclerView.setAdapter(adapter);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        //progressBar.setVisibility(View.GONE);
                        //Toast.makeText(act, "Error Loading Product Category Try again", Toast.LENGTH_SHORT).show();

                    }
                });

        //adding our stringrequest to queue
        Volley.newRequestQueue(act).add(stringRequest);
    }


    public void setFragment(Fragment f){

        FragmentManager fManager = getFragmentManager();
        FragmentTransaction ft = fManager.beginTransaction();
        ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
        ft.replace(R.id.frame, f);
        ft.commit();

    }


//    private void openCategory(String id, String cat_id, String name){
//
//        Intent i = new Intent(act, CategoryProducts.class);
//
//        //PACK DATA
//        i.putExtra("ID_KEY", id);
//        i.putExtra("CAT_ID", cat_id);
//        i.putExtra("CAT_NAME", name);
//
//        act.startActivity(i);
//
//    }


}
