import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{

    public Window() {


        this.setDefaultLookAndFeelDecorated(true);
        this.setTitle("TEst");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(500,500));

        this.setResizable(false);
        this.add(new Board());

        this.pack();
        this.setVisible(true);
    }

}
