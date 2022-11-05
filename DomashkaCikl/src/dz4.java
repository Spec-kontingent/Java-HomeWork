/*Даны два целых числа A и B (A < B). Вывести в порядке убывания все целые числа, расположенные
между A и B (не включая числа A и B), а также количество N этих чисел.
 */


import java.util.Scanner;

public class dz4 {
    public static void main(String[] args) {
        Scanner vod = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int A= vod.nextInt();
        System.out.print("Введите число B, которое больше А: ");
        int B= vod.nextInt();
        if (A>=B){System.out.println("Числа введены неверно, попробуйте еще раз");}
        else{
            int ch=B-1;
            int N=0;
        for (int out=ch;out>A;out--){
            System.out.print(out+", ");
             N++;}
            System.out.println("Количество чисел - "+N);}

    }
}
