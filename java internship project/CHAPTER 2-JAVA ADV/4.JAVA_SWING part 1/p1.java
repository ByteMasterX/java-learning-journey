import javax.swing.*;
public class p1{
    public static void main(){
        JFrame frame = new JFrame("first swing window");
        JButton button = new JButton("I am a buttion");
        button.setBounds(175,175,100,25);
        frame.add(button);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}