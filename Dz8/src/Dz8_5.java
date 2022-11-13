import java.util.Scanner;
import java.util.regex.Pattern;

public class Dz8_5 {
    public static void main(String[] args) {
        String str = "^(1\\d\\d\\d|200\\d|201[0-2])\\/(0?[1-9]|1[0-2])\\/(0?[1-9]|[1-2]\\d|30)\\s([0-1]\\d|2[0-4]):([0-5]\\d)$";
        String data;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите дату");
            data = scan.nextLine();

            if (Pattern.matches(str, data)) {
                System.out.println("Дата верная");
            } else {
                System.out.println("Дата введена некорректно, повторите ввод");
            }
        }
        while (!Pattern.matches(str, data));
    }

}

