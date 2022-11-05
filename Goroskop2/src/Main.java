public class Main {
    public static void main(String[] args) {
        int D = 21;
        int M = 6;

        if (D < 1 | D > 31| M < 1 | M > 12) {System.out.println("Дата рождения введена неверно");}
        //Что-то сильно творческий порыв был в первом варианте попробуем проще
        else {

            if ((M==1&D>=20&D<=31) | (M==2&D>=1&D<=18)) {
                System.out.println("Водолей");
            }
            else if ((M==2&D>=19&D<=29) | (M==3&D>=1&D<=20)) {
                System.out.println("Рыбы");
            }
            else if ((M==3&D>=21&D<=31) | (M==4&D>=1&D<=19)) {
                System.out.println("Овен");
            }
            else if((M==4&D>=20&D<=310) | (M==5&D>=1&D<=20)) {
                System.out.println("Телец");
            }
            else if ((M==5&D>=21&D<=31) | (M==6&D>=1&D<=21)) {
                System.out.println("Близнецы");
            }
            else if((M==6&D>=22&D<=30) | (M==7&D>=1&D<=22))  {
                System.out.println("Рак");
            }
            else if ((M==7&D>=23&D<=31) | (M==8&D>=1&D<=22)) {
                System.out.println("Лев");
            }
            else if ((M==8&D>=23&D<=31) | (M==9&D>=1&D<=22)) {
                System.out.println("Дева");
            }
            else if((M==9&D>=23&D<=30) | (M==10&D>=1&D<=22))  {
                System.out.println("Весы");
            }
            else if ((M==10&D>=23&D<=31) | (M==11&D>=1&D<=22)) {
                System.out.println("Скорпион");
            }
            else if((M==11&D>=23&D<=30) | (M==12&D>=1&D<=21)) {
                System.out.println("Стрелец");
            }
            else if ((M==12&D>=22&D<=31) | (M==1&D>=1&D<=19))  {
                System.out.println("Рыбы");
            }
            else {
                System.out.println("Проверьте введенную дату");
            }
        }

    }
}

