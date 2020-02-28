package com.telran.project1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        int a = 10;
        System.out.println(a);
        System.out.println(a + " This is number " + a);
        System.out.println(a + "10");
        System.out.println(a + a);

        float f = 3.15f;
        long b = 182980373792l;

        boolean boo = 2 > 3;
        System.out.println(boo);

        int height = 175;

        if (height > 200) {
            System.out.println("Go to Circus");
        } else if (height < 150) {
            System.out.println("Go to  school");
        } else {
            System.out.println("Go to work");
        }

        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Please enter your age");
        age = scanner.nextInt();

        army(age);

        powerXY(3, 3);
        fan(3);

    }

    private static void powerXY(int x, int y) {
        int res = 1;
        for (int i = 1; i <= y; i++) {
            res = res * x;
        }
        System.out.println("Power is " + res);
    }

    private static void fan(int mode){
        switch (mode){
            case 0:
                System.out.println("fan is off");
                break;
            case 1:
                System.out.println("fan is min");
                break;
            case 2:
                System.out.println("fan is high");
                break;
            default:
                System.out.println("Wrong mode");
        }
    }
    private static void army(int age){
        if(age>=18 && age<=27){
            System.out.println("Go abroad!");
        }else{
            System.out.println("Lucky man");
        }
    }


}
