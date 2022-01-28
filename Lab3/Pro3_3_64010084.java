import java.util.Scanner;
import java.util.Random;
public class Pro3_3_64010084 {

    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        int size;
        while(true) {
            
            System.out.print("Enter the size for the matrix: ");
            size = sn.nextInt();
            if(size >= 2) {
                
                break;
            }
            else System.out.println("Enter the size more than 1!");
        }
        sn.close();
        int[][] matrix = new int[size][size];
        randomMatrix(matrix);
        printMatrix(matrix);
        findTheRow(matrix);
        findTheColumn(matrix);
        superdiagonal(matrix);
        diagonal(matrix);
        subdiagonal(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        
        for(int x = 0; x < matrix.length; x++) {
            for(int y = 0; y < matrix[x].length; y++) {

                System.out.print(matrix[x][y] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void randomMatrix(int[][] matrix) {


        Random rand = new Random();
        int upperbound = 2;
        for(int x = 0; x < matrix.length; x++) {
            for(int y = 0; y < matrix[x].length; y++) {

                int int_random = rand.nextInt(upperbound);
                matrix[x][y] = int_random;
            }
        }
    }

    public static void findTheRow(int[][] matrix) {

        boolean check = false;
        for(int x = 0; x < matrix.length; x++) {

            int sum = 0;
            for(int y = 0; y < matrix[x].length; y++) {

                sum += matrix[x][y];
            }
            if(sum == 0) {

                System.out.println("All 0s on row " + x);
                check = true;
            }
            if(sum == matrix.length) {

                System.out.println("All 1s on row " + x);
                check = true;
            }
        }
        if(!check) {

            System.out.println("No same numbers on a row");
        }
    }

    public static void findTheColumn(int[][] matrix) {

        boolean check = false;
        for(int x = 0; x < matrix.length; x++) {

            int sum = 0;
            for(int y = 0; y < matrix.length; y++) {

                sum += matrix[y][x];
            }
            if(sum == 0) {

                System.out.println("All 0s on column " + x);
                check = true;
            }
            if(sum == matrix.length) {

                System.out.println("All 1s on column " + x);
                check = true;
            }
        }
        if(!check) {

            System.out.println("No same numbers on a column");
        }
    }

    public static void superdiagonal(int[][] matrix) {

        int sum = 0;
        for(int x = 0; x < matrix.length - 1; x++) {

            sum += matrix[x][x+1];
        }
        if(sum == 0) {

            System.out.println("All 0s on the superdiagonal");
        }
        else if(sum == matrix.length - 1) {

            System.out.println("All 1s on the superdiagonal");
        }
        else System.out.println("No same numbers on the superdiagonal");
    }

    public static void diagonal(int[][] matrix) {

        int sum = 0;
        for(int x = 0; x < matrix.length; x++) {

            for(int y = 0; y < matrix.length; y++) {

                if(x == y) {

                    sum += matrix[x][y];
                }
            }     
        }
        if(sum == 0) {

            System.out.println("All 0s on the diagonal");
        }
        else if(sum == matrix.length) {

            System.out.println("All 1s on the diagonal");
        }
        else System.out.println("No same numbers on the diagonal");
    }

    public static void subdiagonal(int[][] matrix) {

        int sum = 0;
        for(int x = 0; x < matrix.length - 1; x++) {

            sum += matrix[x+1][x];
        }
        if(sum == 0) {

            System.out.println("All 0s on the subdiagonal");
        }
        else if(sum == matrix.length - 1) {

            System.out.println("All 1s on the subdiagonal");
        }
        else System.out.println("No same numbers on the subdiagonal");
    }
}
