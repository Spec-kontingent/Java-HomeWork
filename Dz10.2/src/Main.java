import java.io.*;

public class Main {
    public static void main(String[] args) {

        try(FileReader read1 = new FileReader("C:\\Users\\Ann\\Desktop\\Java\\HomeWork\\Dz10.2\\Katalog\\Hello.txt");
            FileReader read2 = new FileReader("C:\\Users\\Ann\\Desktop\\Java\\HomeWork\\Dz10.2\\Katalog\\my.txt");
            FileReader read3 = new FileReader("C:\\Users\\Ann\\Desktop\\Java\\HomeWork\\Dz10.2\\Katalog\\friends.txt");
            FileWriter writer = new FileWriter("C:\\Users\\Ann\\Desktop\\Java\\HomeWork\\Dz10.2\\Katalog\\result.txt",false)){
            int c;
            while((c=read1.read())!=-1){

                writer.append((char)c);}
                writer.append(" ");
            int a;
            while((a=read2.read())!=-1){

                writer.append((char)a);}
            writer.append(" ");
            int b;
            while((b=read3.read())!=-1){

                writer.append((char)b);}
            writer.append(" ");

        }
        catch (Exception ex){ex.printStackTrace();}

    }
}