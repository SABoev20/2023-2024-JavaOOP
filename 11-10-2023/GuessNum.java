import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rNum = random.nextInt(10);

        while (true){
            System.out.print("Enter a number: ");
            if(scanner.nextInt() == rNum){
                System.out.println("You guessed the number!");
                break;
            }
            System.out.println("Wrong number, please try again!");
        }
    }
}
