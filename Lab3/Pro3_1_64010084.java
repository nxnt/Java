public class Pro3_1_64010084 {
    
    public static void main(String[] args) {
        
        int count = 0;
        for (int i = 2; count < 100; i++) {

            if(isPrime(i) && isPalin(i)) {
                
                count++;
                System.out.print(i + ((count % 10) > 0 ? " " : "\n"));
            }
        }
    }

    static boolean isPrime(int n) {

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

    static boolean isPalin(int n) {

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
