import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class Main {

    /* Convert to whole cents, round up, and return converted back to decimal */
    public static double money(double in) {
        return ((double) (Math.ceil(in * 100))) / 100;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount?");
        int amount = in.nextInt();
        System.out.printf("Amount: %d\n", amount);
        in.nextLine();
        System.out.print("What state do you live in?");
        String state = in.nextLine();
        double tax = 0;
        if (state.equals("Wisconsin")) {
            tax += 0.05;
            System.out.print("What county do you live in?");
            String county = in.nextLine();
            if (county.equals("Eau Claire")) {
                tax += 0.005;
            } else if (county.equals("Dunn")) {
                tax = 0.004;
            }
        } else if (state.equals("Illinois")) {
            tax += 0.08;
        }

        System.out.printf("The tax is $%.2f\n", money(amount * tax));
        System.out.printf("The total is $%.2f\n", money(amount * (1 + tax)));
        in.close();
    }
}
