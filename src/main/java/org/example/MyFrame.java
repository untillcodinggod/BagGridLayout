package org.example;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.set();
    }

    public void set() {
        this.setSize(1024, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setTitle("Bag Grid Layout");
    }

    public void run() {
        this.setVisible(true);
    }
}
