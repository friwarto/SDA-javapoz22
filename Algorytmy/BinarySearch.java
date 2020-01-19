package Algorytmy;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(long[] array, int start, int end, long n) {
        if(start > end) {
            return -1;
        }

        int center = (start + end) / 2;
        if(array[center] > n) {
            return binarySearch(array, start, center-1, n);
        } else if(array[center] < n) {
            return binarySearch(array, center + 1, end, n);
        } else {
            return center;
        }
    }

    public static int binarySearch(long[] array, long n) {
        return binarySearch(array, 0, array.length - 1, n);
    }

    public static void main(String[] args) {
        long[] liczby = {
                17, 18, 27, 33, 38, 55, 64, 66, 69, 77, 87, 99
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        long n = sc.nextLong();

        int index = binarySearch(liczby, n);
        if(index == -1) {
            System.out.println("Nie znaleziono");
        } else {
            System.out.println("Liczba " + n + " jest pod indeksem " + index);
        }
    }
}
