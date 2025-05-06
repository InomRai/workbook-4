package com.pluralsight;

public class Employee {

    private int employeeID;
    private String name;
    private String department;
    private double payRtae;
    private double workedHoures;


    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRtae() {
        return payRtae;
    }

    public double getWorkedHoures() {
        return workedHoures;
    }

    public Employee(int employeeID, String name, String department, double payRtae, double workedHoures) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRtae = payRtae;
        this.workedHoures = workedHoures;

    }


    public double getRegularHours() {
        return Math.min(40, workedHoures);
    }

    public double getOvertimeHours() {
        return Math.max(0, workedHoures - 40);
    }

    public double getTotalPay() {
        return getRegularHours() * payRtae + getOvertimeHours() * payRtae * 1.5;
    }
}

