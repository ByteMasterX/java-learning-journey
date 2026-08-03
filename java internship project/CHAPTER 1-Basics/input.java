
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input{
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(a+b);
    }
}