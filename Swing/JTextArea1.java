import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class JTextArea1 implements ActionListener {

    JTextArea t;
    JButton b1;
    JButton b2;
    JLabel l1, l2;

    JTextArea1() {
        JFrame f = new JFrame("WORD AND CHAR COUNTER");
        b1 = new JButton("Count Words");
        b1.setBounds(100,300,120,30);
        JButton b2 = new JButton("Clear");
        b2.setBounds(100, 350,120,30);
        l1 = new JLabel();
        l1.setBounds(50,25,100,30);
        l2 = new JLabel();
        l2.setBounds(160,25,100,30);
        t = new JTextArea();
        t.setBounds(20,75,250,200);

        b1.addActionListener(this);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(null);
                l1.setText(null);
                l2.setText(null);
            }
        });

        f.add(b1); f.add(b2);
        f.add(t);
        f.add(l1); f.add(l2);
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String text = t.getText();
        String[] textArr = text.split("\\s"); // /s indicates white or blank spaces, when the function
                                                    // encounters it, it will automatically assign the given word in the array as a subarray
        l1.setText("Words: " + textArr.length);
        l2.setText("Characters: " + text.length());
    }

    public static void main(String[] args) {
        new JTextArea1();
    }
}
