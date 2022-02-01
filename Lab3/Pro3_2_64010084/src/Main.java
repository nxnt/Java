import java.util.*;
public class Main {
    
    public static void main(String[] args) {
    
        Scanner sn = new Scanner(System.in);
        String a,b;
        int[] list1,list2;
        System.out.print("Enter list1: ");
        a = sn.nextLine();
        System.out.print("Enter list2: ");
        b = sn.nextLine();
        list1 = convert(a);
        list2 = convert(b);
        sn.close();
        int result = merge(list1, list2).length;
        System.out.print("The merged list is ");
        for(int i = 0; i < result; i ++) {

            System.out.print(merge(list1, list2)[i] + " ");
        }
    }   

    public static int[] merge(int[] list1, int[] list2) {

        int[] mergeArray = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, mergeArray, 0, list1.length);
        System.arraycopy(list2, 0, mergeArray, list1.length, list2.length);
        for(int i = 0; i < mergeArray.length; i++) {

            for(int j = i + 1; j < mergeArray.length; j++) {

                if( mergeArray[i] > mergeArray[j]) {

                    int temp = mergeArray[i];
                    mergeArray[i] = mergeArray[j];
                    mergeArray[j] = temp;
                }
            }
        }
        return mergeArray;
    }

    public static int[] convert(String str) {

        String[] splitArray = str.split(" ");
        int [] arr = new int [splitArray.length];
        for(int i = 0; i < splitArray.length; i++) {

            arr[i] = Integer.parseInt(splitArray[i]);
        }
        return arr;
    }
}
