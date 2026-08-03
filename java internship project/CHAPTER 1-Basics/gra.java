
import java.util.Scanner;

public class gra{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter third number");
        int c = sc.nextInt();
        if((a>b)&&(a>c)){
            System.out.println("a is greatest among all ");
            System.out.println(a);
        }
        else if((b>a)&&(b>c)){
            System.out.println("b is greatest among all ");
            System.out.println(a);
        }
        else if((c>a)&&(c>b)){
            System.out.println("c is greatest");
            System.out.println(c);
        }
        else{
            System.out.println("all are eqal");
        }

    }
}