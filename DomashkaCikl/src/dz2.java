//Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.

public class dz2 {
    public static void main(String[] args) {
        int number=1;

        do {
            if (number%5==0) {  System.out.print(number+", ");}
            number++;
        }
        while (number<=100);
    }
}
