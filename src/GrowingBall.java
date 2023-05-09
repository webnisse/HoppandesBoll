import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GrowingBall extends Boll implements ActionListener {
    // Instansvariabler för bollens position och storlek.
    int posx;
    int posy;
    int diameter;
    public Point mousePosition;

    int eatingBall;

    public GrowingBall() {
        // Startposition för bollen.
        posx = 0;
        posy = 0;

        // Storlek på bollen (diameter).
        diameter = 50;


    }

    public void move() {
        // Uppdaterar bollens position till muspekarens position.
        if (mousePosition != null) {
            x = mousePosition.x - diameter/2;
            y = mousePosition.y - diameter/2;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

