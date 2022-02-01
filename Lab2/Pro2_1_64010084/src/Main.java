import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        String week[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int today, nextday;
        System.out.print("Enter today's day : ");
        today = sn.nextInt();
        if (today < 0 || today > 7) {
            
            System.out.println("Please Enter a number in the range of 0 to 6 (Sunday is 0, Monday is 1, ..., and Saturday is 6)");
        }
        System.out.print("Enter the number of the day elapsed since today : ");
        nextday = sn.nextInt();
        if (nextday < 0) {
            
            System.out.println("Please Enter a positive number");
        }
        System.out.println("Today is " + week[today] + " and the future day is " + week[(today + nextday) % 7]);
        sn.close();
    }
}

