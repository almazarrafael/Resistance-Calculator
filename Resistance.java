import java.util.*;
import javax.swing.*;
import java.io.*;

public class Resistance {

	public static void main(String[] args) {

        String[] colors = {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"};
        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] multiply = {1, 10, 100, 1, 10, 100, 1, 10, 100, 1, 0.1, 0.01};
        String[] toleranceColors = {"Brown", "Red", "Green", "Blue", "Violet", "Grey", "Gold", "Silver"};
        double[] toleranceValues = {0.01, 0.02, 0.005, 0.0025, 0.001, 0.0005, 0.05, 0.1};

        int band1;
        int band2;
        int band3;
        boolean fourBands = false;
        boolean fiveBands = false;
        boolean sixBands = false;

        String[] numBandsChoice = {"4", "5", "6", "Quit"};
        int numBands = JOptionPane.showOptionDialog(null, "How many bands does the resistor have?", "Choose an amount", 0, 1, null, numBandsChoice, numBandsChoice[0]);

        switch (numBands) {
            case 0:
                band1 = JOptionPane.showOptionDialog(null, "Band 1 Color: ", "Choose a color", 0, 1, null, colors, colors[0]);
                fourBands = true;
                break;
            case 1:
                band1 = JOptionPane.showOptionDialog(null, "Band 1 Color: ", "Choose a color", 0, 1, null, colors, colors[0]);
                band2 = JOptionPane.showOptionDialog(null, "Band 2 Color: ", "Choose a color", 0, 1, null, colors, colors[0]);
                fiveBands = true;
                break;
            case 2:
                band1 = JOptionPane.showOptionDialog(null, "Band 1 Color: ", "Choose a color", 0, 1, null, colors, colors[0]);
                band2 = JOptionPane.showOptionDialog(null, "Band 2 Color: ", "Choose a color", 0, 1, null, colors, colors[0]);
                band3 = JOptionPane.showOptionDialog(null, "Band 3 Color: ", "Choose a color", 0, 1, null, colors, colors[0]);
                sixBands = true;
                break;
            default:
                System.exit(0);
                break;
        }

        if (fourBands) {
            
        }
        else if (fiveBands) {

        }
        else if (sixBands) {

        }
        else {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    } // End main

} // End class