package com.example.projetintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

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
        String image = intent.getStringExtra("image");
        TextView naeme = findViewById(R.id.named);
        TextView pricev = findViewById(R.id.pricep);
        TextView ratingv = findViewById(R.id.ratingp);
        TextView decr = findViewById(R.id.decription);
        ImageView img = findViewById(R.id.detailed_img);
        decr.setText(decription);
        pricev.setText(price+" TND");
        ratingv.setText("Rating: "+rating+" / 5.0");
        naeme.setText(name);
        Glide.with(getApplicationContext()).load(image).into(img);

    }
}