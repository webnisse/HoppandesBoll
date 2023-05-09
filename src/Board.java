import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JPanel implements ActionListener {

    // Variabel som anger fördröjning mellan varje uppdatering av bollen i millisekunder.
    private static final int DELAY = 10;

    // Instansvariabler för bollen och en timer.
    private GrowingBall myBall;
    private Timer timer;


    public Board() {
        // Skapar en instans av bollen.
        myBall = new GrowingBall();

        // Skapar en timer som kommer att kalla på actionPerformed varje DELAY millisekunder.
        timer = new Timer(DELAY, this);

        // Startar timern.
        timer.start();

        // Lägg till muslyssnare
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                myBall.mousePosition = e.getPoint();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Anropar metoden som ritar bollen på skärmen.
        drawBall(g);
        eatingBalls(g);
    }

    private void drawBall(Graphics g) {
        // Sätter färgen till blå.
        g.setColor(Color.blue);

        // Ritar en cirkel (bollen) på positionen som ges av bollens x- och y-koordinater samt dess diameter.
        g.fillOval(myBall.x, myBall.y, myBall.diameter, myBall.diameter);
    }

    private void eatingBalls(Graphics g){
        g.setColor(Color.GREEN);

        g.fillOval(20, 20, myBall.eatingBall,myBall.eatingBall);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Flyttar bollen genom att uppdatera dess x- och y-koordinater.
        myBall.move();

        // Uppdaterar skärmen genom att anropa paintComponent.
        repaint();
    }

}
