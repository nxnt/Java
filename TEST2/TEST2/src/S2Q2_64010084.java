
import java.util.*;
public class S2Q2_64010084 {
    public static void main(String[] args) {
        
        String[] arr_int = {"0","1","2","3","4","5","6","7","8","9"};
        String[] arr_str = {"a","b","c","d","e","f","g","h","i","j"};
        String[] arr_rand = new String[10];
        int int_rand = 1;
        Random rand = new Random();
        Scanner sn = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {

            int_rand = -int_rand ;
            if (int_rand == -1) {

                int int2_rand = rand.nextInt(10);
                arr_rand[i] = arr_int[int2_rand];
            }
            if (int_rand == 1) {

                int int3_rand = rand.nextInt(10);
                arr_rand[i] = arr_str[int3_rand];
            }   
            
        }   

        printArr(arr_rand);
        System.out.print("Select group of characters [1]character or [2]numeric :");
        int num_select = sn.nextInt();
        boolean found = false;
        if(num_select == 1) {
            
            System.out.print("Characters not in the list are : ");
            for(int i = 0; i < 10; i++) {

                found = false;
                for(int j = 1; j < 10; j+=2) {

                    if(arr_str[i] == arr_rand[j]) {
            
                        found = true;
                    }
                }
                if(!found) {

                    System.out.print(arr_str[i] + " ");
                }
            }
        }

        if(num_select == 2) {
            
            System.out.print("Numeric not in the list are : ");
            for(int i = 0; i < 10; i++) {

                found = false;
                for(int j = 0; j < 10 ; j+=2) {

                    if(arr_int[i] == arr_rand[j]) {
            
                        found = true;
                    }
                }
                if(!found) {

                    System.out.print(arr_int[i] + " ");
                }
            }

        }
        System.out.print("\n");
        System.out.println("End of program");
    }

    public static void printArr(String[] arr) {

        System.out.print("Random characters are : ");
        for(int i = 0; i < arr.length; i++) {

            System.out.printf("%s ",arr[i]);
        }
        System.out.println("");
    }
    
}
