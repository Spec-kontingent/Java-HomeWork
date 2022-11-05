/*Написать программу, в которой вводятся с клавиатуры сперва строка, а потом символ.
 После чего в консоль выводится количество вхождений символа в строку. Например, строка «Java 11»,
 символ «a», результат: 2
 */


import java.util.Scanner;

public class stroki1 {
    public static void main(String[] args) {
        Scanner vod = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String N = vod.nextLine();
        System.out.print("Введите символ: ");
        String B = vod.nextLine();
        char[] sim = B.toCharArray();
        if (N.isEmpty() | B.isEmpty() | sim.length > 1) {
            System.out.print("Некорректное заполнение полей. Введите строку: ");
            N = vod.nextLine();
            System.out.print("Введите символ: ");
            B = vod.nextLine();
        } else {
            char[] str = N.toCharArray();
            int step = 0;
            for (int i = 0; i < str.length; i++) {
                if (str[i] == sim[0]) {
                    step++;
                }
            }
            if (step == 0) {

                System.out.println("Искомого символа " + "'"+ B + "'"+ " нет в строке");
            }
            else {
                System.out.println("В строке " + "'"+N+ "'"+" "+ step + " символ(а) " + "'"+ B+ "'");


            }


        }
    }
}
