package app.demo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class BodyMassIndex {
        /**
         * Program: BodyMassIndex.java
         * Written by Mario Pérez
         * Date: 02-04-2022
         * 
         * Given the height and the weight of a person, this program calculates the Body
         * Mass Index and return the result in a box message.
         * 
         * @param args
         */
        public static void main(String[] args) {
                double userHeight, userWeight;
                String askHeight, askWeight;
                String end_message = "Thanks for using the application!";
                int startBmi = JOptionPane.YES_OPTION; // Sentinel.

                while (startBmi == JOptionPane.YES_OPTION) {
                        // Get Height.
                        askHeight = JOptionPane.showInputDialog(null,
                                        "Enter your height in inches");
                        userHeight = Double.parseDouble(askHeight);
                        JOptionPane.showMessageDialog(null,
                                        "Your height is " + userHeight + " in");

                        // Get Weight.
                        askWeight = JOptionPane.showInputDialog(null,
                                        "Enter your weight in pounds");
                        userWeight = Double.parseDouble(askWeight);
                        JOptionPane.showMessageDialog(null,
                                        "Your weight is " + userWeight + " lb");

                        // Passing arguments to calculate BMI.
                        calculateBMI(userHeight, userWeight);

                        // If user require a new BMI calculation.
                        startBmi = JOptionPane.showConfirmDialog(null,
                                        "Do you want to calculate another BMI?",
                                        "New BMI calculation", JOptionPane.YES_NO_OPTION);
                }

                JOptionPane.showMessageDialog(null, end_message);

        }

        public static void calculateBMI(double userHeight, double userWeight) {
                final double IN_TO_METER = 0.0254; // Constant. 1 inches is equal to 0.0254 meter.
                final double LB_TO_KILOGRAM = 0.45359237; // Constant. 1 lb is equal to 0.45359237 kilogram.

                double height, weight, bmi;
                String resultBMI = "Your BMI is ";
                DecimalFormat df = new DecimalFormat("#.#");

                height = userHeight * IN_TO_METER;
                weight = userWeight * LB_TO_KILOGRAM;

                // Calculate and display BMI.
                bmi = weight / (Math.pow(height, 2));
                JOptionPane.showMessageDialog(null, resultBMI + df.format(bmi));
        }
}
