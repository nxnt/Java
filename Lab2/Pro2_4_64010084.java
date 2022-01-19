import java.util.Scanner;

public class Pro2_4_64010084 {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        String[] cityName = new String[3];
        String[] question = {"first","second","third"};
        for(int i = 0; i < 3; i++) {

            System.out.printf("Enter the %s city : ",question[i]);
            cityName[i] = sn.nextLine();
        }
        sn.close();
        cityName = sort(cityName);
        System.out.printf("The three cities in alphabetical order are %s %s %s", cityName[0],cityName[1],cityName[2]);
    }

    public static String[] sort(String[] text) {
            
        for(int i = 0; i < text.length; i++) {
            for(int j = i + 1; j < text.length; j++) {
                if(text[i].compareToIgnoreCase(text[j]) > 0) {
                    String a = text[j];
                    text[j] = text[i];
                    text[j] = a;
                }
            }
        }
        return text;
    }
}
