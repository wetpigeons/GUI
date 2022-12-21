import javax.swing.*;

public class MyFrame11 extends JFrame{

    MyPanel panel;

        MyFrame11(){

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}