package me.cho.design_patterns._2_structural_patterns._03_composite._03_java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(1000,1000);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(200,200,200,40);
        jFrame.add(jTextField);

        JButton jButton = new JButton();
        jButton.setBounds(200,200,200,40);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("Hi There");
            }
        });
        jFrame.add(jButton);

    }
}
