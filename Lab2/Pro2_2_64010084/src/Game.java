import java.util.*;
public class Game {

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