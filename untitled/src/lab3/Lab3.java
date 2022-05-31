package lab3;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your first value: ");
        double valueOne = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter your second value: ");
        double valueTwo = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter your third value: ");
        double valueThree = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter your fourth value: ");
        double valueFour = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter your fifth value: ");
        double valueFive = Double.parseDouble(keyboard.nextLine());

        double minValue = Math.min(valueOne, valueFive);

        double maxValue = Math.max(valueOne, valueFive);

        double averageValue = (valueOne+valueTwo+valueThree+valueFour+valueFive)/5;

        double standardDeviationOne = (valueOne-averageValue);
        double standardDeviationOneSquared = Math.pow(standardDeviationOne, 2);

        double standardDeviationTwo = (valueTwo-averageValue);
        double standardDeviationTwoSquared = Math.pow(standardDeviationTwo, 2);

        double standardDeviationThree = (valueThree-averageValue);
        double standardDeviationThreeSquared = Math.pow(standardDeviationThree, 2);

        double standardDeviationFour = (valueFour-averageValue);
        double standardDeviationFourSquared = Math.pow(standardDeviationFour, 2);

        double standardDeviationFive = (valueFive-averageValue);
        double standardDeviationFiveSquared = Math.pow(standardDeviationFive, 2);

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(3);
        
        double standardDeviationTotal = ((standardDeviationOneSquared + standardDeviationTwoSquared + standardDeviationThreeSquared + standardDeviationFourSquared + standardDeviationFiveSquared)/5);
        double finalStandardDeviation = Math.sqrt(standardDeviationTotal);

        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
        System.out.println("Average value: " + averageValue);
        System.out.println("Standard deviation value: "  + finalStandardDeviation);
    }
}
