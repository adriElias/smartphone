package org.smartphone;

public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo");
    }

    @Override
    public void alarm() {
        System.out.println("Ringing alarm");
    }
}
