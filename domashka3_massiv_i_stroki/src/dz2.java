/*Попросить пользователя ввести с клавиатуры сперва размер массива, потом нижний
 диапазон значений и верхний. После чего создать массив размером, который ввел
  пользователь и заполнить его случайными числами из диапазона, введенного пользователем.
   Если пользователь ввел неверные значения (отрицательный размер массива, нижняя граница
   диапазона больше верхнего и т.д.) попросить его ввести значение ещё раз и перезаписать
   старое значение новым. Вывести массив на экран (Для этого удобнее пользоваться не println, а print)
 */


import java.util.Scanner;
public class dz2 {
    public static void main(String[] args) {
            Scanner vod = new Scanner(System.in);
            System.out.print("Введите длинну массива: ");
            int d= vod.nextInt();
        System.out.print("Введите минимальное значение в массиве: ");
        int min= vod.nextInt();
        System.out.print("Введите максимальное значение в массиве: ");
        int max= vod.nextInt();
        if (d<=0) {
            System.out.print("Длина менее одного значения. Введите длину повторно: ");
            d= vod.nextInt();
        }
        else if (min>=max){
            System.out.println("Некорректный диапазон");
            System.out.print("Введите минимальное значение в массиве: ");
            min= vod.nextInt();
            System.out.print("Введите максимальное значение в массиве: ");
            max= vod.nextInt();
        }
        int[] massiv = new int[d];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) ((Math.random() * (max - min)) + min);
            System.out.print(massiv[i] + ", ");
        }
}

}
