
import java.util.Scanner;

public class sallary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary");
        float bs = sc.nextFloat();
        float hra =0;//houce rent allowence
        float da = 0;//dearness allowence
        if(bs>=10000){
             hra = bs *(10/100);
             da = bs*(90/100);

        }
        else{
             hra = 10000;
             da = bs*(98/100);

        }
        System.out.println("your gross sallary is "+bs+ hra + da+ " ");//gross sallry

    }
}