
import java.util.HashMap;

public class p5{
    public static void main(String[] args) {
        HashMap <String,String> map = new HashMap<>();
        map.put("ABCd001", "ram");
        map.put("ABCd002", "sam");
        map.put("ABCd003", "dam");
        map.put("ABCd004", "fam");
        map.put("ABCd005", "gam");
        map.put("ABCd006", "yam");
        System.out.println(map);
        System.out.println(map.get("ABCd001"));
    }
}