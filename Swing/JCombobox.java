import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JCombobox implements ActionListener {

    JComboBox jcb;
    JButton button;
    JLabel label;
    JCombobox() {
        JFrame f = new JFrame("Panels in JComboBox");
        String languages[] = {"C", "C++", "Java", "C#", "PHP"};
        jcb = new JComboBox(languages);
        jcb.setBounds(50,100,90,20);
        button = new JButton("Show");
        button.setBounds(200,100,75,20);
        label = new JLabel("Language selected: ");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);

        button.addActionListener(this);

        f.add(button); f.add(jcb); f.add(label);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String text = "Language selected is: " + jcb.getItemAt(jcb.getSelectedIndex());
        label.setText(text);
    }

    public static void main(String[] args) {
        new JCombobox();
    }
}
