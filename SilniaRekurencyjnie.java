package Algorytmy;

import java.lang.IllegalArgumentException;
import java.util.Scanner;

public class SilniaRekurencyjnie {

    public static long silnia(long n) {
        if(n < 0) {
            throw new IllegalArgumentException("Argument do silnia() nie moze byc ujemny");
        }

        if(n > 1) {
            return n * silnia(n-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbe: ");
        int n = sc.nextInt();

        System.out.println(n + "! = " + silnia(n));
    }
}
