package org.niit;

public class Product {
    private int productId;
    private String productName;
    private Double price;

    public Product(int productId, String productName, Double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
