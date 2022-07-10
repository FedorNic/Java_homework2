// 2. Написать метод, который будет эмулировать работу динамического массива (Без исопользования коллекций), 
//протестировать можно при выводе последовательности треугольного числа до n
// Пример:
// 1
// 1 3
// 1 3 6

package HT_2;
import java.util.Scanner;

public class HT_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите целое число n, начиная от 1");
        System.out.println("Я напишу его треугольную последовательность =)");
        int n = iScanner.nextInt();
        int num;
        System.out.println();
        int[] arr = new int[0];
        for (int i = 1; i <=n; i++) {
            num = (i * (i + 1)) / 2;
            arr = DinamicArray(arr, num);
        }
        System.out.println("Последовательность равна - ");
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        iScanner.close();
    }

    public static int[] DinamicArray(int[] array, int number) {
        int[]darr = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            darr[i] = array[i];
        }
        darr[darr.length - 1] = number;
        return darr;
    }
}