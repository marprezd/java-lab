package app.demo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CostRemodelingProject {
    /**
     * Program: CostRemodelingProject.java
     * Written by Mario Pérez
     * Date: 02-05-2022
     * 
     * This program calculates the projected cost of a remodeling project.
     * It prompts the user for a number of hours projected
     * for the job and the wholesale cost of materials. The program
     * computes and displays the cost of the job, which is the number
     * of hours times the hourly rate plus the 12% of the wholesale
     * cost of materials.
     * 
     * @param args
     */
    public static void main(String[] args) {
        getHoursAndCost();
        endOfJob();
    }

    public static void getHoursAndCost() {
        // The hours projected for the job.
        String askHoursJob = JOptionPane.showInputDialog("Enter hours projected for the job.");
        int hoursJob = Integer.parseInt(askHoursJob);

        while (hoursJob >= 1) {
            // The wholesale cost of materials.
            String askCostMaterials = JOptionPane.showInputDialog("Enter wholesale cost of materials.");
            double costMaterials = Double.parseDouble(askCostMaterials);

            calculateCostJob(hoursJob, costMaterials);

            // Calculate new cost or exit.
            String newHourJob = JOptionPane.showInputDialog("Enter new hours projected for the job or " +
                    "type O (zero) por exit!");
            hoursJob = Integer.parseInt(newHourJob);
        }
    }

    public static void calculateCostJob(int hoursJob, double costMaterials) {
        final double HOURLY_RATE = 30; // Constant. The HOURLY_RATE is $30 per hour.
        double costOfJob, wholesaleCost;
        String msg = "The cost of the job is $";

        wholesaleCost = costMaterials * 0.12; // 12% of the wholesale cost of materials.
        costOfJob = hoursJob * HOURLY_RATE + wholesaleCost;
        DecimalFormat df = new DecimalFormat("#.##");

        // Display cost of the job.
        JOptionPane.showMessageDialog(null, msg + df.format(costOfJob));

    }

    public static void endOfJob() {
        // End program
        String endMessaage = "Thanks for using the application!";
        JOptionPane.showMessageDialog(null, endMessaage);
    }
}
