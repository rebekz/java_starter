package com.binus.oopexample;

import java.io.PrintWriter;

public class SalariedEmployee extends Employee {

    private float weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, float salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialSecurityNumber(socialSecurityNumber);
        setWeeklySalary(salary);
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

    @Override
    float earnings() {
        return getWeeklySalary();
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
