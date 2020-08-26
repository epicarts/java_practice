import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("정길용", "010-000-0000");
        map.put("최영호", "010-000-0001");

        Set<String> keys = map.keySet();
        System.out.println(keys.toString());

        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + " : " + map.get(key));
        }
    }
}
