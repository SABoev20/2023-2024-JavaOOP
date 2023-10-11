import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = scanner.nextLine();
        String word = "";
        String reversed = "";

        for (int i = 0; i < str.length(); i++){
            word += str.charAt(i);
            if(str.charAt(i) == ' ') {
                reversed = word + reversed;
                word = "";
            }
        }
        reversed = word + " " + reversed;
        System.out.println(reversed);
    }
}
