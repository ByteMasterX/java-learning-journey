
import java.util.Scanner;

public class comp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("a is bigger then b");
        }
        else{
            System.out.println("b is bigger than a");
        }
    }
}