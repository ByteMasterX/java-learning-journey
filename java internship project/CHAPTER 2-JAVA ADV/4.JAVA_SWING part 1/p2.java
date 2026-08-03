import javax.swing.*;

public class p2 {
    public static void main(String[] args) {

        JFrame formFrame = new JFrame("Signup Form");

        // Heading
        JLabel formHeading = new JLabel("Please Enter Your Information");
        formHeading.setBounds(180, 30, 250, 30);
        formFrame.add(formHeading);


        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 90, 100, 25);

        JTextField nameInput = new JTextField();
        nameInput.setBounds(180, 90, 250, 25);


        // Email
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 140, 100, 25);

        JTextField emailInput = new JTextField();
        emailInput.setBounds(180, 140, 250, 25);


        // Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 190, 100, 25);

        JPasswordField passwordInput = new JPasswordField();
        passwordInput.setBounds(180, 190, 250, 25);


        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 240, 100, 25);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(180, 240, 80, 25);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(270, 240, 100, 25);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);


        // Date of Birth
        JLabel dobLabel = new JLabel("DOB:");
        dobLabel.setBounds(50, 290, 100, 25);

        JTextField dobInput = new JTextField();
        dobInput.setBounds(180, 290, 250, 25);


        // Address
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 340, 100, 25);

        JTextArea addressInput = new JTextArea();
        addressInput.setBounds(180, 340, 250, 70);


        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(180, 450, 100, 35);


        // Add Components
        formFrame.add(nameLabel);
        formFrame.add(nameInput);

        formFrame.add(emailLabel);
        formFrame.add(emailInput);

        formFrame.add(passwordLabel);
        formFrame.add(passwordInput);

        formFrame.add(genderLabel);
        formFrame.add(male);
        formFrame.add(female);

        formFrame.add(dobLabel);
        formFrame.add(dobInput);

        formFrame.add(addressLabel);
        formFrame.add(addressInput);

        formFrame.add(submitButton);


        // Frame Settings
        formFrame.setSize(600, 600);
        formFrame.setLayout(null);
        formFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formFrame.setVisible(true);
    }
}