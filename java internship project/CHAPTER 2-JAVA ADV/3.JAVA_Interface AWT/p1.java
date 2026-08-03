import java.awt.*;

public class p1 {
    public static void main(String[] args) {

        Frame f = new Frame("My Window");

        Button btn = new Button("Click");
        Button button1 = new Button("Save");
        Button button2 = new Button("Submit");

        f.setLayout(null);

        btn.setBounds(100, 100, 80, 40);
        button1.setBounds(100, 160, 80, 40);
        button2.setBounds(100, 220, 80, 40);

        f.add(btn);
        f.add(button1);
        f.add(button2);

        f.setSize(300, 300);
        f.setTitle("CLICK BTN");
        f.setVisible(true);
    }
}