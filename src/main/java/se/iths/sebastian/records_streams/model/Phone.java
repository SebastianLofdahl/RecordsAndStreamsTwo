package se.iths.sebastian.records_streams.model;

public class Phone {
    String brand;
    String price;

    public Phone(String brand, String pris) {
        this.brand = brand;
        this.price = price;

        record Phon1e(String brand, double price) {
        }

    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';


    }
}