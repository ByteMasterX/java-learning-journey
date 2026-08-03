import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    private JTextField display;

    private double firstNumber = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    private final String[] buttons = {
        "7", "8", "9", "/", "C",
        "4", "5", "6", "*", "⌫",
        "1", "2", "3", "-", ".",
        "0", "+", "=", ""
    };

    public Calculator() {

        // Window settings
        setTitle("Java Swing Calculator");
        setSize(420, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Display
        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 30));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);

        add(display, BorderLayout.NORTH);

        // Button panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 5, 8, 8));
        panel.setBorder(
            BorderFactory.createEmptyBorder(10, 10, 10, 10)
        );

        // Create buttons
        for (String text : buttons) {

            if (text.isEmpty()) {
                panel.add(new JLabel());
                continue;
            }

            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));

            button.addActionListener(this);

            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        // Number buttons
        if (command.matches("[0-9]")) {

            if (startNewNumber || display.getText().equals("0")) {
                display.setText(command);
                startNewNumber = false;
            } 
            else {
                display.setText(display.getText() + command);
            }
        }

        // Decimal button
        else if (command.equals(".")) {

            if (startNewNumber) {
                display.setText("0.");
                startNewNumber = false;
            } 
            else if (!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }
        }

        // Clear button
        else if (command.equals("C")) {

            display.setText("0");
            firstNumber = 0;
            operator = "";
            startNewNumber = true;
        }

        // Backspace button
        else if (command.equals("⌫")) {

            String text = display.getText();

            if (text.length() > 1) {
                display.setText(
                    text.substring(0, text.length() - 1)
                );
            } 
            else {
                display.setText("0");
                startNewNumber = true;
            }
        }

        // Equals button
        else if (command.equals("=")) {

            calculateResult();
        }

        // Operators
        else if (command.equals("+") ||
                 command.equals("-") ||
                 command.equals("*") ||
                 command.equals("/")) {

            firstNumber =
                Double.parseDouble(display.getText());

            operator = command;
            startNewNumber = true;
        }
    }

    // Calculate result
    private void calculateResult() {

        try {

            double secondNumber =
                Double.parseDouble(display.getText());

            double result;

            switch (operator) {

                case "+":
                    result = firstNumber + secondNumber;
                    break;

                case "-":
                    result = firstNumber - secondNumber;
                    break;

                case "*":
                    result = firstNumber * secondNumber;
                    break;

                case "/":

                    if (secondNumber == 0) {
                        display.setText("Cannot divide by 0");
                        startNewNumber = true;
                        return;
                    }

                    result = firstNumber / secondNumber;
                    break;

                default:
                    return;
            }

            // Remove .0 from integer results
            if (result == (long) result) {
                display.setText(
                    String.valueOf((long) result)
                );
            } 
            else {
                display.setText(
                    String.valueOf(result)
                );
            }

            firstNumber = result;
            operator = "";
            startNewNumber = true;

        } 
        catch (NumberFormatException ex) {

            display.setText("Error");
            startNewNumber = true;
        }
    }

    // Main method
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            Calculator calculator = new Calculator();

            calculator.setVisible(true);
        });
    }
}