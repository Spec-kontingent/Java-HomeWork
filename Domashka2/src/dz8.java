public class dz8 {
    public static void main(String[] args) {
        int D = 11;
        int M =3;
        String mas;
        String dos;
        if (D<6|D>14|M<1|M>4) {System.out.println("Нет такой карты");}
        else {
            if (M==1) {mas=String.format("пик");}
            else if (M==2) {mas=String.format("треф");}
            else if (M==3) {mas=String.format("бубен");}
            else  {mas=String.format("червей");}

            if (D==6) {dos=String.format("шестерка");}
            else if (D==7) {dos=String.format("семерка");}
            else if (D==8) {dos=String.format("восьмерка");}
            else if (D==9) {dos=String.format("девятка");}
            else if (D==10) {dos=String.format("десятка");}
            else if (D==11) {dos=String.format("валет");}
            else if (D==12) {dos=String.format("дама");}
            else if (D==13) {dos=String.format("король");}
            else  {dos=String.format("туз");}

            System.out.println(dos+" "+mas);
            }
        }

}
