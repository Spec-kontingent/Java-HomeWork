/*Дано целое число N (> 0). С помощью операций деления нацело и взятия остатка от деления:
определить имеется ли в записи числа N цифра «2»; найти число, полученное при прочтении числа
 N справа налево; найти количество и сумму его цифр. Использовать можно любое количество циклов,
 но чем меньше, тем лучше
 */

import java.util.Scanner;

public class dz7 {
    public static void main(String[] args) {
        Scanner vod = new Scanner(System.in);
        System.out.print("Введите число N больше 0: ");
        int N = vod.nextInt();
        int del = N;
        int c2 = 0;
        int kol = 0;
        int sum = 0;
        int ost;
        if (N <= 0) {
            System.out.println("Число N меньше или равно 0, попробуйте еще раз");
        } else {
            System.out.print("Введенное число справо на лево-");
            for (; del > 0; kol++) {
                ost = del % 10;
                del = del / 10;
                System.out.print(ost);
                sum = sum + ost;
                if (ost == 2) {
                    c2++;
                }
            }
            System.out.println(" ");
            //Пока не знаем как все красиво оформлять

            System.out.println("Количество цифры '2' в числе N составляет - " + c2);
            System.out.println("Количество цифр в числе N - " + kol);
            System.out.println("Сумма цифр в числе N составляет - " + sum);
        }


    }
}
