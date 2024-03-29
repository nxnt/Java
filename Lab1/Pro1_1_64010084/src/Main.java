public class Main {

    final static int BIRTH_PER_SEC = 7;
    final static int DEATH_PER_SEC = 13;
    final static int IMMIGRANT_PER_SEC = 45;
    final static int CURRENT_POPULATION = 312032486;
    public static void main(String args[]) {
       
        System.out.println("After 1 year : " +  Main.calculating(1));
        System.out.println("After 2 year : " + Main.calculating(2));      
        System.out.println("After 3 year : " + Main.calculating(3));
        System.out.println("After 4 year : " + Main.calculating(4));     
        System.out.println("After 5 year : " + Main.calculating(5));
    }

    static int calculating(int years) {
        
        int  seconds = years * 365 *24 * 60 * 60; 
        double births = seconds / (float)BIRTH_PER_SEC;
        double deaths = seconds / (float)DEATH_PER_SEC;
        double immigrants = seconds / (float)IMMIGRANT_PER_SEC;
        int total = (int) (births - deaths + immigrants);
        return total + CURRENT_POPULATION;
    }
}
