package com.binus.oopexample;

public class SalariedEmployee extends Employee {

    private float weeklySalary;
    private float attendeePercentage;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, float salary, float attendeePercentage) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialSecurityNumber(socialSecurityNumber);
        setWeeklySalary(salary);
        setAttendeePercentage(attendeePercentage);
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

    public void setAttendeePercentage(float percentageOfficeEntry) {
        this.attendeePercentage = percentageOfficeEntry;
    }

    public float getAttendeePercentage() {
        return attendeePercentage;
    }

    @Override
    float earnings() {
        return getWeeklySalary() * (getAttendeePercentage() / 100) + getBonus();
    }

    @Override
    String toEmployeeString() {
        String name = getFirstName() + " " + getLastName();
        String str = "Salaried employee:\n" +
                "Name: " + name + "\n" +
                "Bonus: " + getBonus() + "\n" +
                "salary: " + earnings();
        return str;
    }
}
