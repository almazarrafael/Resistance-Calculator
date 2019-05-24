import java.util.*;
import javax.swing.*;
import java.io.*;

public class Resistance {

	public static void main(String[] args) {

        String[] bandColor = {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"}; // Length = 10
        int[] bandValue = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // Length = 10

        String[] toleranceColor = {"Brown", "Red", "Green", "Blue", "Violet", "Grey", "Gold", "Silver"}; // Length = 10
        String[] toleranceValue = {"+-1%", "+-2%", "+-0.5%", "+-0.25%", "+-0.10%", "+-0.05%", "+-5%", "+-10%"}; // This is a string because it doesn't actually directly affect the output value, you just have to include it
        
        // Multiplier color is the same as bandColor
        int[] multiplierValue = {1, 10, 100, 1, 10, 100, 1, 10, 100, 1}; // o, o, o, k, k, m, m, m, g Length = 10

        String[] numBandsChoice = {"4", "5", "6", "Quit"};
        int numBands = JOptionPane.showOptionDialog(null, "How many bands does the resistor have?", "Choose an amount", 0, 1, null, numBandsChoice, numBandsChoice[0]);

        // 0 - four bands, 1 - five bands, 2 - six bands

        String result = "";
        int resultNum = 0;
        char multiplierChar = ' ';
        int bandChoice = 0;

        switch (numBands) {
            case 0:
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the first band?", "Choose a color", 0, 1, null, bandColor, bandColor[0]);
                if (bandChoice == -1) break;
                result += bandChoice;
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the second band?", "Choose a color", 0, 1, null, bandColor, bandColor[0]);
                if (bandChoice == -1) break;
                result += bandChoice;
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the third band?", "Choose a color", 0, 1, null, bandColor, bandColor[0]);
                if (bandChoice == -1) break;

                if (bandChoice == 10) { // 10
                    multiplierChar = 'G';
                }
                else if (bandChoice > 6) { // More than 6 but not 10 M
                    multiplierChar = 'M';
                }
                else if (bandChoice < 2) { // Less than 2 NONE
                    multiplierChar = ' ';
                }
                else { // K
                    multiplierChar = 'K';
                }

                resultNum = Integer.parseInt(result);
                resultNum *= multiplierValue[bandChoice];
                result = "";
                result += resultNum;
                result += multiplierChar;
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the fourth band?", "Choose a color", 0, 1, null, toleranceColor, toleranceColor[0]);
                if (bandChoice == -1) break;
                result += " " + toleranceValue[bandChoice];
                JOptionPane.showMessageDialog(null, "That resistor has the value of: \n" + result);
                break;
            case 1:
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the first band?", "Choose a color", 0, 1, null, bandColor, bandColor[0]);
                if (bandChoice == -1) break;
                result += bandChoice;
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the second band?", "Choose a color", 0, 1, null, bandColor, bandColor[0]);
                if (bandChoice == -1) break;
                result += bandChoice;
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the third band?", "Choose a color", 0, 1, null, bandColor, bandColor[0]);
                if (bandChoice == -1) break;
                result += bandChoice;
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the fourth band?", "Choose a color", 0, 1, null, bandColor, bandColor[0]);
                if (bandChoice == -1) break;

                if (bandChoice == 10) { // 10
                    multiplierChar = 'G';
                }
                else if (bandChoice > 6) { // More than 6 but not 10 M
                    multiplierChar = 'M';
                }
                else if (bandChoice < 2) { // Less than 2 NONE
                    multiplierChar = ' ';
                }
                else { // K
                    multiplierChar = 'K';
                }

                resultNum = Integer.parseInt(result);
                resultNum *= multiplierValue[bandChoice];
                result = "";
                result += resultNum;
                result += multiplierChar;
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the fifth band?", "Choose a color", 0, 1, null, toleranceColor, toleranceColor[0]);
                if (bandChoice == -1) break;
                result += " " + toleranceValue[bandChoice];
                JOptionPane.showMessageDialog(null, "That resistor has the value of: \n" + result);
                break;
            case 2:
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the first band?", "Choose a color", 0, 1, null, bandColor, bandColor[0]);
                if (bandChoice == -1) break;
                result += bandChoice;
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the second band?", "Choose a color", 0, 1, null, bandColor, bandColor[0]);
                if (bandChoice == -1) break;
                result += bandChoice;
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the third band?", "Choose a color", 0, 1, null, bandColor, bandColor[0]);
                if (bandChoice == -1) break;
                result += bandChoice;
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the fourth band?", "Choose a color", 0, 1, null, bandColor, bandColor[0]);
                if (bandChoice == -1) break;
                result += bandChoice;
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the fifth band?", "Choose a color", 0, 1, null, bandColor, bandColor[0]);
                if (bandChoice == -1) break;

                if (bandChoice == 10) { // 10
                    multiplierChar = 'G';
                }
                else if (bandChoice > 6) { // More than 6 but not 10 M
                    multiplierChar = 'M';
                }
                else if (bandChoice < 2) { // Less than 2 NONE
                    multiplierChar = ' ';
                }
                else { // K
                    multiplierChar = 'K';
                }

                resultNum = Integer.parseInt(result);
                resultNum *= multiplierValue[bandChoice];
                result = "";
                result += resultNum;
                result += multiplierChar;
                bandChoice = JOptionPane.showOptionDialog(null, "What color is the sixth band?", "Choose a color", 0, 1, null, toleranceColor, toleranceColor[0]);
                if (bandChoice == -1) break;
                result += " " + toleranceValue[bandChoice];
                JOptionPane.showMessageDialog(null, "That resistor has the value of: \n" + result);
                break;
            default:
                break;
        }
        
    } // End main

} // End class