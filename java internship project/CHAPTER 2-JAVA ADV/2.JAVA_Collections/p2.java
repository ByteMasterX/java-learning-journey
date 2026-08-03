import java.util.*;
public class p2{
    public static void main(String[] args) {
        Stack <String> stack = new Stack<>();
        stack.push("C++ pointers");
        stack.push("C for dummies");
        stack.push("ALgo in java");

        String str;
        if(!stack.isEmpty()){
            str = stack.pop();
            System.out.println(str); 
        }

    }
}