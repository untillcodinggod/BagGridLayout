package org.example;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private final GridBagConstraints constraints;

    public MyFrame() {
        this.constraints = new GridBagConstraints();

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

    public void setFirstLabelConstraints() {
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
    }

    public void setFirstButtonConstraints() {
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
    }

    public void setSecondButtonConstraints() {
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
    }

    public void setSecondLabelConstraints() {
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
    }

    public void setSpacerConstraints() {
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
    }

    public void addFirstLabel() {
        setFirstLabelConstraints();
        this.add(new JLabel("Hello, friend!"), constraints);
    }

    public void addFirstButton() {
        setFirstButtonConstraints();
        this.add(new JButton("Are you real?"), constraints);
    }

    public void addSecondLabel() {
        setSecondLabelConstraints();
        this.add(new JLabel("A bug is never just a mistake. It represents something bigger."), constraints);
    }

    public void addSecondButton() {
        setSecondButtonConstraints();
        this.add(new JButton("An error of thinking who makes who you are"), constraints);
    }

    public void addSpacer() {
        setSpacerConstraints();
        this.add(new JPanel(), constraints);
    }

    public void addElements() {
        addFirstLabel();
        addFirstButton();
        addSpacer();
        addSecondLabel();
        addSecondButton();
    }

    public void run() {
        this.setVisible(true);
    }
}
