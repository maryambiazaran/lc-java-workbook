package org.launchcode.java.examples;

import java.util.Scanner;

public class LoopsApp {

    public static void main (String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println(i+" ");
        }

        Scanner sc = new Scanner(System.in);

        /*
        String response = "";
        while (!response.equals("y") && !response.equals("n")) {
            System.out.print("Do you accept? [y|n] ");
            response = sc.next();
            if (!response.equals("y") && !response.equals("n")) {
                System.out.println("You must answer y or n ");
            }

        }
        System.out.println("Thank you!");

        */

        String response;
        do {
            System.out.print("Do you accept? [y|n] ");
            response = sc.next();

            if (!response.equals("y") && !response.equals("n")) {
                System.out.println("You must answer y or n ");
            }
        } while (!response.equals("y") && !response.equals("n"));
        System.out.println("Thank you!");
    }
}
