package com.masai.meesho;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import vijay.masai.meesho.MyOrdersActivity;
import vijay.masai.meesho.ProductOnClickListener;
import vijay.masai.meesho.ProductRecyclerAdapter;
import vijay.masai.meesho.ProductRecyclerModel;
import vijay.masai.meesho.SharedPreferenceHelper;
import vijay.masai.meesho.View_Devices;
import vijay.masai.meesho.firstPage;

public class Product_Viewer extends AppCompatActivity implements ProductOnClickListener {

    private TextView pageTitle;
    private ImageView back, toCart;

    private RecyclerView recyclerView;
    private ArrayList<ProductRecyclerModel> prodList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_viewer);
        initView();
        buildList();
        pageView();
        setRecyclerView();

        toCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vijay.masai.meesho.Product_Viewer.this, MyOrdersActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vijay.masai.meesho.Product_Viewer.this, firstPage.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        toCart = findViewById(R.id.cart);
        recyclerView = findViewById(R.id.productView_recycler);
        pageTitle = findViewById(R.id.heading);
        back = findViewById(R.id.arrow);
    }

    private void pageView() {
        String str = SharedPreferenceHelper.getStringPreference(vijay.masai.meesho.Product_Viewer.this, "prodName");
        pageTitle.setText(str);

    }

    private void setRecyclerView() {


        ProductRecyclerAdapter adapter = new ProductRecyclerAdapter(prodList, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
    

    private void buildList() {
        String str = SharedPreferenceHelper.getStringPreference(vijay.masai.meesho.Product_Viewer.this, "prodName");

            for (int i = 0; i < 2; i++) {
                ProductRecyclerModel mob1 = new ProductRecyclerModel(R.drawable.a1, "Chitraekha Graceful", 600);
                prodList.add(mob1);

                ProductRecyclerModel mob2 = new ProductRecyclerModel(R.drawable.a2, "Alisha Fabulous", 800);
                prodList.add(mob2);

                ProductRecyclerModel mob3 = new ProductRecyclerModel(R.drawable.a3, "Charvi Sarees", 466);
                prodList.add(mob3);

                ProductRecyclerModel mob4 = new ProductRecyclerModel(R.drawable.a4, "Aaagyeyi Refined Sarees", 897);
                prodList.add(mob4);

                ProductRecyclerModel mob5 = new ProductRecyclerModel(R.drawable.a6, "Aagyea Runed", 799);
                prodList.add(mob5);

                ProductRecyclerModel mob6 = new ProductRecyclerModel(R.drawable.a5, "Blul kkks", 544);
                prodList.add(mob6);

                ProductRecyclerModel mob7 = new ProductRecyclerModel(R.drawable.a7, "Top seller clothes", 750);
                prodList.add(mob7);

                ProductRecyclerModel mob8 = new ProductRecyclerModel(R.drawable.a8, "how looks it is ", 777);
                prodList.add(mob8);

                ProductRecyclerModel mob9 = new ProductRecyclerModel(R.drawable.a1, "Rolla Top", 999);
                prodList.add(mob9);

                ProductRecyclerModel mob10 = new ProductRecyclerModel(R.drawable.a3, "Of and to the", 777);
                prodList.add(mob10);


                for (int j = 0; j < 2; j++) {
                    ProductRecyclerModel tablet1 = new ProductRecyclerModel(R.drawable.a6, "Sarees kurti", 3500);
                    prodList.add(tablet1);

                    ProductRecyclerModel tablet2 = new ProductRecyclerModel(R.drawable.a5, "Top sellinng", 2100);
                    prodList.add(tablet2);

                    ProductRecyclerModel tablet3 = new ProductRecyclerModel(R.drawable.a4, "to Comfort ", 899);
                    prodList.add(tablet3);

                    ProductRecyclerModel tablet5 = new ProductRecyclerModel(R.drawable.a3, "Wear Now", 1169);
                    prodList.add(tablet5);

                    ProductRecyclerModel tablet4 = new ProductRecyclerModel(R.drawable.a1, "Blackia Clothes", 800);
                    prodList.add(tablet4);

                    ProductRecyclerModel tablet6 = new ProductRecyclerModel(R.drawable.a7, "to reacch Fashion", 1800);
                    prodList.add(tablet6);

                    ProductRecyclerModel tablet7 = new ProductRecyclerModel(R.drawable.a2, "Suit Sarres", 4500);
                    prodList.add(tablet7);

                    ProductRecyclerModel tablet8 = new ProductRecyclerModel(R.drawable.a2, "No for men", 2900);
                    prodList.add(tablet8);

                    ProductRecyclerModel tablet9 = new ProductRecyclerModel(R.drawable.a5, "Princess Suit", 3400);
                    prodList.add(tablet9);

                    ProductRecyclerModel tablet10 = new ProductRecyclerModel(R.drawable.a7, "to Party", 2500);
                    prodList.add(tablet10);


                    for (int k = 0; k < 3; k++) {
                        ProductRecyclerModel speakers1 = new ProductRecyclerModel(R.drawable.a5, "Zebronic Zee Count 764 Wires Bluetooth", 500);
                        prodList.add(speakers1);

                        ProductRecyclerModel speakers2 = new ProductRecyclerModel(R.drawable.a6, "BOAT stone 645 bluetooth portable", 500);
                        prodList.add(speakers2);

                        ProductRecyclerModel speakers3 = new ProductRecyclerModel(R.drawable.a7, "Pickada S106W54  764 Wires Bluetooth", 500);
                        prodList.add(speakers3);

                        ProductRecyclerModel speakers4 = new ProductRecyclerModel(R.drawable.a8, "ARYAN LOGISTIC GT-5 Bluetooth ", 900);
                        prodList.add(speakers4);

                        ProductRecyclerModel speakers5 = new ProductRecyclerModel(R.drawable.a5, "I Kall hf65 Bluetooth", 500);
                        prodList.add(speakers5);

                        ProductRecyclerModel speakers6 = new ProductRecyclerModel(R.drawable.a3, "Portinics sound quality Wireless Bluetooth", 500);
                        prodList.add(speakers6);

                        ProductRecyclerModel speakers7 = new ProductRecyclerModel(R.drawable.a1, "Zebronic Zee Count 764 Wires Bluetooth", 500);
                        prodList.add(speakers7);

                        ProductRecyclerModel speakers8 = new ProductRecyclerModel(R.drawable.a8, "ARYAN LOGISTIC GT-5 Bluetooth", 700);
                        prodList.add(speakers8);

                        ProductRecyclerModel speakers9 = new ProductRecyclerModel(R.drawable.a3, "I Kall hf65 Bluetooth", 500);
                        prodList.add(speakers9);

                        ProductRecyclerModel speakers10 = new ProductRecyclerModel(R.drawable.a1, "Portinics sound quality Wireless Bluetooth", 500);
                        prodList.add(speakers10);
                    }
                }
            }




        }


    @Override
    public void productOnClick(ProductRecyclerModel productRecyclerModel, int position) {
        String str = productRecyclerModel.getProdName() + "  " + position;
        SharedPreferenceHelper.writeIntegerPreference(vijay.masai.meesho.Product_Viewer.this, "prodImgId", productRecyclerModel.getImgId());
        SharedPreferenceHelper.writeStringPreference(vijay.masai.meesho.Product_Viewer.this, "prodNameId", productRecyclerModel.getProdName());
        SharedPreferenceHelper.writeIntegerPreference(vijay.masai.meesho.Product_Viewer.this, "prodAmount", productRecyclerModel.getAmount());
        Intent intent = new Intent(vijay.masai.meesho.Product_Viewer.this, View_Devices.class);
        startActivity(intent);
    }
}