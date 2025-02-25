package org.example;
import java.util.Date;

public class Product {
    String name, manufacturer, country;
    String date;
    double price;
    boolean status; //сделать отдельным методом проверки болни

    public Product(String name, String manufacturer, String country, String date, double price, boolean status) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.country = country;
        this.date = date;
        this.price =price;
        this.status = status;
    }

}
