//Реализовать подсчет факториала используя цикл for. Результат вывести на экран
import java.util.Scanner;
public class dz3 {
    public static void main(String[] args) {
        Scanner vod = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a= vod.nextInt();
        long fac=1;
        for (int f=1;f<=a;f++){
            fac=f*fac;
        }
        System.out.println("Факториал числа " +a+" равен - "+fac);
    }
}
