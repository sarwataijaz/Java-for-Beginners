import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract class Graphics extends JFrame {

    abstract void addGraphics();
    abstract void setSizes();

     void enableOn() {

         setSize(400,400);
         setLayout(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class Login extends Graphics implements ActionListener {

  // aggregation
        private String userName;
        private String password;
        JTextField text;
        JPasswordField pass;
        JLabel userLabel;
        JLabel passLabel;

        JLabel result;
        JButton okButton;
    void setLoginCrediantials(String userName, String password) {
             this.userName = userName;
             this.password = password;
        }

        void addGraphics() {

             text = new JTextField();
             pass = new JPasswordField();
             result = new JLabel();

            userLabel = new JLabel("Username: ");
            passLabel = new JLabel("Password: ");
            okButton = new JButton("Log in");

            okButton.addActionListener(this);
            text.getText();
            pass.getPassword();
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

     public void setSizes() {

     }

    @Override
    void enableOn() {
        getContentPane().removeAll();
        JPanel newPanel = new JPanel();
        addGraphics();
        setSizes();

        newPanel.add(new JLabel("Login Page"));
        newPanel.add(text);
        newPanel.add(pass);
        newPanel.add(userLabel);
        newPanel.add(passLabel);
        newPanel.add(result);
        newPanel.add(okButton);

        add(text);
        add(newPanel, BorderLayout.CENTER);

        revalidate();
        repaint();
    }
}

class Main extends Graphics implements ActionListener {

    JLabel welcomeText;
    JRadioButton loginButton;
    JRadioButton signupButton;
    JButton button;
    ButtonGroup group;
    void addGraphics() {
        loginButton = new JRadioButton();
        signupButton = new JRadioButton();
        group = new ButtonGroup();

        button = new JButton("Select");
        welcomeText = new JLabel("WELCOME TO LOGIN AND REGISTRATION SYSTEM");
        button.addActionListener(this);

    }
    public static void main(String[] args) {

    }

    void setSizes(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(loginButton.isSelected()) {
            getContentPane().removeAll();

            Login login = new Login();
            login.enableOn();
        }
    }
}
