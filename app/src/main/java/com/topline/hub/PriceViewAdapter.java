package com.topline.hub;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;

public class PriceViewAdapter extends RecyclerView.Adapter<PriceViewAdapter.MyViewHolder> {

    private List<PriceView_model> expiries;
    private Context context;

    public PriceViewAdapter(List<PriceView_model> expiries, Context context) {
        this.expiries = expiries;
        this.context = context;
    }



    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_price_view_adapter, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        final Integer id = expiries.get(position).getId();
        final String comments = expiries.get(position).getImpact();


        holder.outlet.setText(expiries.get(position).getOutlet());
        holder.product_name.setText(expiries.get(position).getProduct_name());
        // holder.product_code.setText(expiries.get(position).getProduct_code());
       holder.date.setText(expiries.get(position).getDate());
        holder.initialPrice.setText(expiries.get(position).getInitial_price());
        holder.newPrice.setText(expiries.get(position).getNew_price());
//        if(!expiries.get(position).getCurrent().equalsIgnoreCase("0")){
//            holder.tableRow.setVisibility(View.VISIBLE);
//            holder.current.setText(expiries.get(position).getCurrent());
//
//        }

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /*Toast.makeText(context, "You clicked" + apps.get(position).getOutlet(),
                    Toast.LENGTH_LONG).show();*/

                // Intent i = new Intent(mCtx, SubCategoryActivity.class);
                //  mCtx.startActivity(i);

                openDetailActivity(id.toString(),expiries.get(position).getOutlet(),expiries.get(position).getProduct_name(),expiries.get(position).getProduct_code(),expiries.get(position).getInitial_price(),expiries.get(position).getNew_price(),expiries.get(position).getChange_type(),expiries.get(position).getImpact(),expiries.get(position).getDate());
            }
        });





    }

    @Override
    public int getItemCount() {
        return expiries.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView outlet,product_name,product_code,batch_no,date,initialPrice,newPrice;
        TableRow tableRow;
        RelativeLayout relativeLayout;


        public MyViewHolder(View itemView) {
            super(itemView);
            outlet = itemView.findViewById(R.id.client);
            product_name = itemView.findViewById(R.id.product);
            //product_code = itemView.findViewById(R.id.productCode);
            batch_no = itemView.findViewById(R.id.batchNo);
            initialPrice = itemView.findViewById(R.id.initialPrice);
            newPrice = itemView.findViewById(R.id.newPrice);
            date = itemView.findViewById(R.id.date);
            tableRow = itemView.findViewById(R.id.tableQuantity);
            relativeLayout = itemView.findViewById(R.id.relativeLayout);



        }
    }



    private void openDetailActivity(String expiry_id,String outlet,String product_name, String product_code, String batch_no, String expiry_date, String quantity, String comments, String manu_date){




        Intent i = new Intent(context, NewExpiryUpdate.class);

        //PACK DATA
        i.putExtra("ID_KEY", expiry_id);
        i.putExtra("OUTLET_KEY", outlet);
        i.putExtra("PRODUCT_NAME_KEY", product_name);
        i.putExtra("PRODUCT_CODE_KEY", product_code);
        i.putExtra("BATCH_NO_KEY", batch_no);
        i.putExtra("EXPIRY_DATE_KEY", expiry_date);
        i.putExtra("QUANTITY_KEY", quantity);
        i.putExtra("COMMENTS_KEY", comments);
        i.putExtra("MANU_DATE_KEY", manu_date);

        //context.startActivity(i);

    }


}
