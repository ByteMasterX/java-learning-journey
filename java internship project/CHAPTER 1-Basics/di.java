
import java.util.Scanner;

//drivaing incurence
public class di{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marital status:true/false");
        boolean status = sc.nextBoolean();
        System.out.println("enter your gender");
        char gen = sc.next().charAt(0);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if((status==true)||((status==false)&&(gen=='m')&&(age>30))||((status==false)&&(gen=='f')&&(age>25))){
            System.out.println("company will give you insurance");
        }
        else{
            System.out.println("you will not get insurnece");
        }

    }
}