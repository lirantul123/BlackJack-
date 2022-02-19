import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.*;

public class LoginPass extends BlackJack implements ActionListener {

    static JTextField userText;
    static JTextField moneyText;
    static JLabel passwordLabel;
    static JPasswordField passwordText;
    static JButton button;
    static JLabel success;

    public static void fun(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(480, 290);
        frame.setTitle("LoginAccess");
        frame.setLocation(485, 145);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User name:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        JLabel write = new JLabel("←");
        write.setBounds(270, 20, 1000 , 25);
        panel.add(write);
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        JLabel write2 = new JLabel("←");
        write2.setBounds(270, 50, 1000 , 25);
        panel.add(write2);
        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JLabel ageLabel = new JLabel("Money($):");
        ageLabel.setBounds(10, 80, 80, 25);
        panel.add(ageLabel);
        JLabel write3 = new JLabel("←");
        write3.setBounds(270, 80, 1000 , 25);
        panel.add(write3);
        moneyText = new JTextField();
        moneyText.setBounds(100, 80, 165, 25);
        panel.add(moneyText);

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
        String money = moneyText.getText();


        user = user.replaceAll(" ", "");
        user = user.toLowerCase();

        if (user.length()>0 && password.length()>0){
            System.out.println("////////////////////////////////////////////////////");
            System.out.printf("Your User name: %s\n", user);
            String str="";
            for (int i=0; i<password.length(); i++) {
                str+="*";
            }
            System.out.printf("Your Password: %s\n", str);
            System.out.printf("Your initial money($): %s$\n", money);
            System.out.println("////////////////////////////////////////////////////");
            System.out.println(".................play here↓ Please wait for two seconds.\n");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            yes();
        }

        if (user.length() == 0 || password.length() == 0 || money.length() == 0) {

            if (user.length()<=0)
                success.setText("Please write the user name !");
            if (password.length()<=0)
                success.setText("Please write the password !");
            if (money.length()<=0)// problem
                success.setText("You must write the money amount !");
            if (user.length() <= 0 && password.length() <= 0 && money.length() <= 0)
                success.setText("You must write user, password and money !");
        }

    }
}
