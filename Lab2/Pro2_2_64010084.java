import java.util.Scanner;
import java.util.Random;

public class Pro2_2_64010084 {
    
    public static void main (String[] args) {
        Scanner sn = new Scanner (System.in);
        Game game = new Game();
        int number = 1;
        String[] owner = new String[] {"scissor","rock","paper"};
        System.out.print("scissor (0), rock (1), paper (2): ");
        try {
            number = sn.nextInt();
            sn.close();
            if (number < 0 || number > 2)  {
                throw new Exception();
            }
        }catch(Exception e) {
            System.out.println("Please enter only  0 - 3 ");
            System.exit(0);
        }
        System.out.println("The computer is " + game.getCom() + ". You are " + owner[number] + ( number == game.getComNum() ? " too. " : ". " ) + game.result(number));
    }
}

class Game {

    public String[] computer = new String[] {"scissor","rock","paper"};
    int[][] table = new int[][] {{0,1,-1},{-1,0,1},{1,-1,0}};       
    Random rand = new Random();
    int upperbound = 3;
    int int_random = rand.nextInt(upperbound);
    String ans;

    int getComNum() {

        return this.int_random;
    }
    String getCom() {

        return this.computer[int_random];
    }

    String result(int number) {

        switch (table[int_random][number]) {

            case -1 :
                this.ans = "You lose.";
                break;
            case 0 :
                this.ans = "It is a draw.";
                break;
            case 1 :
                this.ans = "You won.";
                break;
        }
        return this.ans;
    }
}
