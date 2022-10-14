package com.binus.oopexample;

abstract public class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private float bonus = 0.0F;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public static float calculateBonus(float oldEarnings, double increaseRate) {
        return (float) (oldEarnings * (increaseRate / 100));
    }

    abstract float earnings();
    abstract String toEmployeeString();
}
