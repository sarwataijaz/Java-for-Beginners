
// jlabel basic example 

import javax.swing.*;

public class JLabel2 {
     public static void main(String[] args) {
        JFrame f = new JFrame("JAVVA");
        JLabel l1 = new JLabel();
        
        l1.setBounds(50,50,100,30);
      
        l1.setText("SARWAT AIJAZ");
        
        JLabel l2 = new JLabel();

        l2.setBounds(50,100,100,30);

        l2.setText("HADISA FATIMA");

        f.add(l1);
        f.add(l2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
     }
}