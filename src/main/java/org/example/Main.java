package org.example;
/*
Task 4 Создать массив из 5 товаров.
Пример:
вначале объявляем массив объектов
Product[] productsArray = new Product[5];
потом для каждой ячейки массива задаем объект
productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
"Samsung Corp.", "Korea", 5599, true);
productsArray[1] = new Product(...);
productsArray[4] = new Product(...);
 */



public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Sums S25 U", "Sum corp.", "Asia", "13.01.2025", 2500, false);

        productsArray[0].productInfo();

    }
}