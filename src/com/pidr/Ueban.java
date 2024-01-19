package com.pidr;

import javax.swing.*;
import java.awt.*;

public class Ueban extends JFrame {
    public Ueban() {
        super("hello");
        super.setBounds(100, 100, 250, 100);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = super.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
    }
}
