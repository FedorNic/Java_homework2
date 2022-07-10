// 1. У вас есть отсортированный массив (Можете сами сгенерировать и использовать любой 
//удобный вам алгоритм сортировки (кроме пузырька)), нужно используя минимальное 
//колличество попыток найти загаданное число (Алгоритм бинарного поиска).

package HT_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HT_1 {
    public static void main(String[] args) {
        Random num = new Random();
        int[] arr = new int[5];
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 10 для поиска");
        System.out.println("Я найду его индекс в массиве или скажу, что его нет =)");
        int find = iScanner.nextInt();
        for (int index = 0; index < arr.length; index++) {
            arr[index] = num.nextInt((10 - 1) + 1) + 1;
            // System.out.print(arr[index] + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        if (Search(arr, find, 0, arr.length - 1) == -1) {
            System.out.println("Такого числа нет");
        } else {
            System.out.println();
            System.out.println("Индекс = " + Search(arr, find, 0, arr.length - 1));
        }
        iScanner.close();
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