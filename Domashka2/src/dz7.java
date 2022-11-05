public class dz7 {
    public static void main(String[] args) {
        int D = 7;
        int M = 8;
        String c;
        if (D < 1 | D > 31| M < 1 | M > 12) {System.out.println("Дата рождения введена неверно");}
        //Безумно верим в условие задачи что даты все таки даны верные, но попытаемся проверять
        else {

        if (D<=9) {c=String.format(M+".0"+D);}
        else {c=String.format(M+"."+D);}
        double C=Double.parseDouble(c);

        //Совсем чуть чуть погуглили  т.к. спать уже хочется


            if ((C >= 1.20 & C <= 1.31) | (C >= 2.01 & C <= 2.18)) {
                System.out.println("Водолей");
            }
            else if ((C >= 2.19 & C <= 2.29) | (C >= 3.01 & C <= 3.20)) {
                System.out.println("Рыбы");
            }
            else if ((C >= 3.21 & C <= 3.31) | (C >= 4.01 & C <= 4.19)) {
                System.out.println("Овен");
            }
            else if ((C >= 4.20 & C <= 4.30) | (C >= 5.01 & C <= 5.20)) {
                System.out.println("Телец");
            }
            else if ((C >= 5.21 & C <= 5.31) | (C >= 6.01 & C <= 6.21)) {
                System.out.println("Близнецы");
            }
            else if ((C >= 6.22 & C <= 6.30) | (C >= 7.01 & C <= 7.22)) {
                System.out.println("Рак");
            }
            else if ((C >= 7.23 & C <= 7.31) | (C >= 8.01 & C <= 8.22)) {
                System.out.println("Лев");
            }
            else if ((C >= 8.23 & C <= 8.31) | (C >= 9.01 & C <= 9.22)) {
                System.out.println("Дева");
            }
            else if ((C >= 9.23 & C <= 9.330) | (C >= 10.01 & C <= 10.22)) {
                System.out.println("Весы");
            }
            else if ((C >= 10.23 & C <= 10.31) | (C >= 11.01 & C <= 11.22)) {
                System.out.println("Скорпион");
            }
            else if ((C >= 11.23 & C <= 11.30) | (C >= 12.01 & C <= 12.21)) {
                System.out.println("Стрелец");
            }
            else if ((C >= 12.22 & C <= 12.31) | (C >= 1.01 & C <= 1.19)) {
                System.out.println("Рыбы");
            }
            else {
                System.out.println("Проверьте введенную дату");
            }
        }

        }
    }

