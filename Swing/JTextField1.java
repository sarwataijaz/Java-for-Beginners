import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextField1 {
    public static void main(String[] args) {

        JFrame f = new JFrame("JAVA SWING");
        JTextField t1 = new JTextField();
        t1.setBounds(50,100,200,30);
        JTextField t2 = new JTextField();
        t2.setBounds(50,150,200,30);
        t1.getText(); // we have to make sure the Y axis of both texts are different so they dont merge.
        t2.getText(); // same thing for button

        JButton jb = new JButton("Clear");
        jb.setBounds(50,200,95,30);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                t1.setText(null);
                t2.setText(null);
            }
        });



        f.add(t1);
        f.add(t2);
        f.add(jb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
