import java.util.Arrays;

public class MainClass {
    // задание 1
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[i]--;
            } else {
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    // задание 2
    public static void arrayEight(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i <= 21; i++) {
            arr[i] += 3;
        }
        System.out.println(Arrays.toString(arr));
    }
    //задание 3
    public static void multiplyArray(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    // задание 4 (не доделал)
    public static void tableArray(String[] args) {
        int counter = 0;
        int[][] table = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = counter;
                System.out.println(table[i][j] + " ");
                counter++;
            }
            System.out.println(Arrays.toString(table));
        }
    }
}