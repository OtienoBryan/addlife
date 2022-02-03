package com.topline.hub;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewProductCatAdapter extends RecyclerView.Adapter<NewProductCatAdapter.ProductViewHolder>{
    private Context mCtx;
    private List<ProductCat_model> cats;

    public NewProductCatAdapter(Context mCtx, List<ProductCat_model> cats) {
        this.mCtx = mCtx;
        this.cats = cats;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.productcategory_list, null);
        return new ProductViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(final ProductViewHolder holder, int position) {
        final ProductCat_model cat = cats.get(position);



        final Integer id = cat.getId();

        //final String cat_id = cat.getCat_id();
        holder.cat_name.setText(cat.getName());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                openDetailActivity(id.toString(), cat.getCat_id(),cat.getName());
            }
        });



    }

    @Override
    public int getItemCount() {
        return cats.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView cat_name;
        // RelativeLayout relativeLayout;
        CardView cardView;


        public ProductViewHolder(View itemView) {
            super(itemView);

            cat_name = itemView.findViewById(R.id.txtProductCategory);
            cardView = itemView.findViewById(R.id.cardView);


        }
    }



    private void openDetailActivity(String id, String cat_id, String name){




        Intent i = new Intent(mCtx, MainActivity.class);

        //PACK DATA
        i.putExtra("ID_KEY", id);
        i.putExtra("CAT_ID", cat_id);
        i.putExtra("CAT_NAME", name);

        mCtx.startActivity(i);

    }







}
