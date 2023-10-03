import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordEx implements ActionListener {

    JLabel text1;
    JLabel text2;
    JButton b;
    JLabel l1;
    JLabel l2;
    JTextField t1;
    JPasswordField p1;
    JPasswordEx() {

        JFrame f = new JFrame("Password Example");

        text1 = new JLabel();
        text1.setBounds(20,150,200,50);
        text2 = new JLabel();
        text2.setBounds(20,200,200,50);

        b = new JButton("Login");
        b.setBounds(100,120,80,30);

        l1 = new JLabel("Username: ");
        l1.setBounds(20,20,80,30);

        l2 = new JLabel("Password: ");
        l2.setBounds(20,75,80,30);

        t1 = new JTextField();
        t1.setBounds(100,20,100,30);

        p1 = new JPasswordField();
        p1.setBounds(100,75,100,30);

        b.addActionListener(this);

        f.add(text1); f.add(text2);
        f.add(b);
        f.add(l1);
        f.add(l2);
        f.add(p1);
        f.add(t1);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String temp1 = t1.getText();
        String temp2 = new String(p1.getPassword()); // returns char array due to safety reasons
        String finalText = "Username: " + temp1;

        text1.setText(finalText);

        finalText = "Password: " + temp2;

        text2.setText(finalText);
    }

    public static void main(String[] args) {
        new JPasswordEx();
    }
}
