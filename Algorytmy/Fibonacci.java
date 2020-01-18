package Algorytmy;

import java.lang.IllegalArgumentException;
import java.util.Scanner;

public class Fibonacci {

    public static long fibon(long n) {
        if(n < 0) {
            throw new IllegalArgumentException("Argument nie moze byc ujemny!");
        }

        if(n == 0 || n == 1) {
            return n;
        }

        long poprzednia2 = 0;
        long poprzednia1 = 1;
        long obecna = 1;

        for(long licznik = 2; licznik < n; ++licznik) {
            poprzednia2 = poprzednia1;
            poprzednia1 = obecna;
            obecna = poprzednia1 + poprzednia2;
        }

        return obecna;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj indeks: ");
        long n = sc.nextLong();

        System.out.println("fibon(" + n + ") = " + fibon(n));
    }
}
