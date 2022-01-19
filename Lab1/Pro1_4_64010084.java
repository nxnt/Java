
import java.util.Scanner;

public class Pro1_4_64010084 {
    final static double P_TO_KILO = 0.45359237;
    final static double INCH_TO_METER =  0.0254;
    public static void main (String args[]) {
        Scanner sn = new Scanner(System.in);
        double height,weight,bmi;
        System.out.print("Enter weight in pounds:");
        weight = sn.nextDouble();
        System.out.print("Enter height in inches:");
        height = sn.nextDouble();
        sn.close();
        height *= INCH_TO_METER;
        weight *= P_TO_KILO;
        bmi = weight / (height * height);
        System.out.println("BMI is " + bmi);
    }
}
