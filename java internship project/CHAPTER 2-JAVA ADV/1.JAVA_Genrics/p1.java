
import java.util.ArrayList;
import java.util.List;

public class p1{
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(12);
        list.add(23);
        System.out.println("The List Without Genrics: "+list);
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(43);
        list1.add(43);
        System.out.println("The List With Genrics: "+list1);
    }
}