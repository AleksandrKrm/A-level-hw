package kramarenko.module2;

import java.util.Objects;

public class Television extends Product {
    private int diagonal;
    private String country;

    public Television(String productType, String series, String screenType, int price, int diagonal, String country) {
        super(productType, series, screenType, price);
        this.diagonal = diagonal;
        this.country = country;
    }

    public Television() {

    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.getProductType() + "{" +
                "series='" + super.getSeries() + '\'' +
                ", diagonal='" + diagonal + '\'' +
                ", screenType='" + super.getScreenType() + '\'' +
                ", country='" + country + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return diagonal == that.diagonal && country.equals(that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diagonal, country);
    }
}