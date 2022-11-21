import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Gen <T>{
    static public <T> Map map (T[]k) {
        ArrayList<T> spisok=new ArrayList<T>();
        Collections.addAll(spisok,k);
        Map<T,Integer> map = spisok.stream().collect(Collectors.toMap(e->e,e->1,Integer::sum));

        return map;
    }

}
