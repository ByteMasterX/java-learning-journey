
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class age{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String last = sc.nextLine();
        String dob = sc.nextLine();
        LocalDate birthdate = LocalDate.parse(dob);//birthdate
        LocalDate today = LocalDate.now();//todays date
        Period age = Period.between(birthdate, today);//uska diffrence
        System.out.print("name:");
        System.out.print(first +"  "+last);
        System.out.print("age: ");
        System.out.print(age);




    }

    private static class string {

        public string() {
        }
    }
}