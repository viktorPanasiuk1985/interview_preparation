package lesson2;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(a);
        Arrays.stream(a).distinct().forEach(System.out::println);
    }
}
