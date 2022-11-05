/*Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
Вывести массив на экран, после чего ввести с клавиатуры число k, найти индекс этого числа в массиве
сперва линейным поиском, потом двоичным и вывести на экран этот индекс, если число есть в массиве,
 и количество «шагов», которое каждый алгоритм потратил на выполнение задачи.
 */

import java.util.Scanner;

public class dz7 {
    public static void main(String[] args) {
        Scanner vod = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int N = vod.nextInt();
        System.out.print("Введите минимальное значение в массиве: ");
        int A = vod.nextInt();
        System.out.print("Введите максимальное значение в массиве: ");
        int B = vod.nextInt();
        if (N <= 0) {
            System.out.print("Длина менее одного значения. Введите длину повторно: ");
            N = vod.nextInt();
        } else if (A >= B) {
            System.out.println("Некорректный диапазон");
            System.out.print("Введите минимальное значение в массиве: ");
            A = vod.nextInt();
            System.out.print("Введите максимальное значение в массиве: ");
            B = vod.nextInt();
        }
        int[] massiv = new int[N];
        System.out.println("Массив: ");
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) ((Math.random() * (B - A)) + A);
            System.out.print(massiv[i] + ", ");
        }
        System.out.println(" ");
        System.out.print("Введите искомое число: ");
        int k = vod.nextInt();
        int ind = -1;
        int ind2=-1;
        int step = 0;
        int step2=0;
        for (int i = 0; i < massiv.length; i++) {
            step++;
            if (massiv[i] == k) {
                ind = i;
                break;
                //Предположим что всетаки мы ищем первое значение по порядку, если дублируются.

            }

        }
        if (ind >= 0) {
            System.out.println("Число " + k + " находится под индексом " + ind);
            System.out.println("Линейный поиск: " + step + " шаг(а/ов)");

          int li=0;
          int hi= massiv.length-1;
            while (li<=hi) {
                int mi=(li+hi)/2;
                step2++;
                if(k==massiv[mi]){
                    ind2=mi;
                    break;}
                else if (k<massiv[mi]){
                    hi=mi-1;            }
                else if (k>massiv[mi]){
                    li=mi+1;
                }
                /*Судя по примеру в дз сортировка по возрастанию не проводилась.
                Двоичный конечно здесь вообще не эффективен и не всегда найдет.
                Но если отсортировать то шагов будет больше и пример в задаче тогда не соответствует =(
                немного абсурдное задание
                 */
            }
            System.out.println("Двоичный поиск: " + step2 + " шаг(а/ов)");


        }
        else {System.out.println("Искомого числа " + k + " нет в массиве");}


    }

}
