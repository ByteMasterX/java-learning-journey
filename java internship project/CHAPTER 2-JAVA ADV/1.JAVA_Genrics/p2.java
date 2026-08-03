
import java.util.ArrayList;
import java.util.List;

//genrics typecasting example
public class p2{ 
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        String string = (String)list.get(0);
        System.out.println(string);
    }
} 