package com.binus.learnprogramming;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

    public static void main(String[] args) throws IOException {
        final double PI = 3.14159;

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        out.println("Enter a number for radius: ");
        double radius = 0.0;
        try {
            radius = in.nextDouble();
        } catch(Exception e) {
           throw new IOException("Input must a double");
        }

        double area = radius * radius * PI;

        String result = String.format("The area for the circle of radius: %s", area);
        out.println(result);
    }
}