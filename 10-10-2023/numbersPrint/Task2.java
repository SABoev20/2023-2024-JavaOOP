package numbersPrint;

public class Task2 {
    public static void main(String[] args) {
        recursionToTheRecursion(3);
    }

    public static void recursion(int n)
    {
        if(n == 0) return;
        recursion(n - 1);
        System.out.print(n + " ");
    }

    public static void recursionToTheRecursion(int n)
    {
        if(n == 0) return;
        recursion(5);
        System.out.println();
        recursionToTheRecursion(n - 1);
    }
}
