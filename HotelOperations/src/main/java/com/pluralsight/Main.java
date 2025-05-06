package com.pluralsight;

public class Main {
    public static void main(String[] args) {


        // Test Room
        Room room1 = new Room(2, 150.0, false, false);
        System.out.println("Room Available: " + room1.isAvailable());

        // Test Reservation
        Reservation reservation = new Reservation("king", 3, true);
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Price per Night: $" + reservation.getPrice());
        System.out.println("Total: $" + reservation.getReservationTotal());

        // Test Employee
        Employee employee = new Employee(101, "Alice", "Front Desk", 20.0, 45.0);
        System.out.println("Regular Hours: " + employee.getRegularHours());
        System.out.println("Overtime Hours: " + employee.getOvertimeHours());
        System.out.println("Total Pay: $" + employee.getTotalPay());
    }
}


