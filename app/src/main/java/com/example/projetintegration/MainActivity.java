package com.example.projetintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        Intent inte = new Intent(getApplicationContext(),Singup.class);
        startActivity(inte);
    }



    public void onClickHome(View view){
        Intent inte = new Intent(getApplicationContext(),Home.class);
        startActivity(inte);
    }



}