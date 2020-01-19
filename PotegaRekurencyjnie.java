package Algorytmy;

import java.lang.IllegalArgumentException;
import java.util.Scanner;

public class PotegaRekurencyjnie {

    public static long potega(long liczba, long wykladnik) {
        if(wykladnik < 0) {
            throw new IllegalArgumentException("Wykladnik nie moze byc ujemny");
        }

        if(wykladnik == 0) {
            return 1;
        }

        long w;
        if(wykladnik % 2 == 0) {
            w = potega(liczba, wykladnik / 2);
            w *= w;
        } else {
            w = potega(liczba, wykladnik - 1);
            w *= liczba;
        }
        return w;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbe do spotegowania: ");
        int x = sc.nextInt();

        System.out.print("Podaj wykladnik: ");
        int n = sc.nextInt();

        System.out.println(x + "**" + n + " = " + potega(x,n));
    }
}
