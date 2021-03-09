import java.util.*;
public class foreach {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<Integer>();
        for (int i = 0; i <=10000 ; i++) {
            arr.add(i);
        }
        arr.stream().forEach(System.out::println);
    }
}
