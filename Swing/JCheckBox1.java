import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBox1 {

    JCheckBox b1;
    JCheckBox b2;
    JLabel l1;

    JCheckBox1() {

        JFrame f = new JFrame("CheckBox");
        b1 = new JCheckBox("C++");
        b1.setBounds(150,100,50,50);
        b2 = new JCheckBox("Java");
        b2.setBounds(150,150,70,50);
        l1 = new JLabel();
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setSize(400,100);

        b1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == 1) {
                    l1.setText(b1.getText() + " Checkbox: " + " Checked.");
                } else {
                    l1.setText(b1.getText() + " Checkbox: " + " Unchecked.");
                }
            }
        });
        b2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // use of ternary operators
                l1.setText("Java Checkbox: " + ((e.getStateChange() == 1) ? "Checked." : "Unchecked."));
            }
        });

        f.add(b1); f.add(b2); f.add(l1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new JCheckBox1();
    }
}
