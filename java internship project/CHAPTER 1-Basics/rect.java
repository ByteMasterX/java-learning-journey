
import java.util.Scanner;

public class rect{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length:");
        int l = sc.nextInt();
        System.out.print("enter bidth:");
        int b = sc.nextInt();
        System.out.print("the area of rectangle of length  "+l+" and width "+b+" is "+(l*b));
    }
}