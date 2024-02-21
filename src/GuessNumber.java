import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt() % 6;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zahl von 0 bis 5: ");

        System.out.println("Ihr Variant; \n");
        int guessNumber = scanner.nextInt();


        if (guessNumber < 0) {
            System.out.println("Schlechte Zahl");
        }  else if (guessNumber % 2 == 0){
            System.out.println("gerade Zahl");
        } else {
            System.out.println("Gute Zahl");
        }

        System.out.println("die Zufahlszahl wahr: " + secretNumber);
    }

}
