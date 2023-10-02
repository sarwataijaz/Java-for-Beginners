import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample2 {
    public static void main(String[] args) {
        
        JFrame f = new JFrame("Java Frame"); // frame
        JButton b = new JButton("Click"); // button displaying something
        JTextField tf = new JTextField(); // text field to generate

        tf.setBounds(50, 50, 150, 20); // dimensions of textfield
        b.setBounds(50, 100, 95, 30); // dimensions of button

        b.addActionListener(new ActionListener() { // to perform some sort of action on that button obj
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to Java Swing!");
            }
        });

    
        f.add(b);
        f.add(tf);
        //f.pack();
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}