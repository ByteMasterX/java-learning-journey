import java.io.InputStream;
import java.net.Socket;
import java.util.Date;

public class p2 {
    public static void main(String[] args) {
        String hostname = "time.nist.gov";
        int port = 37;

        try {
            Socket s = new Socket(hostname, port);
            InputStream ioStream = s.getInputStream();

            int ch;
            long secondsSince1970 = 0;

            for (int i = 0; i < 4; i++) {
                ch = ioStream.read();
                secondsSince1970 = (secondsSince1970 << 8) + ch;
            }

            // Convert NTP time to Unix time
            long msSince1970 = (secondsSince1970 - 2208988800L) * 1000;

            Date time = new Date(msSince1970);
            System.out.println("Time: " + time);

            s.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}