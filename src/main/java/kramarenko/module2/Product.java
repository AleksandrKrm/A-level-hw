package kramarenko.module2;

public class Product {
    private String productType;
    private String series;
    private String screenType;
    private int price;

    public Product(String productType, String series, String screenType, int price) {
        this.productType = productType;
        this.series = series;
        this.screenType = screenType;
        this.price = price;
    }

    public Product() {

    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
