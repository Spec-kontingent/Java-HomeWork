import java.util.Scanner;

/*Даны положительные числа A и B (A > B). На отрезке длины A размещено максимально возможное
 количество отрезков длины B (без наложений). Не используя операции умножения и деления,
 найти длину незанятой части отрезка A.
 */
public class dz5 {
    public static void main(String[] args) {
        Scanner vod = new Scanner(System.in);
        System.out.print("Введите положительное число В: ");
        int B= vod.nextInt();
        System.out.print("Введите положительное число А, которое больше В: ");
        int A= vod.nextInt();
        if (A<=B){System.out.println("Числа введены неверно, попробуйте еще раз");}
        else{
            int d=A;
            while (d>=B) {
                d=d-B;
            }
            System.out.println("Незанятый остаток равен "+d);
            }
        }

}
