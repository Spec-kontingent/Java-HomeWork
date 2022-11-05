/*С клавиатуры вводится любая строка. Если она пустая, выводится сообщение с просьбой повторить ввод.
 Далее с клавиатуры вводятся два символа (a и b), после чего нужно вывести строку, в которой все символы
  a нужно заменить на символы b. Пример: срока – «Java 11», символы «1» и «H», результат «Java HH»
 */


import java.util.Scanner;

public class stroki2 {
    public static void main(String[] args) {
        Scanner vod = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String N = vod.nextLine();

        if (N.isEmpty()) {
            System.out.print("Некорректное заполнение полей. Введите строку: ");
            N = vod.nextLine();

        }
        System.out.print("Введите символ 1: ");
        String a = vod.nextLine();
        System.out.print("Введите символ 2: ");
        String b = vod.nextLine();
        char[] sima = a.toCharArray();
        char[] simb = b.toCharArray();
        if(b.isEmpty()|a.isEmpty() | sima.length > 1| simb.length > 1) {
            System.out.print("Некоректное заполнение полей. Введите символ 1: ");
            a = vod.nextLine();
            System.out.print("Введите символ 2: ");
            b = vod.nextLine();}

        char[] str = N.toCharArray();
        int step=0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == sima[0]) {
                str[i]=simb[0];
            step++;}
            }

        if(step==0){System.out.println("В строке " + "'"+ N + "'"+ " нет символа"+ "'"+ a + "'");}
        else {System.out.print(str);}
        }
}


