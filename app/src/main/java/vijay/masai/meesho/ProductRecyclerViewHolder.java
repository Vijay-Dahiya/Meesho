package vijay.masai.meesho;


import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import vijay.masai.meesho.R;

public class ProductRecyclerViewHolder extends RecyclerView.ViewHolder {

    private ProductOnClickListener productOnClickListener;
    private LinearLayout linearLayout;
    private ImageView img;
    private TextView ivProdName, ivProdAmount;

    public ProductRecyclerViewHolder(@NonNull View itemView, ProductOnClickListener productOnClickListener) {
        super(itemView);
        this.productOnClickListener = productOnClickListener;
        initView(itemView);

    }

    private void initView(View itemView) {
        img = itemView.findViewById(R.id.ItemImage);
        ivProdName = itemView.findViewById(R.id.name);
        ivProdAmount = itemView.findViewById(R.id.textView);
        linearLayout = itemView.findViewById(R.id.cart_item_layout);
    }

    public void setData(ProductRecyclerModel productRecyclerModel) {
        img.setImageResource(productRecyclerModel.getImgId());
        ivProdName.setText(productRecyclerModel.getProdName());
        ivProdAmount.setText(productRecyclerModel.getAmount() + "");
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productOnClickListener.productOnClick(productRecyclerModel, getAdapterPosition());
            }
        });
    }
}
