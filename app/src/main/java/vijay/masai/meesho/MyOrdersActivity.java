package vijay.masai.meesho;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import vijay.masai.meesho.R;

import java.util.ArrayList;

public class MyOrdersActivity extends AppCompatActivity implements ProductOnClickListener{
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