import javax.swing.*;

public class SwingExample {

    public static void main(String[] args) {
    JFrame j = new JFrame(); // instance oof JFrame
    JButton b = new JButton("Next"); // instance of JButton

    b.setBounds(120, 100, 100, 40);
    
    j.add(b); // adding component(button) to JFrame which actually displays evrything 
    j.setSize(450, 500);
    j.setLayout(null);
    j.setVisible(true); // making the frame visible, by default its false

    }
    
}