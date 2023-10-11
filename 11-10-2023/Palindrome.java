import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = scanner.next();
        String reversed = "";

        for (int i = 0; i < str.length() / 2; i++){
            reversed = str.charAt(i) + reversed;
        }
        System.out.println(str.contains(reversed) ? true : false);
    }
}
