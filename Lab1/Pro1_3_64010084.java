import java.util.Scanner;

public class Pro1_3_64010084 {
    
    static int number,total,digit1,digit2,digit3;
    public static void main (String args[]) {
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        number = sn.nextInt();
        sn.close();
        if (number < 0 || number > 1000)
        {
            System.out.println("Out of Range");
        }
        else
        {
           digit1 = number % 10;
           number /= 10;
           digit2 = number % 10;
           number /= 10;
           digit3 = number % 10;
           total = digit1 + digit2 + digit3;
           System.out.println("The sum of the digits is " + total);
        }
    }
}
