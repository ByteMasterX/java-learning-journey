import java.util.Iterator;
import java.util.ArrayList;

public class p3{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("vineet");
        list.add("nishtha");
        Iterator <String> i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    

    }
}