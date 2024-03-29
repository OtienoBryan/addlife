package com.topline.hub;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class MySosProductAdapter extends RecyclerView.Adapter<MySosProductAdapter.MyViewHolder> {

    private List<MySosProduct_model> products;
    private Context context;

    public MySosProductAdapter(List<MySosProduct_model> products, Context context) {
        this.products = products;
        this.context = context;
    }



    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_my_sos_product_adapter, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        final Integer id = products.get(position).getId();

        holder.product_name.setText(products.get(position).getProduct_name());
        holder.product_code.setText(products.get(position).getProduct_code());
        holder.product_sku.setText(products.get(position).getSku());





        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                openDetailActivity(id.toString(),products.get(position).getProduct_name(),products.get(position).getSku(),products.get(position).getProduct_code());
            }
        });





    }

    @Override
    public int getItemCount() {
        return products.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView product_name,product_code, product_sku;
        LinearLayout linearLayout;


        public MyViewHolder(View itemView) {
            super(itemView);
            product_name = itemView.findViewById(R.id.productName);
            product_code = itemView.findViewById(R.id.productCode);
            product_sku = itemView.findViewById(R.id.productSku);
            linearLayout = itemView.findViewById(R.id.linearLayout);



        }
    }



    private void openDetailActivity(String product_id,String product_name, String product_code, String product_sku){




        Intent i = new Intent(context, MySosProductActivity.class);

        //PACK DATA
        i.putExtra("ID_KEY", product_id);
        i.putExtra("PRODUCT_NAME_KEY", product_name);
        i.putExtra("PRODUCT_CODE_KEY", product_code);
        i.putExtra("PRODUCT_SKU", product_sku);

        context.startActivity(i);

    }


}
