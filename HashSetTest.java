import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("9.5");
        set.add("8.4");
        set.add("9.2");
        set.add("9.5");

        set.add("6.7");
        System.out.println(set.toString());

        set.remove("9.2");
        System.out.println(set.toString());

        LinkedHashSet<String> set2 = new LinkedHashSet<String>();
        set2.add("9.5");
        set2.add("8.4");
        set2.add("9.2");
        set2.add("9.5");

        set2.add("6.7");
        System.out.println(set2.toString());

        set2.remove("9.2");
        System.out.println(set2.toString());


    }
}
