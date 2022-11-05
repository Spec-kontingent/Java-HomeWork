/*Создать и проинициализировать массив из 20 элементов. Ввести с клавиатуры число n и найти,
есть ли оно в массиве, и, если есть, вывести его индекс на экран. Использовать линейный поиск
 */


import java.util.Scanner;

public class dz5 {
    public static void main(String[] args) {
        int[] massiv = new int[20];
        int max = 99;
        int min = 1;
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) ((Math.random() * (max - min)) + min);
            System.out.print(massiv[i] + ", ");
        }
        System.out.println("  ");
        Scanner vod = new Scanner(System.in);
        System.out.print("Введите искомое число: ");

        int n = vod.nextInt();
        int ind = -1;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == n) {
                ind = i;
                System.out.println("Число " + n + " находится под индексом " + ind);
            }
            /* Вставила принтелент в цикл и без брейка т.к. очень часто рандомные числа повторяюся и индекс
             может быть не один

             */

        }
        if (ind < 0) {

                System.out.println("Искомого числа " + n + " нет в массиве");

        }
    }
}
