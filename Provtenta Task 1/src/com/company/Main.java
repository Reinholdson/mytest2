package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Customer [] seats = new Customer[100];

        int choice = 0;
        do

        {
            menuPrompt();
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Please, enter your name: ");
                    String name = input.next();
                    System.out.println("Please, enter your selected seat: ");
                    int seat = input.nextInt();

                    if (seats[seat] == null) {
                        seats[seat] = new Customer(name);
                    }
                    else {
                        System.out.println("Seat taken, choose another.");
                        menuPrompt();
                    }

                    break;
                case 2:
                    System.out.println("Display bookings: ");

                    for (int i = 0; i < seats.length; i++){
                        if(seats[i] == null){
                            System.out.println("[" + i + "] Not Booked");
                        }
                        else{
                            System.out.println("[" + i + "] " + seats[i].getName());
                        }

                    }

                    break;
                case 3:
                    System.out.println("Thank you! Have a good flight!");
                    break;
                    default:
                        System.out.println("Invalid selection.");
                        break;
            }
            System.out.println();
        }while (choice != 0);

    }
            private static void menuPrompt(){
            System.out.println("1 >> Add booking");
            System.out.println("2 >> View bookings");
            System.out.println("3 >> Exit");

        }

    }

