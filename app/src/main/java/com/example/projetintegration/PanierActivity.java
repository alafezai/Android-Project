package com.example.projetintegration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class PanierActivity extends AppCompatActivity {
    RecyclerView myrecy;
    ArrayList<productPanier> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panier);
        PanierAdapter productAdapter;
        products = new ArrayList<productPanier>();
        productPanier p1 = new productPanier("100" ,"100",R.drawable.tshirt,"Sweat à Capuche");
        productPanier p2 = new productPanier("100" ,"100",R.drawable.tshirt,"Sweat à Capuche");
        productPanier p3 = new productPanier("100" ,"100",R.drawable.tshirt,"Sweat à Capuche");
        productPanier p4 = new productPanier("100" ,"100",R.drawable.tshirt,"Sweat à Capuche");
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        myrecy = findViewById(R.id.recpanier);
        myrecy.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        productAdapter = new PanierAdapter(products,getApplicationContext());
        myrecy.setAdapter(productAdapter);


    }
}