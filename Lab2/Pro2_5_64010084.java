import java.util.Scanner;

public class Pro2_5_64010084 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int num;
        System.out.print("Enter the number of lines: ");
        num = sn.nextInt();
        while (!check(num)) {

            System.out.println("Please Enter Only 1 - 15");
            System.out.print("Enter the number of lines: ");
            num = sn.nextInt();
        }
        sn.close();
        for(int i = 0; i > -num; i--) {

            for(int j = -num + 1; j <= num - 1; j++) {

                if( i <= -Math.abs(j)) {

                    if( i == -Math.abs(j)) {

                        System.out.printf("%d ",Math.abs(j)+1);
                    }
                    else System.out.printf("%d ",Math.abs(j)+1);
                }
                else System.out.print("  ");
            }
            System.out.print("\n");
        }
    }

    public static boolean check(int n) {

        try {

            if(n < 1 || n > 15) {

                throw new Exception();
            }
        }catch(Exception e) {
            
            return false;
        }
        return true;
    }
}
