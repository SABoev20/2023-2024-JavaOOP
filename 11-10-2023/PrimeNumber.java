import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 2){
            System.out.println((n == 2) ? true : false);
            return;
        }
        System.out.println(isPrime(n, 2));
    }
    private static boolean isPrime(int n, int i){
        if(n % i == 0) return false;
        if(i * i > n) return true;
        return isPrime(n, i + 1);
    }
}