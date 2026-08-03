import java.util.*;
public class p1{
    public static void main(){
        ArrayList<String> userArray;
        userArray = new ArrayList<>();
        userArray.add("nishtha");
        userArray.add("mango");
        userArray.add("strawberry");
        userArray.add("nothing");
        System.out.println("present users are: ");
        System.out.println(userArray);
        userArray.remove(3);
        System.out.println("array after removeal: "+ userArray);

    }
}