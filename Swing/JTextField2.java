import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextField2 implements ActionListener {
    JFrame f = new JFrame("JAVA SWING");
    JButton b1;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JButton b2;

    JTextField2() {
        t1 =  new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        b1 = new JButton("+");
        b2 = new JButton("-");

        b1.setBounds(50,200,50,50);
        b2.setBounds(120,200,50,50);
        t1.setBounds(50,50,150,20);
        t2.setBounds(50,100,150,20);
        t3.setBounds(50,150,150,20);

        t3.setEditable(false); // only answer will be displayed

        b1.addActionListener(this); // passing b1 and b2 as references
        b2.addActionListener(this);

        f.add(b1);
        f.add(b2);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String temp1 = t1.getText();
        String temp2 = t2.getText();

        int a = Integer.parseInt(temp1);
        int b = Integer.parseInt(temp2);
        int c = 0; // for result

        if(e.getSource() == b1) {
            c = a+b;
        } else if(e.getSource() == b2) {
            c = a-b;
        }
        t3.setText(String.valueOf(c));
    }

    public static void main(String[] args) {
        new JTextField2();
    }
}
