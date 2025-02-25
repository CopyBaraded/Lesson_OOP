package org.example;
/*
Task 5 Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах:
 времени их работы и стоимости.
 */

public class Park {
    private String namePark;
    public Park (String name){
        this.namePark = name;
    }
    public class SaveInfoPark {
        private String nameAttraction;
        private String time;
        private double price;
        public SaveInfoPark (String nameAttraction, String time, double price){
            this.nameAttraction = nameAttraction;
            this.time = time;
            this.price = price;
        }
    }


}
