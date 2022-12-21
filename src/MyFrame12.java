import java.awt.*;

import javax.swing.*;

public class MyFrame12 extends JFrame{

    MyPanel1 panel;

    MyFrame12(){

        panel = new MyPanel1();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}