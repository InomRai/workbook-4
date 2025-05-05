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
}
