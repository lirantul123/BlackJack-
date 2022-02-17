import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class LoginPass extends BlackJack implements ActionListener {

    private static JLabel userLabel;
    private static JLabel ageLabel;

    private static JCheckBox box;

    private static JTextField userText;
    private static JTextField ageText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void fun(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(480, 290);
        frame.setTitle("LoginAccess");
        frame.setLocation(485, 145);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel userLabel = new JLabel("user name:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        JLabel write = new JLabel("write here the name");
        write.setBounds(125, 20, 1000 , 25);
        panel.add(write);
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        JLabel write2 = new JLabel("write here the password");
        write2.setBounds(110, 50, 1000 , 25);
        panel.add(write2);
        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JLabel ageLabel = new JLabel("age:");
        ageLabel.setBounds(10, 80, 80, 25);
        panel.add(ageLabel);
        JLabel write3 = new JLabel("write here the age");
        write3.setBounds(110, 80, 1000 , 25);
        panel.add(write3);
        ageText = new JTextField();
        ageText.setBounds(100, 80, 165, 25);
        panel.add(ageText);

        button = new JButton("Login");
        button.setBounds(10, 130, 80, 25);
        button.addActionListener(new LoginPass());
        panel.add(button);

        success= new JLabel("Please enter details ↑");
        success.setBounds(10, 195, 500, 25);
        panel.add(success);

        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

        String user = userText.getText();
        String password = passwordText.getText();

        if (user.length()>0 && password.length()>0){
            user = user.replaceAll(" ", "");
            if (true)
                success.setText("Hello "+user.toLowerCase()+". I hope you will enjoy playing;");

            System.out.println("Hello "+user+". I hope you will enjoy playing;");
            System.out.println(".................play here↓ Please wait for two seconds.\n");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            yes();
        }

        if (user.length() == 0 || password.length() == 0) {
            if (user.length()==0)
                success.setText("Please write the user name (age you don't have to) !");
            if (password.length()==0)
                success.setText("Please write the password (age you don't have to) !");
            if (user.length() == 0 && password.length() == 0)
                success.setText("You must write user and password (age you don't have to) !");
        }
        else
            success.setText("Try again");
    }
}
