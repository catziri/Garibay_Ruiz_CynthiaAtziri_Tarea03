package com.iteso.pdm18_scrollabletabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iteso.pdm18_scrollabletabs.beans.ItemProduct;

import java.util.ArrayList;

public class TechnologyFragment extends Fragment {

    public TechnologyFragment() {

    }

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_technology, container, false);
        RecyclerView recyclerView = (RecyclerView)
                view.findViewById(R.id.fragment_recycler_view);
        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // Use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        ArrayList<ItemProduct> myDataSet = new ArrayList<ItemProduct>();
        ItemProduct itemProduct = new ItemProduct();
        itemProduct.setTitle("MacBook Pro 17\"");
        itemProduct.setStore("BestBuy");
        itemProduct.setLocation("Zapopan, Jalisco");
        itemProduct.setPhone("3314748908");
        itemProduct.setImage(0);
        itemProduct.setDescription("Llevate esta Mac con un 30% de descuento para que puedas programar para XCode y Android sin tener que batallar tanto como en tu Windows");
        myDataSet.add(itemProduct);
        ItemProduct itemProduct2 = new ItemProduct();
        itemProduct2.setTitle("Alienware\"");
        itemProduct2.setStore("BestBuy");
        itemProduct2.setLocation("Guadalajara, Jalisco");
        itemProduct2.setPhone("3310156716");
        itemProduct2.setImage(1);
        itemProduct2.setDescription("Llevate esta Alienware con un 50% de descuento");
        myDataSet.add(itemProduct2);
        ItemProduct itemProduct3 = new ItemProduct();
        itemProduct3.setTitle("MacBook Pro 17\"");
        itemProduct3.setStore("BestBuy");
        itemProduct3.setLocation("Zapopan, Jalisco");
        itemProduct3.setPhone("3314748908");
        itemProduct3.setImage(0);
        itemProduct3.setDescription("Llevate esta Mac con un 30% de descuento para que puedas programar para XCode y Android sin tener que batallar tanto como en tu Windows");
        myDataSet.add(itemProduct3);
        mAdapter = new AdapterProduct(getActivity(), myDataSet);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}
