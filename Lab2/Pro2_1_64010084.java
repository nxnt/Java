import java.util.Scanner;

public class Pro2_1_64010084 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        DayCheck da = new DayCheck();
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
        System.out.println("Today is " + da.getDay(today) + " and the future day is " + da.getDay(today + nextday));
        sn.close();
    }
}

class DayCheck {
    public String day;
    String getDay(int result) {
        switch (result %= 7) {

            case 0 : 
                this.day = "Sunday";
                break;
            case 1 :
                this.day = "Monday";
                break;
            case 2 : 
                this.day = "Tuesday";
                break;
            case 3 : 
                this.day = "Wednesday";
                break;
            case 4 : 
                this.day = "Thursday";
                break;
            case 5 : 
                this.day = "Friday";
                break;
            case 6 : 
                this.day = "Saturday";
                break;
        }
        return this.day;
    }
}
