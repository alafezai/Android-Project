package com.example.projetintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        Intent intent = getIntent();
        String name =intent.getStringExtra("prodname");
        String price =intent.getStringExtra("priceprod");
        String rating =intent.getStringExtra("ratingprod");
        String decription =intent.getStringExtra("desc");
        TextView naeme = findViewById(R.id.named);
        TextView pricev = findViewById(R.id.pricep);
        TextView ratingv = findViewById(R.id.ratingp);
        TextView decr = findViewById(R.id.decription);
        decr.setText(decription);
        pricev.setText(price);
        ratingv.setText(rating);
        naeme.setText(name);
    }
}