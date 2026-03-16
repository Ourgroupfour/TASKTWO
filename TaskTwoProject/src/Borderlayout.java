import javax.swing.*;
import java.awt.*;

class BorderLayoutFrame extends JFrame {

    public BorderLayoutFrame() {


        setTitle("BorderLayout ");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        JLabel titleLabel = new JLabel("Application Title", JLabel.CENTER);
        add(titleLabel, BorderLayout.NORTH);


        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(3, 1));

        JButton btn1 = new JButton("Option 1");
        JButton btn2 = new JButton("Option 2");
        JButton btn3 = new JButton("Option 3");

        westPanel.add(btn1);
        westPanel.add(btn2);
        westPanel.add(btn3);

        add(westPanel, BorderLayout.WEST);


        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);


        JButton submitButton = new JButton("Submit");
        add(submitButton, BorderLayout.SOUTH);
    }
}