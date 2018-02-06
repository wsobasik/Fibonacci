import java.util.Scanner;

public class FibonacciMain {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");

        System.out.println("Liczba a ciagu Fibonaciego to: " + fib(scanner.nextInt()));


    }

    private static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);

    }
}
