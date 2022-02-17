public class Main {
    public static void main(String[] args) {
        
        StopWatch stopwatch = new StopWatch();
        double[] list = new double[1000];
        list = createList();
        System.out.println("Creating a list containing 1000 elements,");
        printList(list);
        System.out.println("List created.\nSorting stopwatch starts...");
        stopwatch.start();
        list = selectionSort(list);
        stopwatch.stop();
        printList(list);
        System.out.println("Sorting stopwatch stoped.");
        System.out.printf("The sort time is %.1f milliseconds.\n",stopwatch.getElapsedTime());
        System.out.println("------------------------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...\nCreating 1000 PalindromPrime...");
        stopwatch.start();
        PalindromPrime();
        stopwatch.stop();
        System.out.println("PalindromePrime created.\nThe palindromPrime stopwatch stoped.");
        System.out.printf("The palindromPrime time is %.1f milliseconds.",stopwatch.getElapsedTime());
    }

    public static double[] createList() {

        double[] list = new double[1000];
        for(int i = 0; i < list.length; i++) {
            list[i] = Math.random() * 1000;
        }
        return list;
    }

    public static void printList(double[] list) {

        for(int i = 0; i < 10; i++) {

            System.out.printf("%10.2f",list[i]);
            if((i + 1) % 5 == 0) {

                System.out.println();
            }
        }
        System.out.println("    ...");
        for(int j = 990; j < 1000; j++) {

            System.out.printf("%10.2f",list[j]);
            if((j + 1) % 5 == 0) {

                System.out.println();
            }
        }
    }
    public static double[] selectionSort(double[] list) {

        int min_idx;
        double temp;
        for (int i = 0; i < list.length-1; i++)
        {
            min_idx = i;
            for (int j = i+1; j < list.length; j++) {

                if (list[j] < list[min_idx]) {
     
                    min_idx = j;
                }
            }
            temp = list[min_idx];
            list[min_idx] = list[i];
            list[i] = temp;
        }
        return list;
    }
    public static void PalindromPrime() {

        int count = 0;
        for (int i = 2; count < 1000; i++) {
    
            if(isPalin(i) && isPrime(i)) {
                    
                count++;
                System.out.print(i + ((count % 10) > 0 ? " " : "\n"));
            }
        }
    }
    public static boolean isPrime(int n) {
    
        if (n <= 1) {

            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {

            if(n % i == 0) {

                return false;
            }
        }
        return true;
    }

    public static boolean isPalin(int n) {

        int x = n;
        int palin = 0;
        while( x > 0) {

            palin *= 10;
            palin += x%10;
            x /= 10;
        }
        if( n == palin) {
            
            return true;
        }   
        else return false;
    }
}
