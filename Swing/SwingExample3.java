import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Example {

    // Jbutton with action listener
    Example() {
        JFrame f = new JFrame("Java Swing");
        JButton b = new JButton(new ImageIcon("D:/JAVAA/Swing/icon.jpg")); // providing path of the icon we want to display)
        
        b.setBounds(100,100,100,40);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        JTextField tf = new JTextField();

         b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("WELCOME!");   
            }
        }); 
    }
} 

public class SwingExample3 {
    
    public static void main(String[] args) {

        new Example();
    }
}