package vijay.masai.meesho;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import vijay.masai.meesho.R;

public class CartViewHolder extends RecyclerView.ViewHolder {

    private ProductOnClickListener productOnClickListener;
    private Button remove;
    private ImageView img;
    private TextView ivProdName, ivProdAmount;

    public CartViewHolder(@NonNull View itemView, ProductOnClickListener productOnClickListener) {
        super(itemView);
        this.productOnClickListener = productOnClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        img = itemView.findViewById(R.id.ItemImage);

    }

    public void setCartData(ProductRecyclerModel productRecyclerModel) {
        img.setImageResource(productRecyclerModel.getImgId());
        ivProdName.setText(productRecyclerModel.getProdName());
        ivProdAmount.setText(productRecyclerModel.getAmount() + "");

    }


}
