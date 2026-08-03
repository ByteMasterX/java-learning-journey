
import java.util.Scanner;

public class diff{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dirst number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int diff = a-b;
        System.out.println(" the diffrece of  " + a + " and " + b+ " is " + diff);
    }
}