package com.binus.oopexample;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Payroll {

    public static void main(String[] args) {

        SalariedEmployee employeeOne = new SalariedEmployee("John", "Smith", "111-11-111", 800, 80);
        SalariedEmployee employeeThree = new SalariedEmployee("John", "Doe", "111-22-111", 600, 100);
        CommissionEmployee employeeTwo = new CommissionEmployee("Sue", "Jones", "333-33-333", 10000, 0.6);
        BaseCommissionEmployee employeeFour = new BaseCommissionEmployee("Bob", "Lewis", "444-44-444", 300, 0.4, 300);

        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(employeeOne);
        employeeList.add(employeeThree);
        employeeList.add(employeeTwo);
        employeeList.add(employeeFour);

        for (Employee employee: employeeList) {
            if (employee instanceof BaseCommissionEmployee) {
                float oldEarnings = employee.earnings();
                float bonus = (float) (0.1 * oldEarnings);
                ((BaseCommissionEmployee) employee).setBaseSalary(oldEarnings+bonus);
            }

            System.out.println(employee.toEmployeeString());
        }
    }
}
