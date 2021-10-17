package kramarenko.module2;

import java.util.Objects;

public class Telephone extends Product{
    private String model;

    public Telephone(String productType, String series, String screenType, int price, String model) {
        super(productType, series, screenType, price);
        this.model = model;
            }

    public Telephone() {
        super();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.getProductType() + "{" +
                "series='" + super.getSeries() + '\'' +
                ", model=" + model + '\'' +
                ", screenType='" + super.getScreenType() + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telephone telephone = (Telephone) o;
        return Objects.equals(model, telephone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}