import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two nums: ");
        System.out.println("Area of the rectangle is " + (scanner.nextInt() * scanner.nextInt()) / 2);
    }
}