import java.util.*;
public class p3{
    public static void main(){
        LinkedList <String> list = new LinkedList<>();
        list.add("Banaswadi metro station");
        list.add("Gunupur metro station");
        list.add("KM robertajung");
        list.add("mumbai kandivalli");
        for(String stations: list){
            System.out.println(stations);
            list.remove(2);
            System.out.println(stations);
        }



    }
}