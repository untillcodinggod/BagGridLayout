package org.example;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.set();
        this.addElements();
    }

    public void set() {
        this.setSize(1024, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setTitle("Bag Grid Layout");
        this.setLayout(new GridBagLayout());
    }

    public void addElements() {
        this.add(new JLabel("Hello, friend!"));
        this.add(new JButton("Are you real?"));
        this.add(new JLabel("A bug is never just a mistake. It represents something bigger."));
        this.add(new JButton("An error of thinking who makes who you are"));
    }

    public void run() {
        this.setVisible(true);
    }
}
