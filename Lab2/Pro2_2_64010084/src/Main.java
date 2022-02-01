import java.util.*;
public class Main {
    
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

