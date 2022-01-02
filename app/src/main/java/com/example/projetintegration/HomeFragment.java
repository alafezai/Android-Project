package com.example.projetintegration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Context Context;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        // Inflate the layout for this fragment
        ArrayList<ProductModel> products;
        products = new ArrayList<ProductModel>();

        ImageView img;


       /* ProductModel p1 = new ProductModel("Sweat à Capuche",400,R.drawable.manteau);
        ProductModel p2 = new ProductModel("Sweat à Capuche ",400,R.drawable.manteau);
        ProductModel p3 = new ProductModel("Sweat à Capuche ",400,R.drawable.manteau);
        ProductModel p4 = new ProductModel("Sweat à Capuche ",400,R.drawable.manteau);*/
     /*   products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);*/












        StringRequest stringRequest = new
                StringRequest(Request.Method.GET,"http://192.168.56.1:8084/Products", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                JSONArray array = null;
                //SimpleDateFormat record_timestamp = new SimpleDateFormat();
                try {
                    array = new JSONArray(response);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                for(int i =0;i<array.length();i++){
                    JSONObject object = null;
                    try {
                        object = array.getJSONObject(i);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    String name = "";
                    try {
                        name = object.getString("name");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    String description = "";
                    try {
                        description = object.getString("description");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    double price = 0;
                    try {
                        price = object.getDouble("price");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    String imagep = "";
                    try {
                        imagep = object.getString("imagep");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    int rating = 0;
                    try {
                        rating = object.getInt("rating");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }


                    // String datec ;
                           /* Long datec = null;
                                Long datec = null;
                            try {
                                datec = object.getLong("datecreation");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }*/

                    //Date date = new Date(datec);
                    //Date a = Date.valueOf(datec);
                    // String description, double price, Integer image,String name,Integer rating){
                    ProductModel pm = new ProductModel(description,price,imagep,name,rating);
                    products.add(pm);

                }
               /* RecyclerView myrecy = findViewById(R.id.ry);
                myrecy.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                customeradapter =new customeradapter(ar,getApplicationContext());
                myrecy.setAdapter(customeradapter);*/
                RecyclerView myrecy;
                ProductAdapter productAdapter;
                myrecy = rootView.findViewById(R.id.recl);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2,GridLayoutManager.VERTICAL,false);
                myrecy.setLayoutManager(gridLayoutManager);
                myrecy.setHasFixedSize(true);

                System.out.println("jawou bhy");
                productAdapter = new ProductAdapter(products, rootView.getContext());
                myrecy.setAdapter(productAdapter);
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {


                        System.out.println("l3assba");
                    }
                });
        Volley.newRequestQueue(getContext()).add(stringRequest);

        return rootView;

    }







}