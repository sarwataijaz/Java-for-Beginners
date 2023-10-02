/** The object of JLabel class is a component for placing text in a container. It is used to display a single line 
of read only text. The text can be changed by an application but a user cannot edit it directly. 
It inherits JComponent class. */ 

import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  

public class JLabel1 extends Frame implements ActionListener {
    
    JButton b;
    JTextField tf;
    JLabel l;

    JLabel1() {

        b = new JButton("Find IP");
        l = new JLabel();
        tf = new JTextField("www.JavaPoint.com");

        b.addActionListener(this); // passing button object
        b.setBounds(50,150,95,30);
        l.setBounds(50, 100, 250, 30);

        add(b);
        add(tf);
        add(l);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JLabel1();
    }

    public void actionPerformed(ActionEvent e) {

        try {
            String msg = tf.getText(); // text of jtextfield stored
            String ip = java.net.InetAddress.getByName("JavaPoint").getHostAddress();
            l.setText("IP of JavaPoint is " + ip);
        } catch(Exception ex) {
            tf.setText(ex.toString());
        }
    }
}
