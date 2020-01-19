package Algorytmy;

import java.lang.IllegalArgumentException;
import java.util.Scanner;

public class Silnia {

    public static long silnia(long n) {
        if(n < 0) {
            throw new IllegalArgumentException("Argument do silnia() nie moze byc ujemny");
        }

        long iloczyn = 1;
        while(n > 1) {
            iloczyn *= n;
            n -= 1;
        }
        return iloczyn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbe: ");
        int n = sc.nextInt();

        System.out.println(n + "! = " + silnia(n));
    }
}
