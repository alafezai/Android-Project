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

        RecyclerView myrecy;
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        // Inflate the layout for this fragment
        ArrayList<ProductModel> products;
        ProductAdapter productAdapter;
        products = new ArrayList<ProductModel>();

        ImageView img;


       /* ProductModel p1 = new ProductModel("Sweat à Capuche",400,R.drawable.manteau);
        ProductModel p2 = new ProductModel("Sweat à Capuche ",400,R.drawable.manteau);
        ProductModel p3 = new ProductModel("Sweat à Capuche ",400,R.drawable.manteau);
        ProductModel p4 = new ProductModel("Sweat à Capuche ",400,R.drawable.manteau);*/
        Context context;
     /*   products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);*/


         myrecy = rootView.findViewById(R.id.recl);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2,GridLayoutManager.VERTICAL,false);
        myrecy.setLayoutManager(gridLayoutManager);
        myrecy.setHasFixedSize(true);

        productAdapter = new ProductAdapter(products, rootView.getContext());
        myrecy.setAdapter(productAdapter);
        return rootView;
    }


}