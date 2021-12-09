package vijay.masai.meesho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import vijay.masai.meesho.R;

import java.util.ArrayList;

public class View_Devices extends AppCompatActivity {
    private TextView prodName, prodAmount;
    private ImageView prodImage, back;
    private Button addToCart, buyNow;
    private ImageView toCart;
    public static ArrayList<ProductRecyclerModel> cartList = new ArrayList<>();
    private Button go_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_devices);
        initView();
        setProdData();

        toCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(View_Devices.this, MyOrdersActivity.class);
                startActivity(intent);
            }
        });
        buyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(View_Devices.this, Order.class);
                startActivity(intent);
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(View_Devices.this, Product_Viewer.class);
                startActivity(intent);
            }
        });

        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int img = SharedPreferenceHelper.getIntegerPreference(View_Devices.this, "prodImgId");
                String name = SharedPreferenceHelper.getStringPreference(View_Devices.this, "prodNameId");
                int amount = (SharedPreferenceHelper.getIntegerPreference(View_Devices.this, "prodAmount"));
                ProductRecyclerModel prod = new ProductRecyclerModel(img, name, amount);
                MyOrdersActivity.cartList.add(prod);

                Toast.makeText(View_Devices.this, "added to cart", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setProdData() {
        int img = SharedPreferenceHelper.getIntegerPreference(View_Devices.this, "prodImgId");
        prodImage.setImageResource(img);

        String name = SharedPreferenceHelper.getStringPreference(View_Devices.this, "prodNameId");
        prodName.setText(name);

        String amount = (SharedPreferenceHelper.getIntegerPreference(View_Devices.this, "prodAmount")) + "";
        prodAmount.setText(amount);
    }

    private void initView() {
        toCart = findViewById(R.id.cart);
        back = findViewById(R.id.arrow);
        addToCart = findViewById(R.id.AddCart);
        buyNow = findViewById(R.id.BuyNow);
        prodName = findViewById(R.id.title);
        prodAmount = findViewById(R.id.amount);
        prodImage = findViewById(R.id.image1);
    }
}