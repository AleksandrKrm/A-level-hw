package kramarenko.module2;

import java.util.List;

public class Invoice {
    private List<Product> product;
    private Customer customer;
    private String type;

    public Invoice(List<Product> product, Customer customer, String type) {
        this.product = product;
        this.customer = customer;
        this.type = type;
    }

    public Invoice() {

    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "product=" + product +
                ", customer=" + customer +
                ", type='" + type + '\'' +
                '}';
    }
}
