import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

        private String userName;
        private String password;
        private JTextField text;
        private JPasswordField pass;
        private JLabel userLabel;
        private JLabel passLabel;

        private JLabel result;
        private JButton okButton;


        void setLoginCredentials(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }
        void LoginMenu() {

             text = new JTextField();
             pass = new JPasswordField();
             result = new JLabel();

            userLabel = new JLabel("Username: ");
            passLabel = new JLabel("Password: ");
            okButton = new JButton("Log in");

            okButton.addActionListener(this);
            text.getText();
            pass.getPassword();

            userLabel.setBounds(100,100,100,30);
            text.setBounds(170,100,100,30);
            passLabel.setBounds(100,150,100,30);
            pass.setBounds(170,150,100,30);
            result.setHorizontalAlignment(JLabel.CENTER);
            result.setSize(400,100);
            okButton.setBounds(100,200,95,30);

            add(userLabel);
            add(passLabel);
            add(text);
            add(pass);
            add(okButton);
            add(result);

            setLayout(null);
            setSize(400,400);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    @Override
    public void actionPerformed(ActionEvent e) {

        String jPass = new String(pass.getPassword());
        String jText = text.getText();

             if(jText.equals(userName) && jPass.equals(password)) {

                 result.setText("Login was successful!");

             } else {
                 result.setText("Incorrect username or password :)");
             }
    }

    public static void main(String[] args) {
        new Login();
    }
}


