package com.binus.learnprogramming;

import java.util.Scanner;

class Stage {
    int number;
}

public class Level {

    public static void main(String[] args) {
        Stage t1 = new Stage();
        Scanner in = new Scanner(System.in);
        t1.number = in.nextInt();
        System.out.println("Stage is " + t1.number);

        if (t1.number == 1) {
            System.out.println("Stage is 1");
        } else if (t1.number == 2) {
            System.out.println("Stage is 2");
        } else {
            System.out.println("Stage is some number");
        }

        switch (t1.number) {
            case 1: System.out.println("Stage is 1");
            case 2: System.out.println("Stage is 2");
            default: System.out.println("Stage is some number");
        }

        for (int i=0; i < 10; i++) {
            System.out.println("Stage is " + t1.number);
        }
        int i = 0;
        while (i < 10) {
            System.out.println("Stage is " + t1.number);
            i ++;
        }
    }
}

