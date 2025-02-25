package org.example;

public class Product {
    private String name, manufacturer, country;
    private String date;
    private double price;
    private boolean status; //сделать отдельным методом проверки болни

    public Product(String name, String manufacturer, String country, String date, double price, boolean status) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.country = country;
        this.date = date;
        this.price =price;
        this.status = status;
    }

    public void productInfo() {
        System.out.printf("Название: " + name
                + " Производитель: " + manufacturer
                + " Страна происхождения: " + country
                + " Дата производства: " + date
                + " Цена: " + price
                + " Состояние бронирования: " + status);
    }

}
