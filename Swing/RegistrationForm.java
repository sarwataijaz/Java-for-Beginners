import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class RegistrationForm {

    JFrame frame;
    JPanel detailPanel;
    JPanel areaPanel;
    JTextField nameField;
    JTextField contactField;
    JTextField genderField;
    JTextField birthField;
    JRadioButton male;
    JRadioButton female;
    JComboBox date;
    JComboBox year;
    JComboBox month;
    JTextArea addressArea;
    JCheckBox acceptTerms;
    JButton submit;
    JButton history;
    RegistrationForm() {

        frame = new JFrame();
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel heading = new JLabel("Registration Form");
        heading.setFont(new Font("SansSerif", Font.BOLD, 14));
        heading.setBounds(250, 10, 200, 30);

        detailPanel = new JPanel();
        detailPanel.setLayout(null);
        detailPanel.setSize(400,400);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(75,50,100,30);
        nameField = new JTextField();
        nameField.setBounds(150,50,100,30);

        JLabel contactLabel = new JLabel("Contact:");
        contactLabel.setBounds(75,100,100,30);
        contactField = new JTextField();
        contactField.setBounds(150,100,100,30);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(75,150,100,30);
        male = new JRadioButton("Male");
        male.setBounds(150,150,75,30);
        female = new JRadioButton("Female");
        female.setBounds(230,150,85,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JLabel birthLabel = new JLabel("DOB:");
        birthLabel.setBounds(75,200,50,30);
        String dates[] = new String[31];
        for(int i=0; i < dates.length; i++) {
            dates[i] = Integer.toString(i+1);
        }
        date = new JComboBox(dates);
        date.setBounds(150,200,50,30);
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        month = new JComboBox(months);
        month.setBounds(220,200,50,30);
        String years[] = new String[20];
        for(int i = 0; i < years.length; i++) {
            years[i] = ""; // to avoid "null" written alongside
            if(i<10) {
                years[i] += "200";
                years[i] += Integer.toString(i+1);
            } else {
                years[i] += "20";
                years[i] += Integer.toString(i+1);
            }
        }
        year = new JComboBox(years);
        year.setBounds(290,200,75,30);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(75,250,100,30);
        addressArea = new JTextArea();
        addressArea.setBounds(145,250,150,45);

        acceptTerms = new JCheckBox("Please Accept Terms and Conditions.");
        acceptTerms.setBounds(95,300,250,30);

        submit = new JButton("Submit");
        submit.setBounds(125,340,100,30);

        history = new JButton("History");
        history.setBounds(240,340,100,30);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSubmit();
            }
        });

        history.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setHistory();
            }
        });

        detailPanel.add(nameLabel);
        detailPanel.add(nameField);
        detailPanel.add(contactLabel);
        detailPanel.add(contactField);
        detailPanel.add(genderLabel);
        detailPanel.add(male);
        detailPanel.add(female);
        detailPanel.add(birthLabel);
        detailPanel.add(date);
        detailPanel.add(month);
        detailPanel.add(year);
        detailPanel.add(addressLabel);
        detailPanel.add(addressArea);
        detailPanel.add(acceptTerms);
        detailPanel.add(submit);
        detailPanel.add(history);

        frame.add(heading);
        frame.add(detailPanel);
        frame.setVisible(true);
        detailPanel.setVisible(true);
    }

    public void setSubmit() {

        File file = new File("D:/info.txt");
        String name = nameField.getText();
        String contact = contactField.getText();
        String gender;
        if(male.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }

        String dob1 = (String) date.getSelectedItem();
        String dob2 = (String) month.getSelectedItem();
        String dob3 = (String) year.getSelectedItem();

        String address = addressArea.getText();

        if(acceptTerms.isSelected()) {

            if (file.exists()) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {

                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Gender: " + gender);
                    writer.newLine();
                    writer.write("DOB: " + dob1 + "-" + dob2 + "-" + dob3);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();

                    writer.close();
                    JOptionPane.showMessageDialog(null, "Registration was SuccesssFul!", "Success", JOptionPane.PLAIN_MESSAGE);

                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Registration failed!", "Failure", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Registration failed!", "Failure", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please check the terms and conditions box.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    void setHistory() {

        areaPanel = new JPanel(); // Use a layout manager
        areaPanel.setSize(400, 400);
        areaPanel.setLayout(null);

        JButton back = new JButton("Back");
        back.setBounds(240,340,100,30);

        JTextArea displayInfo = new JTextArea(10,30);
     //   displayInfo.setBounds(75,200,200,150);
        displayInfo.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(displayInfo);
        scrollPane.setBounds(120,150,200,150);
        // Set the scroll policy for the scroll pane
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaPanel.setVisible(false);
                nameField.setText("");
                contactField.setText("");
                addressArea.setText("");
                detailPanel.setVisible(true);
            }
        });
        StringBuilder data = new StringBuilder();
        File file = new File("D:/info.txt");

        if(file.exists()) {
            try(BufferedReader reader = new BufferedReader(new FileReader(file))) {

                String line = "";
                while((line = reader.readLine()) != null) {
                    data.append(line);
                    data.append("\n");
                }
            } catch(IOException e) {
                JOptionPane.showMessageDialog(null, "File does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error occured while opening the data :(", "Error", JOptionPane.ERROR_MESSAGE);
        }

        displayInfo.setText(data.toString());

        areaPanel.add(back);
        areaPanel.add(scrollPane);

        frame.add(areaPanel, BorderLayout.CENTER);
        detailPanel.setVisible(false);
        areaPanel.setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
