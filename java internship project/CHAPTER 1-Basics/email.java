
import java.util.Scanner;

public class email{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("enter your e mail");
        String e = sc.nextLine();
        int check1=0;
        int check2=0;

        for(int i = 0;i<e.length();i++){
            char letter = e.charAt(i);
            if(letter=='@'){
                check1++;
            }
            if(letter=='.'){
                check2++;
            }
        }
        if((check1==1)&&(check2>0)){
            System.out.println("valid email");
        }
        else{
            System.out.println("invalid email");
        }
    }
}