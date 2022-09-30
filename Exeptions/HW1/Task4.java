package HW1;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] arr) {
        int[] firstArr = new int[] { 4, 6, 8, 9 };
        int[] secondArr = new int[] { 7, 3, 12, 5 };
        System.out.println(Arrays.toString(fillArray(firstArr, secondArr)));
    }

    public static int[] fillArray(int[] array, int[] arr) {
        int[] thirdArr = new int[array.length];
        try {
            for (int i = 0; i < thirdArr.length; i++) {
                thirdArr[i] = array[i] / arr[i];
            }
        } catch (RuntimeException e) {
            System.out.println("Длина массивов отличается");
        }
        return thirdArr;
    }

}
