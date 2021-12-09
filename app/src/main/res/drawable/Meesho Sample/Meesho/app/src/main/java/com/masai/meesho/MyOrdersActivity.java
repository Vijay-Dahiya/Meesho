package com.masai.meesho;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

import vijay.masai.meesho.CartAdapter;
import vijay.masai.meesho.ProductOnClickListener;
import vijay.masai.meesho.ProductRecyclerModel;

public class MyOrdersActivity extends AppCompatActivity implements ProductOnClickListener {
    private RecyclerView recyclerView;
    private ImageView back;
    CartAdapter cartAdapter;

    public static ArrayList<ProductRecyclerModel> cartList = new ArrayList<>();
    private Button go_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);
    }

    @Override
    public void productOnClick(ProductRecyclerModel productRecyclerModel, int position) {

    }
}