import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(rfactorial(n));
    }
    private static long rfactorial(int n){
        if(n == 1) return 1;
        return n * rfactorial(n - 1);
    }
}