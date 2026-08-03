import java.util.Scanner;

public class vov {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);

            if (letter >= 'a' && letter <= 'z') {
                if (letter == 'a' || letter == 'e' || letter == 'i'
                        || letter == 'o' || letter == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

        sc.close();
    }
}