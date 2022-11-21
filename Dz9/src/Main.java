import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<HeavyBox> spisok = new ArrayList<HeavyBox>();

        spisok.add(new HeavyBox("Никита", 32));
        spisok.add(new HeavyBox("Светлана", 4));
        spisok.add(new HeavyBox("Денис", 15));
        for (HeavyBox i : spisok) {
            System.out.println(i.toString());
        }
        System.out.println();

        spisok.get(0).setWeight(1);

        for (HeavyBox i : spisok) {
            System.out.println(i.toString());
        }
        spisok.remove(spisok.size() - 1);
        System.out.println();
        for (HeavyBox i : spisok) {
            System.out.println(i.toString());
        }
        System.out.println();
        spisok.clear();

        System.out.println("Все объекты удалены");


    }
}