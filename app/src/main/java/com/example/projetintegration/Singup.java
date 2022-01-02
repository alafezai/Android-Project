package com.example.projetintegration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputEditText;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Singup extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
    }

    @Override
    public void onClick(View view) {


        TextInputEditText user = findViewById(R.id.usernane);
        TextInputEditText pass = findViewById(R.id.passs);
        TextInputEditText cpass = findViewById(R.id.cpasss);

        try {
            register(user.getText().toString(),pass.getText().toString(),cpass.getText().toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }




    public void register(String usern,String pass ,String cpass) throws JSONException {
        String postUrl = "http://10.0.2.2:8084/register";
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        JSONObject postData = new JSONObject();

            postData.put("username", usern);
        postData.put("password", pass);
        postData.put("confirmedPassword",cpass);



        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, postUrl, postData, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
               Toast.makeText(getApplicationContext(),"register successfully", Toast.LENGTH_LONG).show();
                Intent inte = new Intent(getApplicationContext(),Home.class);
                startActivity(inte);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "l3asba", Toast.LENGTH_LONG).show();
            }
        });

        requestQueue.add(jsonObjectRequest);

    }

}