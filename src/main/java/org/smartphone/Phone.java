package org.smartphone;

public class Phone implements Camera, Clock {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void calls(int number){
        System.out.println("Calling: " + number);
    }
    @Override
    public void takePhoto(){
        System.out.println("Taking a photo");
    }

    @Override
    public void alarm(){
        System.out.println("Ringing alarm");
    }

}
