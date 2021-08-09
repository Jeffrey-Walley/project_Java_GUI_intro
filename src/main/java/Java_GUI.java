// https://introcs.cs.princeton.edu/java/i5inout/GUI.java.html

// this example shows how the button listens to the click event from the user and then runs code which changes other objects

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Java_GUI implements ActionListener {                           // creating Graphic User Interface

        private int count = 0;
        private JLabel label;
        private JFrame frame;
        private JButton button;
        private JPanel panel;

    public Java_GUI() {                         // this is the GUI constructor (i named it Java_GUI)
        frame = new JFrame();

        button = new JButton("Click This Button");
        button.addActionListener(this);

        label = new JLabel();


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My MOFO'n GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Java_GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {         // tied to the button object
        count ++;
        label.setText("Number of clicks: " + count);
    }
}
