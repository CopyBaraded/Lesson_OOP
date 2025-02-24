package org.example;
import java.util.Date;

public class Product {
    String name, manufacturer, country;
    Date date;
    double price;
    boolean status; //сделать отдельным методом проверки болни

    public Product(String name, String manufacturer, String country, Date date, double price, boolean status) {
        name = name;
        manufacturer = manufacturer;
        country = country;
        date = date;
        price =price;
        status = status;
    }
}
