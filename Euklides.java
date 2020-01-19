package Algorytmy;

import java.lang.IllegalArgumentException;
import java.util.Scanner;

public class Euklides {

    public static long euklides(long a, long b) {
        if(a < 1 || b < 1) {
            throw new IllegalArgumentException("Argumenty musza byc wieksze od zero!");
        }

        while(a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbe A: ");
        long a = sc.nextLong();
        System.out.print("Podaj liczbe B: ");
        long b = sc.nextLong();

        System.out.println("euklides(" + a + ", " + b + ") = " + euklides(a,b));
    }
}
