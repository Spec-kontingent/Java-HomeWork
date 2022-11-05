/*Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B
вводятся с клавиатуры. Определите какой элемент является в этом массиве максимальным
 и сообщите его индекс
 */


import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
        Scanner vod = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int N= vod.nextInt();
        System.out.print("Введите минимальное значение в массиве: ");
        int A= vod.nextInt();
        System.out.print("Введите максимальное значение в массиве: ");
        int B= vod.nextInt();
        if (N<=0) {
            System.out.print("Длина менее одного значения. Введите длину повторно: ");
            N= vod.nextInt();
        }
        else if (A>=B){
            System.out.println("Некорректный диапазон");
            System.out.print("Введите минимальное значение в массиве: ");
            A= vod.nextInt();
            System.out.print("Введите максимальное значение в массиве: ");
            B= vod.nextInt();
        }
        int[] massiv = new int[N];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) ((Math.random() * (B - A)) + A);
            System.out.print(massiv[i] + ", ");
        }
        int imax=0;
        for (int i=0;i<massiv.length;i++){
            if (massiv[i]>massiv[imax]){imax=i;}

        }

        System.out.println("  Максимальное число "+massiv[imax]+" под индексом "+imax);

    }
}
