package com.binus.oopexample;

public class BaseCommissionEmployee extends CommissionEmployee {

    private float baseSalary;

    public BaseCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, float sales, double rate, float salary) {
        super(firstName, lastName, socialSecurityNumber, sales, rate);
        setBaseSalary(salary);
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    @Override
    float earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    String toEmployeeString() {
        String name = getFirstName() + " " + getLastName();
        String str = "BaseCommision employee:\n" +
                "Name: " + name + "\n" +
                "Salary: " + earnings();
        return str;
    }
}