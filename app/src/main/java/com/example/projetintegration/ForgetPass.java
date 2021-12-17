package com.example.projetintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgetPass extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);
    }

    @Override
    public void onClick(View view) {
        Intent inte = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(inte);
    }
}