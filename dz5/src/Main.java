import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone p1=new Phone(80293332211L,"POCO",5);
        Phone p2=new Phone(80291112233L,"Xiaomi",4);
        Phone p3=new Phone(80292221133L,"iPhone",6);
        System.out.println(p1.getNumber()+", "+p1.getModel()+", "+p1.getWeight());
        System.out.println(p2.getNumber()+", "+p2.getModel()+", "+p2.getWeight());
        System.out.println(p3.getNumber()+", "+p3.getModel()+", "+p3.getWeight());
        System.out.println("\n");

        System.out.println("Примите вызов: ");
        p1.receiveCall("Ярополк");
        p2.receiveCall("Даздраперма");
        p3.receiveCall("Зинаида");
        System.out.println("\n");

        System.out.println("Примите вызов: ");
        p1.receiveCall("Ярополк", p1.getNumber());
        p2.receiveCall("Даздраперма",p2.getNumber());
        p3.receiveCall("Зинаида",p3.getNumber());
        System.out.println("\n");

        System.out.println("Сообщения будут отправлены по номерам: ");
        Phone.sendMessage(p1.getNumber(),p2.getNumber(),p3.getNumber());


    }
}