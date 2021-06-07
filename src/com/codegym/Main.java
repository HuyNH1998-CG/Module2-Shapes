package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Balanced triangle");
            System.out.println("0.Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j < 8; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                case 3 -> {
                    for (int i = 7; i >= 0; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                case 4 -> {
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i + 1; k++) {
                            System.out.print("*");
                            if (k != 1) {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                }
                case 0 -> System.exit(0);
            }
        }
    }
}
