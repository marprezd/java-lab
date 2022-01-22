package app.demo;

import java.io.*;

public class Cube {
    /**
     * Program: Cube.java
     * Written by Mario Pérez
     * Date: 01-21-2022
     * 
     * Given the length of the edge of a cube, this program calculates the surface
     * of the cube and its volume.
     * 
     * @param args
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufInput = new BufferedReader(
                new InputStreamReader(System.in));
        double lEdge; // length of the edge
        double vCube; // volume of the cube
        double sCube; // surface of the cube

        // Input data item
        System.out.println();
        System.out.print("Enter the length of the edge in mm³ >> ");
        lEdge = Double.parseDouble(bufInput.readLine());

        // Processing data items
        vCube = Math.pow(lEdge, 3);
        sCube = 6 * Math.pow(lEdge, 2);

        // Display output
        System.out.printf("The volume of the cube is %.2f mm³.\n",
                vCube);
        System.out.printf("The surface of the cube is %.2f mm³.\n",
                sCube);
    }
}
