package com.example.projetintegration;

import android.content.Context;
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
        public rcyview(@NonNull View view, ProductAdapter Prroductradapter) {
            super(view);
            descr = view.findViewById(R.id.desc);
            price = view.findViewById(R.id.price);
            image = view.findViewById(R.id.imageView);

        }
    }
    ArrayList<Product> products;

   Context contex;
    public  ProductAdapter(ArrayList<Product> products, Context context){
        this.products = products;
        this.contex = context;
    }

    @NonNull
    @Override
    public rcyview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new rcyview(LayoutInflater.from(parent.getContext()).inflate(R.layout.product, parent, false), this);
    }

    @Override
    public void onBindViewHolder(@NonNull rcyview holder, int position) {
holder.descr.setText(products.get(position).getDescription());
holder.price.setText(String.valueOf(products.get(position).getPrice())+" TND");
holder.image.setImageResource(products.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }


}
