package com.binus.oopexample;

import java.util.ArrayList;
import java.util.HashMap;

public class Payroll {

    public static void main(String[] args) {

        SalariedEmployee employeeOne = new SalariedEmployee("John", "Smith", "111-11-111", 800, 80);
        CommissionEmployee employeeTwo = new CommissionEmployee("Sue", "Jones", "333-33-333", 10000, 0.6);
        SalariedEmployee employeeThree = new SalariedEmployee("John", "Doe", "111-22-111", 600, 100);
        BaseCommissionEmployee employeeFour = new BaseCommissionEmployee("Bob", "Lewis", "444-44-444", 300, 0.4, 300);

        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(employeeOne);
        employeeList.add(employeeTwo);
        employeeList.add(employeeThree);
        employeeList.add(employeeFour);

        HashMap<String, Double> increaseSalaryRate = new HashMap();

        // set increase salary rate per employee type
        increaseSalaryRate.put(SalariedEmployee.class.getName(), 0.0);
        increaseSalaryRate.put(CommissionEmployee.class.getName(), 0.0);
        increaseSalaryRate.put(BaseCommissionEmployee.class.getName(), 10.0);

        float bonus = 0.0F;
        Double currentSalaryRate = 0.0;
        for (Employee employee: employeeList) {

            // calculate bonus
            float oldEarnings = employee.earnings();
            currentSalaryRate = increaseSalaryRate.get(employee.getClass().getName());
            if (currentSalaryRate != 0.0) {
                bonus = Employee.calculateBonus(oldEarnings, currentSalaryRate);
            }
            employee.setBonus(bonus);

            System.out.println(employee.toEmployeeString());
        }
    }
}
