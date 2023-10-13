import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener {

    private String userName;
    private String password;
    private JTextField text;
    private JPasswordField pass;
    private JLabel userLabel;
    private JLabel passLabel;

    private JLabel result;
    private JButton okButton;

    String getPassword() {
        return password;
    }
    String getUserName() {
        return userName;
    }
    Signup() {

        text = new JTextField();
        pass = new JPasswordField();
        result = new JLabel();

        userLabel = new JLabel("Username: ");
        passLabel = new JLabel("Password: ");
        okButton = new JButton("Create an account");

        okButton.addActionListener(this);
        userName = text.getText();
        password = new String(pass.getPassword());

        userLabel.setBounds(100,100,100,30);
        text.setBounds(170,100,100,30);
        passLabel.setBounds(100,150,100,30);
        pass.setBounds(170,150,100,30);
        result.setHorizontalAlignment(JLabel.CENTER);
        result.setSize(400,100);
        okButton.setBounds(100,200,170,30);

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

        String userN = text.getText();
        String passw = new String(pass.getPassword());

        if(userN.isEmpty() || passw.isEmpty()) {
            result.setText("Enter the data first!");
        } else {
            result.setText("Account created successfully!");
        }
    }

    public static void main(String[] args) {
        Login login = new Login();
        Signup signup = new Signup();

        String userN = signup.getUserName(); // non static operates on the basis of objects only
        String pass = signup.getPassword();

        login.setLoginCredentials(userN, pass);
    }
}
