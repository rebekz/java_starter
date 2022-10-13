package com.binus.oopexample;

import java.io.PrintWriter;

public class SalariedEmployee extends Employee {

    private float weeklySalary;
    private float percentageAttendee;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, float salary, float percentageAttendee) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialSecurityNumber(socialSecurityNumber);
        setWeeklySalary(salary);
        setPercentageAttendee(percentageAttendee);
    }
    public void setWeeklySalary(float salary) {
        if (salary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }

        weeklySalary = salary;
    }

    public float getWeeklySalary() {
        return weeklySalary;
    }

    public void setPercentageAttendee(float percentageOfficeEntry) {
        this.percentageAttendee = percentageOfficeEntry;
    }

    public float getPercentageAttendee() {
        return percentageAttendee;
    }

    @Override
    float earnings() {
        return getWeeklySalary() * (getPercentageAttendee() / 100);
    }

    @Override
    String toEmployeeString() {
        String name = getFirstName() + " " + getLastName();
        String str = "Salaried employee:\n" +
                "Name: " + name + "\n" +
                "salary: " + earnings();
        return str;
    }
}
