public class Main {
    public static void main(String[] args) {

        int a= 3;
        int d=56;
        StringBuilder str = new StringBuilder ();
        str.append(String.format("%d + %d = %d\n",a,d,a+d));
        str.append(String.format("%d - %d = %d\n",a,d,a-d));
        str.append(String.format("%d * %d = %d\n",a,d,a*d));
        System.out.println(str);
        str.replace(7,8,"равно") ;
        str.replace(23,24,"равно");
        str.replace(40,41,"равно");
        System.out.println(str);



    }
}