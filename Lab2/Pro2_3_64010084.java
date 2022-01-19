import java.util.Scanner;

public class Pro2_3_64010084 {

    public static void main(String[] args) {
        Check day = new Check(1,31);
        Check month = new Check(1,12);
        Check year = new Check(0);
        int h,d,m,y;
        Scanner sn  = new Scanner(System.in);
        System.out.print("Enter the day of the month : ");
        d = sn.nextInt();
        while(!day.isTrue2(d)) {

            System.out.println("invalid condition! please try agian");
            System.out.print("Enter the day of the month : ");
            d = sn.nextInt();
        }

        System.out.print("Enter month ( 1-12 ) : ");
        m = sn.nextInt();
        while(!month.isTrue2(m)) {

            System.out.println("invalid condition! please try agian");
            System.out.print("Enter month ( 1-12 ) : ");
            m = sn.nextInt();
        }

        System.out.print("Enter year : ");
        y = sn.nextInt();
        while(!year.isTrue1(y)) {

            System.out.println("invalid condition! please try agian");
            System.out.print("Enter year : ");
            y = sn.nextInt();
        }
        sn.close();
        if(m < 3) {
            m += 12;
            y--;
        }

        h = (d + ( ( 26 * ( m + 1 ) ) / 10 ) + ( ( y % 100 ) / 4 ) + ( ( y / 100 ) / 4) + ( 5 * ( y / 100 ) ) ) % 7;

        switch (h) {

            case 0 :
                System.out.println("Day of the week is Saturday");
                break;
            case 1 :
                System.out.println("Day of the week is Sunday");
                break;
            case 2 :
                System.out.println("Day of the week is Monday");
                break;
            case 3 :
                System.out.println("Day of the week is Tuesday");
                break;
            case 4 :
                System.out.println("Day of the week is Wednesday");
                break;
            case 5 :
                System.out.println("Day of the week is Thursday");
                break;
            case 6 :
                System.out.println("Day of the week is Friday");
                break; 
        }
    }

}

class Check {
    public int start;
    public int end;

    public Check(int i) {
        this.start = i;
    }
    public Check(int i, int j) {
        this.start = i;
        this.end = j;
    }

    boolean isTrue1(int num) {

        try {
            if (num < start) {
                throw new Exception();
            }
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    boolean isTrue2(int num) {

        try {
            if (num < start || num > end) {
                throw new Exception();
            }
        }catch (Exception e) {
            return false;
        }
        return true;
    }
 
}