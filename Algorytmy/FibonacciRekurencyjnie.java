package Algorytmy;

import java.lang.IllegalArgumentException;
import java.util.Scanner;

public class FibonacciRekurencyjnie {

    public static long fib(long n) {
        if(n < 0) {
            throw new IllegalArgumentException("Argument nie moze byc ujemny");
        }

        if(n <= 1) {
            return n;
        }

        long f2 = fib(n-2);
        long f1 = fib(n-1);
        return f1+f2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj indeks: ");
        int n = sc.nextInt();

        System.out.println("fib(" + n + ") = " + fib(n));
    }
}
