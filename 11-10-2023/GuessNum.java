import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rNum = random.nextInt(100);

        while (true){
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            if(num == rNum){
                System.out.println("You guessed the number!");
                break;
            }
            else if(num < rNum){
                System.out.println("The number is higher than " + num);
            }
            else if (num > rNum) {
                System.out.println("The number is lower than " + num);
            }
            System.out.println("Try again!");
        }
    }
}
