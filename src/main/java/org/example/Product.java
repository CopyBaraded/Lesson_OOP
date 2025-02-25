package org.example;
/*
Task 1 Создать класс "Товар" с полями: название, дата производства, производитель, страна происхождения, цена, состояние бронирования покупателем.
Task 2 Конструктор класса должен заполнять эти поля при создании объекта. (в Main)
Task 3 Внутри класса «Товар» написать метод, который выводит информацию об объекте в консоль.

3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
 */

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
