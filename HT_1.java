// 1. У вас есть отсортированный массив (Можете сами сгенерировать и использовать любой 
//удобный вам алгоритм сортировки (кроме пузырька)), нужно используя минимальное 
//колличество попыток найти загаданное число (Алгоритм бинарного поиска).

package HT_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HT_1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 10 для поиска");
        System.out.println("Я найду его индекс в массиве или скажу, что его нет =)");
        int find = iScanner.nextInt();
        initArray(arr);
        sortArray(arr);
        printArray(arr);
        if (Search(arr, find, 0, arr.length - 1) == -1) {
            System.out.println();
            System.out.println("Такого числа нет");
        } else {
            System.out.println();
            System.out.println("Индекс = " + Search(arr, find, 0, arr.length - 1));
        }
        iScanner.close();
    }
    public static int[] initArray(int[] Array) {    
        Random num = new Random();
        for (int index = 0; index < Array.length; index++) {
            Array[index] = num.nextInt((10 - 1) + 1) + 1;
            // System.out.print(arr[index] + " ");
        }
        return Array;
    }

    public static int[] sortArray(int[] Array) {
        Arrays.sort(Array);
        System.out.println();
        // System.out.println(Arrays.toString(arr));
        return Array;
    }

    public static void printArray(int[] Array) {    
        for (int index = 0; index < Array.length; index++) {
            System.out.print(Array[index] + " ");
        }
    }
    private static int Search(int[] Array, int find, int low, int high) {
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (Array[mid] < find) {
                low = mid + 1;
            } else if (Array[mid] > find) {
                high = mid - 1;
            } else if (Array[mid] == find) {
                index = mid;
                break;
            }
        }
        return index;
    }
}