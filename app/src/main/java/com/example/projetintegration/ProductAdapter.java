package com.example.projetintegration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.rcyview>{
    public static class rcyview extends RecyclerView.ViewHolder {
        TextView descr;
        TextView price;
        ImageView image;
        ProductAdapter myadapter;
        TextView rating;
        public rcyview(@NonNull View view, ProductAdapter Prroductradapter) {
            super(view);
            descr = view.findViewById(R.id.product_name);
            price = view.findViewById(R.id.product_price);
           // image = view.findViewById(R.id.product_image);

            rating = view.findViewById(R.id.rating);

        }
    }
    ArrayList<ProductModel> products;

   Context contex;
    public  ProductAdapter(ArrayList<ProductModel> products, Context context){
        this.products = products;
        this.contex = context;
    }

    @NonNull
    @Override
    public rcyview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new rcyview(LayoutInflater.from(parent.getContext()).inflate(R.layout.product, parent, false), this);
    }

    @Override
    public void onBindViewHolder(@NonNull rcyview holder, @SuppressLint("RecyclerView") int position) {
holder.descr.setText(products.get(position).getName());
holder.price.setText(String.valueOf(products.get(position).getPrice())+" TND");
//holder.image.setImageResource(products.get(position).getImage());

        holder.rating.setText(String.valueOf(products.get(position).getRating()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context contex;
                Intent  i = new Intent(v.getContext(),DetailedActivity.class);
                i.putExtra("prodname",products.get(position).getName());
                i.putExtra("priceprod",String.valueOf(products.get(position).getPrice()));
                i.putExtra("ratingprod",String.valueOf(products.get(position).getRating()));
                i.putExtra("desc",String.valueOf(products.get(position).getDescription()));
                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return products.size();
    }


}
