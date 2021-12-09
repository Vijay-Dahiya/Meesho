package vijay.masai.meesho;

public class ProductRecyclerModel {

    private int imgId;
    private String prodName;
    private int amount;

    public ProductRecyclerModel(int imgId, String prodName, int amount) {
        this.imgId = imgId;
        this.prodName = prodName;
        this.amount = amount;

    }

    public int getImgId() {
        return imgId;
    }

    public String getProdName() {
        return prodName;
    }

    public int getAmount() {
        return amount;
    }

}
