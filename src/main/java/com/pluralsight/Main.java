package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                //  step 1 print  sandwich size then assign what's the next step
                System.out.println("What size of sandwich would you like? : 1 or 2? ");
                int size = scanner.nextInt();
                scanner.nextLine();

                double price = 0;
                if (size == 1) {
                    price = 5.45;
                } else if (size == 2) {
                    price = 8.95;
                } else {
                    System.out.println(" Please go back and choose a size");
                }
                //
                 // After size lets print the age of the user


                // Ask if they want loaded sandwich
                System.out.println("Do you want your sandwich loaded (y/n): ");
                String loaded = scanner.nextLine();

                if (loaded.equalsIgnoreCase("y")) {
                    if (size == 1) {
                        price += 1.00;
                        System.out.println(" loaded regular sandwich add 1.00: ");
                    } else if (size == 2) {
                        price += 1.75;
                        System.out.println(" loaded large sandwich we will add a $1.75");
                    }
                }

                // Get age for discount
                System.out.println("Enter your age: ");
                int age = scanner.nextInt();

                double discount = 0;
                if (age <= 17) {
                    discount = 0.10; // 10% discount
                    System.out.println("Student gets 10% off");
                } else if (age >= 65) {
                    discount = 0.20; // 20% discount
                    System.out.println("Senior gets 20% off");
                } else {
                    System.out.println("No discount");
                }

                // calculate final price

                double discountPrice = price * discount;
                double finalPrice = price - discount;

                System.out.println("\n--------------");
                System.out.printf("Subtotal: $%.2f%n", price);
                if (discount > 0) {
                System.out.printf("Discount: -$%.2f%n", discount);
        }
                System.out.printf("Total: $%.2f%n", finalPrice);


                }
            }

