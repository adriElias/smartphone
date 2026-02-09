package org.smartphone;

public class App {
    public static void main(String[] args) {
        System.out.println("---- Phone ----");
        Smartphone smartphone1 = new Smartphone("iPhone", "13 PRO MAX");
        smartphone1.call("72272232");
        smartphone1.takePhoto();
        smartphone1.alarm();

        System.out.println("---- Polymorphism ----");
        Phone phone1 = smartphone1;
        phone1.call("999999999");

        Camera camera1 = smartphone1;
        camera1.takePhoto();

        Clock clock1 = smartphone1;
        clock1.alarm();
    }
}
