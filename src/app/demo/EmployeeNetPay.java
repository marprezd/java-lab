package app.demo;

import java.util.Scanner;

public class EmployeeNetPay {
    /**
     * Program: EmployeeNetPay.java
     * Written by Mario Pérez
     * Date: 03-24-2022
     * 
     * This program is intended to display employee net pay values.
     * All employees have a standard $45 deduction from their checks.
     * If an employee does not earn enough to cover the deduction, an
     * error message is displayed.
     * 
     * @param args
     */
    public static void main(String[] args) {

        getEmployeeData(); // Get employe's data
        finish(); // End program

    }

    public static void getEmployeeData() {
        String name;
        String sentinel = "END";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name or " + sentinel + " to quit >> ");
        name = input.next();
        System.out.println("Employee's name: " + name);

        while (!name.equals(sentinel)) { // while name != sentinel

            calculateEmployeePayment(name, input);

            System.out.print("Enter next name or " + sentinel + " to quit >> ");
            name = input.next();
        }
        input.close(); // close Scanner
    }

    public static void calculateEmployeePayment(String name, Scanner input) {
        int hours;
        double rate, net, gross;
        final int DEDUCTION = 150;

        System.out.print("Enter hours worked for " + name + " >> ");
        hours = input.nextInt();
        System.out.print("Enter hourly rate for " + name + " >> ");
        rate = input.nextDouble();

        // Calculate net pay
        gross = hours * rate;
        net = gross - DEDUCTION;

        if (net > 0) {
            System.out.printf("Net pay for " + name + " is $%.2f\n", net);
        } else {
            System.out.println("Deductions not covered. Net is 0.");
        }
    }

    public static void finish() {
        String endMessaage = "Thanks for using the application!";
        System.out.println(endMessaage);
    }
}
