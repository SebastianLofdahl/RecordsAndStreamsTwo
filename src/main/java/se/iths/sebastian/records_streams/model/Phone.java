package se.iths.sebastian.records_streams.model;

public class Phone {


    public record Phone(String brand, double price)
    String brand;
    String pris;

    public Phone( String brand, String pris)
    {
    this.brand = brand;
    this.pris = pris;



    }

}
