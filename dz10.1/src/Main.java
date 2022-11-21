import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int action;
        ArrayList<Reader> readers=FileUtil.restoreReadersList();
        do {System.out.println("\nВыберите действие: \n1 - Добавить нового читателя." +
                "\n2 - Читатель хочет взять книгу. \n3 - Читатель хочет вернуть книгу." +
                "\n4 - Вывести статус читателя. \n5 - Вывести статусы всех читателей. \n6 - Выход из программы.");
        action= scan.nextInt();
        scan.nextLine();
        switch (action){
            case 1: {
                readers.add(new Reader());
                System.out.print("Введите Фамилию читателя: ");
                        readers.get(readers.size()-1).setSurname(scan.nextLine());
                        System.out.print("Введите Имя читателя: ");
                        readers.get(readers.size()-1).setName(scan.nextLine());
                        System.out.print("Введите Отчество читателя: ");
                        readers.get(readers.size()-1).setOtchestvo(scan.nextLine());
                        System.out.print("Введите Номер читательского билета: ");
                        readers.get(readers.size()-1).setBilet(scan.nextInt());
                        scan.nextLine();
                        System.out.print("Введите Факультет читателя: ");
                        readers.get(readers.size()-1).setFacultet(scan.nextLine());
                        System.out.print("Введите дату рождения: ");
                        readers.get(readers.size()-1).setBorn(scan.nextLine());
                        System.out.print("Введите Номер телефона читателя: ");
                        readers.get(readers.size()-1).setTelefon(scan.nextInt());
                        scan.nextLine();

                        System.out.print("Читатель добавлен под номером " + readers.get(readers.size()-1).getBilet());
                        break;

                }

            case 2: {
                System.out.print("Введите название книги: ");
                String name = scan.nextLine();
                System.out.print("Введите Автора книги: ");
                String authorName = scan.nextLine();
                System.out.print("Введите Номер читательского билета: ");
                int bilet = scan.nextInt();
                scan.nextLine();
                boolean i = true;
                for (Reader r:readers){
                if(r.getBilet()==bilet){
                    r.takeBook(name,authorName);
                    i=false;
                }
                }
                 if (i){
                    System.out.println("Такого читателя нет.");

                }
                break;
            }
            case 3:{
                System.out.print("Введите название книги: ");
                String name = scan.nextLine();
                Book book = new Book(name);
                System.out.print("Введите Номер читательского билета: ");
                int bilet = scan.nextInt();
                scan.nextLine();
                boolean i = true;
                for (Reader r:readers){
                    if(r.getBilet()==bilet){
                        r.returnBook(book);
                        i=false;
                    }
                }
                    if (i){
                        System.out.println("Такого читателя нет.");

                    }
                break;
            }
            case 4:{
                System.out.print("Введите Номер читательского билета: ");
                int bilet = scan.nextInt();
                scan.nextLine();
                boolean i = true;
                for (Reader r:readers) {
                    if (r.getBilet() == bilet) {
                        r.printStatus();
                        i = false;
                    }
                }
                    if (i){
                        System.out.println("Такого читателя нет.");

                    }


                break;

            }
            case 5:{

                for (Reader r:readers){
                    r.printStatus();

                    }

                break;
            }
            case 6:{
                FileUtil.saveReadersList(readers);
                System.out.println("Программа завершена.");
                break;
            }
            default:{
                System.out.println("Нет такой команды");
            }

            }
        }
        while (action!=6);



    }
}