package com.pluralsight;

public class Reservation {


    private String roomType; // "king" or "double"
    private int numberOfNights;
    private boolean isWeekend;


    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;



    }


    public double getPrice() {
        double basePrice = roomType.equals("king") ? 139.00 : 124.00;
        if (isWeekend) {
            basePrice *= 1.10; // 10% increase
        }
        return basePrice;
    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }
}

