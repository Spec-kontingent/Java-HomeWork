public class dz6 {
    public static void main(String[] args) {
        int a = 245;
        if (a >= 0 & a <= 999) {
            if (a >= 0 & a <= 9) {
                if (a % 2 == 0) {
                    System.out.println("четное однозначное число");
                }
                else {
                    System.out.println("нечетное однозначное число");
                }
            }
            else if (a >= 10 & a <= 99) {
                if (a % 2 == 0) {
                    System.out.println("четное двухзначнон число");
                }
                else {
                    System.out.println("нечетное двухзначное число");
                }
            }
            else {
                if (a % 2 == 0) {
                    System.out.println("четное трехзначное число");
                }
                else {
                    System.out.println("нечетное трехзначное число");
                }

            }
        }
        else {System.out.println("Переменная а не входит в диапазон от 0 до 999");}

    }
}