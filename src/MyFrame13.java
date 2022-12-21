import javax.swing.*;

public class MyFrame13 extends JFrame {
    DragPanel dragPanel = new DragPanel();
    MyFrame13(){
        this.add(dragPanel);

        this.setTitle("Drag and Drop demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
