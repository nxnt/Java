import java.util.Scanner;

public class Main {

    public static void main (String args[]) {

        Scanner sn = new Scanner(System.in);
        double a,b,c,d,e,f,x,y;
        System.out.print("a : ");
        a = sn.nextDouble();
        System.out.print("b : ");
        b = sn.nextDouble();
        System.out.print("c : ");
        c = sn.nextDouble();
        System.out.print("d : ");
        d = sn.nextDouble();
        System.out.print("e : ");
        e = sn.nextDouble();
        System.out.print("f : ");
        f = sn.nextDouble();
        sn.close();
        x = ((e*d)-(b*f))/((a*d)-(b*c));
        y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
