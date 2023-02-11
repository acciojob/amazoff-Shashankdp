package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

        this.id=id;

        String []hoursMin=deliveryTime.split(":");
        int hour=Integer.parseInt(hoursMin[0]);
        int minutes=Integer.parseInt(hoursMin[1]);

        this.deliveryTime=hour*60+minutes;

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}
