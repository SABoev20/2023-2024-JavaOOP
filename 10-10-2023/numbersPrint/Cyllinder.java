import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        final float pi = 3.14f;

        Scanner scanner = new Scanner(System.in);
        float r = scanner.nextFloat();
        float h = scanner.nextFloat();

        System.out.println("The V of cylinder with r = " + r + " and h = " + h + " is : " + pi * r * r * h);

    }

}
