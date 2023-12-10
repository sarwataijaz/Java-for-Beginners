import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class StopWatch extends JFrame {

    JLabel displayTime;
    JButton start;
    JButton stop;
    JButton reset;
    String formattedTime;
    boolean startWatch;

    int min = 0;
    int sec = 0;
    int milliSec = 0;
    StopWatch() {
        super("StopWatch");

        this.setSize(400,400);
        this.setLayout(null);


        displayTime = new JLabel();
        displayTime.setBounds(50,50,250,100);

        displayTime.setFont(new Font("Verdana",Font.PLAIN,50));
        displayTime.setBackground(Color.BLACK);
        displayTime.setForeground(Color.GREEN);
        displayTime.setOpaque(true);

        start = new JButton("Start");
        start.setBounds(50,200,70,50);
        start.setBackground(Color.RED);
        start.setForeground(Color.white);
        start.setOpaque(true);

        stop = new JButton("Stop");
        stop.setBounds(200,200,70,50);
        stop.setBackground(Color.RED);
        stop.setForeground(Color.white);
        stop.setOpaque(true);


        reset = new JButton("Reset");
        reset.setBounds(130,300,70,50);
        reset.setBackground(Color.RED);
        reset.setForeground(Color.white);
        reset.setOpaque(true);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                min = 0;
                sec = 0;
                milliSec = 0;
                formattedTime = String.format("%02d:%02d:%02d", min, sec, milliSec);
                displayTime.setText(formattedTime);
            }
        });


        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startWatch();
            }
        });

        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.setEnabled(true);
                startWatch = false;

            }
        });

        formattedTime = String.format("%02d:%02d:%02d", min, sec, milliSec);
        displayTime.setText(formattedTime);

        this.add(start);
        this.add(stop);
        this.add(reset);
        this.add(displayTime);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

    }

    void startWatch() {
        // Use SwingWorker for background task
        startWatch = true;
        start.setEnabled(false);
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {

            @Override
            protected Void doInBackground() throws Exception {
                while (startWatch) {
                    try {
                        milliSec++;
                        Thread.sleep(9);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (milliSec == 100) {
                        milliSec = 0;
                        sec++;
                    }
                    if (sec == 60) {
                        sec = 0;
                        min++;
                    }
                    formattedTime = String.format("%02d:%02d:%02d", min, sec, milliSec);
                    displayTime.setText(formattedTime);
                }
                return null;
            }
        };

        worker.execute(); // Start the background task

    }

}

class MainMethod {

    public static void main(String[] args) {
        new StopWatch();
    }
}
