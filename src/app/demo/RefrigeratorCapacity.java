package app.demo;

import java.util.Scanner; // Needed for the Scanner class

public class RefrigeratorCapacity {
    /**
     * Program: RefrigeratorCapacity.java
     * Written by Mario Pérez
     * Date: 02-08-2022
     * 
     * This is a program to calculates the refrigerator capacity in cubic feet.
     */
    public static void main(String[] args) {       
        Boolean modelName = true; // To hold a flag.

        // While loop
        while (modelName) {
            getDetailRefrigerator();

            // Create a Scanner object to read input.
            Scanner input = new Scanner(System.in);
            
            // Read a string from the keyboard.
            System.out.print("Do you want to add another refrigerator model?' (y/Y=yes, N=no) >> ");
            String confirmNextStep = input.next();
            // ...Use the String class’s charAt method to extract the first character of the
            // string and assign it to the answer variable.
            char answer = confirmNextStep.charAt(0);

            // Validate data entered
            if (answer == 'y' || answer == 'Y') {
                modelName = true;
            } else {
                input.close();
                modelName = false;
            }
        }
        // call to function
        endOfJob();
    }

    public static void getDetailRefrigerator() {
        /**
         * getDetailRefrigerator() prompts the user for a refrigerator model name and
         * the interior height, width, and depth in inches. Then call the
         * CalculatrefrigeratorCapacity() function passing as arguments the values
         * stored in the height, witch and depth variables.
         */
        String refrigeratorModelName = "Enter a refrigerator's model name >> ";
        String refrigeratorModel;
        String refrigeratorHeight = "Enter the interior height (in inches) >> ";
        String refrigeratorDepth = "Enter the interior depth (in inches) >> ";
        String refrigeratorWeight = "Enter the interior weight (in inches) >> ";
        double height, depth, weight;

        // Create a Scanner object to read input.
        Scanner input = new Scanner(System.in);

        System.out.print(refrigeratorModelName);
        refrigeratorModel = input.nextLine();
        System.out.println("Value entered: " + refrigeratorModel);

        System.out.print(refrigeratorHeight);
        height = input.nextDouble();
        System.out.println("Value entered: " + height);

        System.out.print(refrigeratorWeight);
        weight = input.nextDouble();
        System.out.println("Value entered: " + weight);

        System.out.print(refrigeratorDepth);
        depth = input.nextDouble();
        System.out.println("Value entered: " + depth);
        //input.close();

        // call to function
        calculateRefrigeratorCapacity(height, weight, depth);
    }

    public static void calculateRefrigeratorCapacity(double height, double weight, double depth) {
        /**
         * calculateRefrigeratorCapacity() accept three parameters, then calculate the
         * refrigerator capacity in cubic feet by first multiplying the height, width, 
         * and depth to get cubic inches, and then dividing by 1728 (the number of 
         * cubic inches in a cubic foot). Finally, it sends the result of the operation
         * to the default system output device.
         */
        final double CUBIC_INCHES = 1728; // Constant! Here 1ft³ = 1728 in³.
        double capacity;

        capacity = (height * weight * depth) / CUBIC_INCHES;

        // Display capacity
        System.out.println();
        System.out.printf("The refrigerator capacity is %.2f ft³.\n", capacity);
        System.out.println("----------------------------------------");
        System.out.println();
    }

    public static void endOfJob() {
        // End program
        String endMessaage = "Thanks for using the application!";
        System.out.println(endMessaage);
    }
}