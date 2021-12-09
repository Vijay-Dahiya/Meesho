package vijay.masai.meesho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import vijay.masai.meesho.R;

public class firstPage extends AppCompatActivity {
    protected ImageView  fpIvAllCategories, ivMenu, ivCart, ivTablets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        initView();
    }

    private void initView() {
        fpIvAllCategories = findViewById(R.id.ivMobiles);
        ivMenu = findViewById(R.id.ivHomeAndKitchen);
        ivCart = findViewById(R.id.ivCart);
        ivTablets = findViewById(R.id.ivFashion);
        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstPage.this, Product_Viewer.class);
                startActivity(intent);
            }
        });
        ivTablets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferenceHelper.writeStringPreference(firstPage.this, "prodName", "Tablets");
                Intent intent = new Intent(firstPage.this, Product_Viewer.class);
                startActivity(intent);
            }
        });

        fpIvAllCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstPage.this, Product_Viewer.class);
                startActivity(intent);
            }
        });


        ivCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstPage.this, MyOrdersActivity.class);
                startActivity(intent);
            }
        });

    }
}