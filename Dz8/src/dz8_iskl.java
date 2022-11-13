import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dz8_iskl {
    public static void main(String[] args) throws IncorrectInfoException {
        String fio;
        int age;
        String regex="[[\\W&&[^а-яА-ЯёЁ\\s]][\\d?_]]";
        int a=0;
        Scanner scan = new Scanner(System.in);
        do{
        System.out.println("Введите ФИО через пробел: ");
        fio = scan.nextLine();
        System.out.println("Введите ваш возрост : ");
        age = scan.nextInt();
            scan.nextLine();
            Pattern pat = Pattern.compile(regex);
            Matcher mat = pat.matcher(fio);
        try {
            if (age > 100 | age < 0) {
                a=-3;
                throw new IncorrectInfoException("Возрост введен некоректно "+age+" "+fio,age);
            }
            if (fio.length() > 200|mat.find()) {
                a=-2;
                throw new IncorrectInfoException("ФИО введено некорректно  "+age+" "+fio,fio);
            }

            else {a=0;System.out.println("Данные введены верно!");}
        }
        catch (IncorrectInfoException ex){
            ex.printStackTrace();


        }


        }
        while (a!=0);

    }
}
