import java.util.GregorianCalendar;
public class Main {

    public static void main(String[] args) {
        
        GregorianCalendar currentTime = new GregorianCalendar(2021,0,31);
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + currentTime.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + currentTime.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + currentTime.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + currentTime.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("------------");
        System.out.println("After specified the elapsed time of one day after current day");
        currentTime.add(GregorianCalendar.DATE, 1);
        System.out.println("Year is " + currentTime.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + currentTime.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + currentTime.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + currentTime.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println( currentTime.getTime());
    }
}
