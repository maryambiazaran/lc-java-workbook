package org.launchcode.java.examples;

import java.util.Scanner;

public class SwitchExampleApp {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int someValue = sc.nextInt();
        switch (someValue) {
            case 5:
                System.out.println(5);
                break;
            case 4:
                System.out.println(4);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Bad Mike!");
                break;
        }
    }
}
