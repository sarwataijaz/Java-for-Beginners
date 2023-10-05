import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadiobutton1 extends JFrame implements ActionListener {

    JRadioButton b1;
    JRadioButton b2;
    JButton button;

    public JRadiobutton1() {

        b1 = new JRadioButton("Male");
        b1.setBounds(100,50,100,30);
        b2 = new JRadioButton("Female");
        b2.setBounds(100, 100, 100, 30);
        button = new JButton("Click");
        button.setBounds(100,150,80,30);
        ButtonGroup bg = new ButtonGroup(); // essential bcuz it helps us to choose any one option within the group
        bg.add(b1); bg.add(b2);

        button.addActionListener(this);
        add(b1); add(b2); add(button);
        setLayout(null);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String msg = "You are " + ((b1.isSelected()) ? "Male" : "Female");
        JOptionPane.showMessageDialog(this, msg);
    }

    public static void main(String[] args) {
        new JRadiobutton1();
    }
}
