package com.example.projetintegration;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PanierFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PanierFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PanierFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PanierFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PanierFragment newInstance(String param1, String param2) {
        PanierFragment fragment = new PanierFragment();
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
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_panier, container, false);

        RecyclerView myrecy;
        ArrayList<productPanier> products;
        PanierAdapter productAdapter;
        products = new ArrayList<productPanier>();
        productPanier p1 = new productPanier("100" ,"100",R.drawable.p0,"Sweat à Capuche");
        productPanier p2 = new productPanier("100" ,"100",R.drawable.p0,"Sweat à Capuche");
        productPanier p3 = new productPanier("100" ,"100",R.drawable.p0,"Sweat à Capuche");
        productPanier p4 = new productPanier("100" ,"100",R.drawable.p0,"Sweat à Capuche");
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        myrecy = rootView.findViewById(R.id.recpanier);
        myrecy.setLayoutManager(new LinearLayoutManager(getContext()));
        productAdapter = new PanierAdapter(products,getContext());
        myrecy.setAdapter(productAdapter);

        return rootView;
    }
}