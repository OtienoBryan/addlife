package com.topline.hub;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AppointmentsFragment extends Fragment {
    Activity act;

    //CardView newAppointments,tasks, follow;
    CardView lnCare, lnMental,lnNutrition,lnLife, lnSoS, lnActivity, lnCoach;
    Button btnNew;
    LinearLayout support, request, sos, history, notice, orders;
    TextView user_name, user_phone, user_role, user_team,activity,txtDate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_appointments, container, false);
        View v = inflater.inflate(R.layout.myhome, container, false);
        act=getActivity();

        request = (LinearLayout) v.findViewById(R.id.request);
        support = (LinearLayout) v.findViewById(R.id.support);
        sos = (LinearLayout) v.findViewById(R.id.sos);
        history = (LinearLayout) v.findViewById(R.id.history);
        orders = (LinearLayout) v.findViewById(R.id.orders);
        notice = (LinearLayout) v.findViewById(R.id.notice);


        //newAppointments = (CardView)v.findViewById(R.id.cvNew);
        lnCare = (CardView)v.findViewById(R.id.lnCare);
        lnMental = (CardView)v.findViewById(R.id.lnMental);
        lnNutrition = (CardView)v.findViewById(R.id.lnNutrition);
        lnLife = (CardView)v.findViewById(R.id.lnLife);

        lnCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(act, Outlets.class));

            }
        });

        lnMental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(act, Mental.class));

            }
        });

        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(act, Notice.class));

            }
        });

        lnNutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(act, Nutrition.class));

            }
        });

        lnLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(act, Life.class));

            }
        });

        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(act, PromotionActivity.class));

            }
        });

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(act, About.class));

            }
        });

        sos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(act, NewSos.class));

            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(act, AppointmentsActivity.class));

            }
        });

        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(act, Shop.class));

            }
        });

//        lnTasks.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if(SharedPrefManager.getInstance(act).getUserLastname().equalsIgnoreCase("56")){
//                    startActivity(new Intent(act, TeamLeaderCollage.class));
//                }else {
//                    startActivity(new Intent(act, ActivityTrackerView.class));
//                }
//
//
//
//
//            }
//        });

//        lnOutlets.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(act, Outlets.class));
//            }
//        });

//        lnVisit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(act, OutletsVisited.class));
//            }
//        });

//        lnExpiry.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(act, MyExpiryProduct.class));
//            }
//        });
//
//        lnSoS.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(act, OutletsVisited.class));
//            }
//        });

//        lnActivity.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(act, ActivityTrackerView.class));
//            }
//        });

//        lnCoach.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(act, TeamLeaderCollage.class));
//            }
//        });


        //btnNew = (Button) v.findViewById(R.id.btnNew);
        //tasks = (CardView)v.findViewById(R.id.cvTasks);


       /* btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(act, AppointmentsActivity.class));

            }
        });*/




        return v;
    }


    public void setFragment(android.support.v4.app.Fragment f){

        android.support.v4.app.FragmentManager fManager = getFragmentManager();
        android.support.v4.app.FragmentTransaction ft = fManager.beginTransaction();
        ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
        ft.replace(R.id.frame, f);
        ft.commit();

    }


}
