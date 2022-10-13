package com.binus.oopexample;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Payroll {
    public static void main(String[] args) {

        SalariedEmployee employeeOne = new SalariedEmployee("John", "Smith", "111-11-111", 800);
        CommissionEmployee employeeTwo = new CommissionEmployee("Sue", "Jones", "333-33-333", 10000, 0.6);

        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(employeeOne);
        employeeList.add(employeeTwo);

        for (Employee employee: employeeList) {

            System.out.println(employee.toEmployeeString());

        }
    }
}
