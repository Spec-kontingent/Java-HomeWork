import java.util.Scanner;
import java.util.regex.Pattern;

public class dz8_2 {
    public static void main(String[] args) {
        String com = "^\\S+\\.com$";
        String name;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите ссылку");
            name = scan.nextLine();

            if (Pattern.matches(com, name)) {
                System.out.println("Данные приняты");
            } else {
                System.out.println("Ссылка введена некорректно, повторите ввод");
            }
        }
        while (!Pattern.matches(com, name));
    }

}
