package lesson1;

import java.util.Arrays;

public class TwoPointers {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,2,3};
        removeDuplicate(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    // 1 1 1 1 2 2 3 3 4 4 5 6 7 8

    // Step 1
    // i = 0 : 1
    // j = 1 : 1

    // 1 2 2 3

    public static int removeDuplicate(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
                System.out.println(arr[i]);
            }
        }
        return i + 1;
    }


}
