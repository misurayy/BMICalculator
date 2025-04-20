import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in cm) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble() / 100.0;

            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(Math.round(height[i] * 100) + "\t" + weight[i] + "\t" + Math.round(bmi[i] * 100.0) / 100.0 + "\t\t" + status[i]);
        }
    }
}
