
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class p1{
    public static void main(String[] args) throws UnknownHostException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a address to lookup");
        String name = sc.next();
        InetAddress address = InetAddress.getByName(name);
        System.out.println(address);
    }
}