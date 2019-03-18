package model;

public class Product {
    int id;
    String type;
    String brand;
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int id, String type, String brand, int price) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    public Product() {
    }

    public Product(int id, String type, String brand) {
        this.id = id;
        this.type = type;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
