package com.binus.oopexample;

public class CommissionEmployee extends Employee {
    private float sales;
    private double rate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, float sales, double rate) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialSecurityNumber(socialSecurityNumber);
        setSales(sales);
        setRate(rate);
    }

    public void setSales(float sales) {
        this.sales = sales;
    }

    public float getSales() {
        return sales;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }


    @Override
    float earnings() {
        return (float) (getRate() * getSales());
    }

    @Override
    String toEmployeeString() {
        String name = getFirstName() + " " + getLastName();
        String str = "Commision employee:\n" +
                "Name: " + name + "\n" +
                "Salary: " + earnings();
        return str;
    }
}
