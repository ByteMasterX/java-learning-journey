import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class p3 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("whois.internic.net", 43);

            InputStream inputStream = s.getInputStream();
            OutputStream outputStream = s.getOutputStream();

            String str = "gofaffy.com\r\n";
            byte[] buf = str.getBytes();

            outputStream.write(buf);

            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c);
            }

            s.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}