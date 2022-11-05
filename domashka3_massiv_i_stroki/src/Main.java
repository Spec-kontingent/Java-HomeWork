/*Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в
строку.Определить и вывести на экран сообщение о том, является ли массив строго
возрастающей последовательностью
 */


public class Main {
    public static void main(String[] args) {
        int[] massiv = new int[4];
        int max = 99;
        int min = 10;
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) ((Math.random() * (max - min)) + min);
            System.out.print(massiv[i] + ", ");
        }
        if (massiv[0]<massiv[1]&massiv[1]<massiv[2]&massiv[2]<massiv[3]) {
            System.out.println("Массив строго возрастающий");
        } else {

                System.out.println("Массив НЕ строго возрастающий");
            }


        }

    }
