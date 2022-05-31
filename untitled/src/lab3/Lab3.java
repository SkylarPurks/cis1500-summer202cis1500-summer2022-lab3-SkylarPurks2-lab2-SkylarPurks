package lab3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(3);

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

        double standardDeviationOne = Math.sqrt(valueOne-averageValue);
        double standardDeviationTwo = Math.sqrt(valueTwo-averageValue);
        double standardDeviationThree = Math.sqrt(valueThree-averageValue);
        double standardDeviationFour = Math.sqrt(valueFour-averageValue);
        double standardDeviationFive = Math.sqrt(valueFive-averageValue);
        double standardDeviationTotal = ((standardDeviationOne + standardDeviationTwo + standardDeviationThree + standardDeviationFour + standardDeviationFive)/5);
        double finalStandardDeviation = Math.sqrt(standardDeviationTotal);

        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
        System.out.println("Average value: " + averageValue);
        System.out.println("Standard deviation value: " + standardDeviationTotal + " "+ finalStandardDeviation);
    }
}
