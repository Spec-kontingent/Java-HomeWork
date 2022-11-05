/*Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
Выведите массив на экран, после чего инвертируйте его и выведите уже отсортированный массив
 */


import java.util.Scanner;

public class dz6 {
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
        System.out.println("Массив: ");
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) ((Math.random() * (B - A)) + A);
            System.out.print(massiv[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("Отсотрированный массив: ");
        for (int i =0;i< massiv.length/2;i++){
            int temp=massiv[i];
            massiv[i]=massiv[massiv.length-i-1];
            massiv[massiv.length-i-1]=temp;
        }
        for(int i=0;i< massiv.length;i++){
            System.out.print(massiv[i] + ", ");}
    }
}
