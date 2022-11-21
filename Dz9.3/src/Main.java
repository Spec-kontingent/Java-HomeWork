import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Product> map = new HashMap<Integer,Product>();
        map.put(1,new Product("Камера",5));
        map.put(2,new Product("Монитор",8));
        map.put(3,new Product("Регистратор",3));
        map.put(4,new Product("Пиемопередатчик",12));
        for(Map.Entry<Integer,Product> prod : map.entrySet()){
            System.out.printf("Key: %d Value: %s\n",
                    prod.getKey(), prod.getValue().getName());
        }
        System.out.println();
        for(Integer key : map.keySet()){
            System.out.printf("Product: %s \n", map.get(key).getName());
        }
        System.out.println();

        for (Product prod: map.values()){
            System.out.printf("На складе: %s %d шт. \n", prod.getName(),prod.getKol());
        }



    }
}