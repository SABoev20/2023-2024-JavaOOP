import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers in one line (sep. by space): ");
        String input = scanner.nextLine();

        String str = "";
        Integer sum = 0;
        Integer nums = 1;

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' '){
                sum = sum + Integer.parseInt(str);
                nums++;
                str = "";
                continue;
            }
            str += input.charAt(i);
        }
        sum += Integer.parseInt(str);

        System.out.println("Average of these nums is: " + sum / nums);
    }
}
