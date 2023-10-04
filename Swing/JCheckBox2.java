import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JCheckBox2 extends JFrame implements ActionListener {

    JLabel label;
    JButton button;
    JCheckBox c1;
    JCheckBox c2;
    JCheckBox c3;
    JCheckBox2() {

        button = new JButton("Order");
        button.setBounds(100,250,80,30);
        label = new JLabel("Food Ordering System");
        label.setBounds(50,50,300,20);
        c1 = new JCheckBox("Pizza RS. 500");
        c1.setBounds(100,100,150,20);
        c2 = new JCheckBox("Burger RS.200");
        c2.setBounds(100,150,150,20);
        c3 = new JCheckBox("Coldrink RS.70");
        c3.setBounds(100,200,150,20);

        button.addActionListener(this);

        add(button); add(label); add(c1); add(c2); add(c3);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int sum = 0;
        String msg = "";

        if(c1.isSelected()) {
            sum += 500;
            msg += "Pizza = 500 \n";
        }

        if(c2.isSelected()) { // isEnabled() : whether enabled for user to interact with
                                // isSelected(): current state of checkbox
            sum += 200;
            msg += "Burger = 200 \n";
        }
        if(c3.isSelected()) {
            sum += 70;
            msg += "Coldrink = 70 \n";
        }

        msg += "---------------\n";
        msg += "Total = RS " + sum;

        JOptionPane.showMessageDialog(this, msg);
    }

    public static void main(String[] args) {
        new JCheckBox2();
    }
}
