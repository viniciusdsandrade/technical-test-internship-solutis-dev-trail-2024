import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "orange", "banana", "lemon");
        System.out.println("list: " + list);
        list.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
        System.out.println("list: " + list);
    }
}
