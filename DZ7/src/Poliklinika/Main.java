package Poliklinika;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animals pet = null;
        System.out.println("Здравствуйте! Расскажите про вашего питомца! ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя питомца: ");
        String name = scan.nextLine();
        System.out.print("Введите возрост питомца: ");
        int age = scan.nextInt();
        scan.nextLine();
        int vid;
        do {
            System.out.print("Выберите вид питомца \n 1-Кот \n 2-Собака \n 3-Крыса \n");
            vid = scan.nextInt();
            scan.nextLine();

            switch (vid) {
                case 1: {
                    pet = new Cat(name, age);
                    break;
                }
                case 2: {
                    pet = new Dog(name, age);
                    break;
                }
                case 3: {
                    pet = new Rat(name, age);
                    break;
                }
                default:
                    System.out.println("Нет такого вида, повторите ваш выбор.");
            }

        }
        while (vid!=(1|2|3));

        pet.makeNoise();




    }
}