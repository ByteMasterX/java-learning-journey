
import java.util.Scanner;

public class rev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
            while(num > 0) {
            int digit = num % 10;   // last digit nikalo
            rev = rev * 10 + digit; // reverse number banao
            num = num / 10;         // last digit hatao
        }
        System.out.println(rev);
    }
}