import java.util.*;
public class S2Q1_64010084 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.print("Input size of matrix : ");
        int size = sn.nextInt();
        if(size < 3) {

            System.out.println("Enter size more than 3");
        }
        randomMatrix(size);
        int[][] matrix = randomMatrix(size);
        printMatrix(matrix);
        checkLargestMem(matrix);
        System.out.println("End of programm." );
    }

    public static int[][] randomMatrix(int size ) {

        Random rand = new Random();
        int[][] matrix = new int[size][size];
        for(int i = 0; i < size; i++) {
            
            for(int j = 0; j < size; j++) {

                int upperbound = 10;
                int int_random = rand.nextInt(upperbound);
                matrix[i][j] = int_random;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {

        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix.length; j++) {

                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static void checkLargestMem(int[][] matrix) {

        int max_idx = 0;
        int current_posX = 0;
        int current_posY = 0;
        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix.length; j++) {

                if ( matrix[i][j] > max_idx) {

                    max_idx = matrix[i][j];
                }
            }
        }

        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix.length; j++) {

                if (matrix[i][j] == max_idx) {

                    current_posX = i;
                    current_posY = j;
                    System.out.printf("The first found largest member is : %d at(%d,%d)\n",max_idx, i + 1, j + 1);
                    max_idx = 10;
                }
            }
        }

        System.out.print("(a) Members on Top : " );
        if(current_posX - 1 < 0) {

            System.out.println("NO");
        }
        else {

            for(int x = current_posX - 1; x >= 0; x--) {

                System.out.printf("%d ", matrix[x][current_posY]);
            }
            System.out.println();
        }
        
        System.out.print("(b) Members on the Right Hand Side : " );
        if(current_posY + 1 > 3) {

            System.out.println("NO");
        }
        else {

            for(int y = current_posY + 1; y <= 3; y++) {

                System.out.printf("%d ", matrix[current_posX][y]);
            }
            System.out.println();
        }

        System.out.print("(c) Members at the Buttom : " );
        if(current_posX + 1 > 3) {

            System.out.println("NO");
        }
        else {

            for(int x = current_posX + 1; x <= 3; x++) {

                System.out.printf("%d ", matrix[x][current_posY]);
            }
            System.out.println();
        }

        System.out.print("(d) Members on the Left Hand Side : " );
        if(current_posY - 1 < 0) {

            System.out.println("NO");
        }
        else {

            for(int y = current_posY - 1; y >= 0; y--) {

                System.out.printf("%d ", matrix[current_posX][y]);
            }
            System.out.println();
        }
    }
}
