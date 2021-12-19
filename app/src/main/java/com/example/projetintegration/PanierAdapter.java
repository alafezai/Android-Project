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

public class PanierAdapter extends RecyclerView.Adapter<PanierAdapter.rcyview>{


    public static class rcyview extends RecyclerView.ViewHolder {
        TextView price;
        TextView priceTotal;
        ImageView image;
        TextView title;
        ProductAdapter myadapter;
        public rcyview(@NonNull View view, PanierAdapter panierAdapter) {
                super(view);
                title = view.findViewById(R.id.title);
                price = view.findViewById(R.id.pricepiece);
                priceTotal = view.findViewById(R.id.pricetotale);
                image = view.findViewById(R.id.imageProductPanier);

        }
    }
ArrayList<productPanier> ar;
    Context contex;
    public PanierAdapter(ArrayList<productPanier> ar ,Context context){
this.ar = ar;
this.contex = context;
    }

    @NonNull
    @Override
    public PanierAdapter.rcyview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PanierAdapter.rcyview(LayoutInflater.from(parent.getContext()).inflate(R.layout.itempanier, parent, false), this);
    }

    @Override
    public void onBindViewHolder(@NonNull PanierAdapter.rcyview holder, int position) {
        holder.title.setText(ar.get(position).getTitle());
        holder.price.setText(ar.get(position).getPrice());
        holder.priceTotal.setText(ar.get(position).getPriceTotal());
        holder.image.setImageResource(ar.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return ar.size();
    }
}
