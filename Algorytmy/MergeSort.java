package Algorytmy;

public class MergeSort {
/*
    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> wynik = new List<>();
    }
*/
    public static void merge(long[] a, long[] left, long[] right) {
        int count = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        // While both left[] and right[] are non-empty,
        // we need to pick the smaller element from the start
        while(count < a.length && leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                a[count] = left[leftIndex];
                leftIndex += 1;
            } else {
                a[count] = right[rightIndex];
                rightIndex += 1;
            }
            count += 1;
        }

        // If there is still stuff left in left[], add it to a[]
        while(leftIndex < left.length) {
            a[count] = left[leftIndex];
            leftIndex += 1;
            count += 1;
        }

        // If there is still stuff left in right, add it to a[]
        while(rightIndex < right.length) {
            a[count] = right[rightIndex];
            rightIndex += 1;
            count += 1;
        }
    }

    public static void sort(long[] a) {
        int n = a.length;
        if(n <= 1) return;

        int half = n/2;

        long[] left = new long[half];
        for(int i = 0; i < half; ++i) {
            left[i] = a[i];
        }

        long[] right = new long[n - half];
        for(int i = 0; i < n - half; ++i) {
            right[i] = a[half + i];
        }

        sort(left);
        sort(right);

        merge(a, left, right);
    }

    public static void main(String[] args) {
        long[] liczby = {
                347 , 891 , 119 , 843 , 759 , 543 , 449 , 778 , 587 , 527 , 683 , 429 , 783 , 626 , 612 ,
                164 , 425 , 424 , 746 , 246 , 184 , 526 , 458 , 200 , 267 , 200 , 353 , 258 , 182 , 147 ,
                663 , 234 , 315 , 722 , 356 , 551 , 940 , 742 , 591 , 203 , 708 , 510 , 365 , 868 , 629 ,
                630 , 610 , 651 , 680 , 917 , 592 , 378 , 612 , 692 , 947 , 770 , 101 , 719 , 963 , 909 ,
                756 , 824 , 748 , 419 , 466 , 813 , 855 , 853 , 705 , 494 , 353 , 505 , 811 , 562 , 161 ,
                431 , 302 , 584 , 151 , 269 , 760 , 764 , 926 , 136 , 850 , 653 , 648 , 976 , 392 , 887 ,
                291 , 674 , 941 , 629 , 308 , 849 , 218 , 723 , 748 , 174 , 375 , 178 , 175 , 503 , 198 ,
                616 , 943 , 781 , 340 , 301 , 157 , 223 , 222 , 992 , 261 , 273 , 981 , 261 , 815 , 974 ,
                437 , 669 , 796 , 792 , 320 , 737 , 670 , 884 , 330 , 505 , 650 , 830 , 416 , 463 , 924 ,
                997 , 156 , 404 , 251 , 555 , 562 , 398 , 627 , 291 , 261 , 320 , 562 , 597 , 147 , 315 ,
                949 , 952 , 306 , 452 , 706 , 866 , 945 , 356 , 973 , 829 , 716 , 929 , 451 , 455 , 110 ,
                657 , 784 , 874 , 457 , 361 , 631 , 378 , 561 , 934 , 259 , 537 , 459 , 810 , 173 , 929 ,
                204 , 164 , 240 , 420 , 858 , 605 , 748 , 313 , 597 , 336 , 904 , 960 , 993 , 214 , 826 ,
                948 , 968 , 200 , 938 , 867 , 358 , 288 , 541 , 216 , 342 , 495 , 399 , 224 , 968 , 656 ,
                238 , 701 , 330 , 801 , 622 , 473 , 695 , 469 , 944 , 564 , 479 , 454 , 727 , 106 , 987 ,
                214 , 441 , 999 , 664 , 305 , 141 , 683 , 212 , 824 , 571 , 415 , 952 , 174 , 477 , 753 ,
                921 , 940 , 880 , 766 , 918 , 845 , 631 , 105 , 564 , 428 , 385 , 677 , 369 , 256 , 707 ,
        };

        sort(liczby);
        for(int i = 0; i < liczby.length; ++i) {
            if((i != 0) && (i % 15 == 0)) System.out.println();

            System.out.print(liczby[i] + ", ");
        }
    }
}
