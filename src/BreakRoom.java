import java.util.Scanner;

/**
 * This is a program which simulate a break room containing two vending machine.
 * This program was written for Assignment 2
 *
 * @author Phan, Truong Son (Student number: 000824388)
 */

public class BreakRoom {

    public static void main(String[] args) {
        // Create 2 new instances of VendingMachine object
        VendingMachine chocolateBar = new VendingMachine();
        VendingMachine snack = new VendingMachine();

        // Initialize value for each machine
        chocolateBar.setProductName("Chocolate Bar");
        chocolateBar.setPrice(1.25);
        chocolateBar.setQuantity(10);

        snack.setProductName("Snack");
        snack.setPrice(2.5);
        snack.setQuantity(2);

        // Build in function for machines
        Scanner scan = new Scanner(System.in);
        String choice, machine;
        double coin, moneyBack;
        int itemQuantity;

        while (true) {
            System.out.println("Welcome to the Break Room!\n");
            System.out.println("There are 2 vending machines here:");

            System.out.println(chocolateBar);
            System.out.println(snack);

            System.out.println("\nWhat would you like to do: ");
            System.out.println("1. Insert coin ");
            System.out.println("2. Get money back");
            System.out.println("3. Vend an item");
            System.out.println("4. Leave the Break Room");
            choice = scan.nextLine();

            //
            if (choice.equals("1"))
            {
                System.out.println("Which machine: ");
                machine = scan.nextLine();

                // Check valid input
                while (!machine.equals("1") && !machine.equals("2")) {
                    System.err.println("Please choose the machine: 1 or 2");
                    machine = scan.nextLine();
                }

                System.out.println("Enter the amount: ");
                coin = scan.nextDouble();

                // Check valid input
                while (coin != 1 && coin != 2 && coin != 0.25 && coin != 0.05 && coin != 0.1) {
                    System.err.println("The machine only accept: Loonie, Toonie, Quarter, Nickel, Dime");
                    System.out.println("Enter the amount: ");
                    coin = scan.nextDouble();
                }

                if (machine.equals("1")){
                    chocolateBar.addMoney(coin);
                }
                 else{
                     snack.addMoney(coin);
                }
            }

            else if (choice.equals("2")){
                System.out.println("Which machine: ");
                machine = scan.nextLine();

                // Check valid input
                while (!machine.equals("1") && !machine.equals("2")) {
                    System.err.println("Please choose the machine: 1 or 2");
                    machine = scan.nextLine();
                }
                if (machine.equals("1")){
                    moneyBack = chocolateBar.coinReturn();
                    System.out.println("You got " + moneyBack);
                }
                else{
                    moneyBack = snack.coinReturn();
                    System.out.println("You got " + moneyBack);
                }
            }

            else if (choice.equals("3")){
                System.out.println("Which machine: ");
                machine = scan.nextLine();

                // Check valid input
                while (!machine.equals("1") && !machine.equals("2")) {
                    System.err.println("Please choose the machine: 1 or 2");
                    machine = scan.nextLine();
                }

                if (machine.equals("1")){
                    if (chocolateBar.vendProduct()){
                        chocolateBar.vendedProduct();
                        System.out.println("Vended item: Chocolate Bar");
                    }
                    else{
                        System.out.println("Vend Fail: not enough credit");
                    }
                }
                else{
                    if (snack.vendProduct()){
                        snack.vendedProduct();
                        System.out.println("Vended item: Snack");
                    }
                    else{
                        System.out.println("Vend Fail: not enough credit");
                    }
                }
            }

            else if (choice.equals("4")){
                System.out.println("Goodbye!!");
                break;
            }

        }





    }
}

