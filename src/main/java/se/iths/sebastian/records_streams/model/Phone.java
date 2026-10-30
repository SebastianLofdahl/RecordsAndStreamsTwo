package se.iths.sebastian.records_streams.model;

public class Phone {
    String brand;
    String pris;


    public Phone( String brand, String pris)
    {
    this.brand = brand;
    this.pris = pris;

    public record Phone(String brand, double price)


    }

}
