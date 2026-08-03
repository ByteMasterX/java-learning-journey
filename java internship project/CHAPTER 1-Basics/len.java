
import java.util.Scanner;

public class len{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = sc.nextLine();
        name =name.replace(" ", "");
        System.out.print("the lenth of name is: "+ name.length());
    }
}