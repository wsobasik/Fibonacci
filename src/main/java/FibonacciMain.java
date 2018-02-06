import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class FibonacciMain {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int n = scanner.nextInt();
        System.out.println("Liczba a ciagu Fibonaciego to: " + fib(n));
        System.out.println("Liczba ciagu Fibonacciego to: " + fibIter(n));
    }

    private static int fibIter(int n) {
        int n_2 = 0;
        int n_1 = 1;
        int n_0 = 0;
        int tmp = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }


        for (int i = 2; i <= n; i++) {
            n_0 = n_2 + n_1;
            tmp = n_0;
            n_2 = n_1;
            n_1 = tmp;
        }
        return n_0;
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
