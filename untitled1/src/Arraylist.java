import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Shubham");
        list.add("Aviral");
        list.add("solanki");
        list.add("Priya");
        list.remove(2);
        int a=list.size();
        for (String s : list) System.out.println(s);
        System.out.println(a);
    }
}
