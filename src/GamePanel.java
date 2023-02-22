import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;

    static final int DELAY = 75;
    //higher delay = slower game

    final int x[] = new int[GAME_UNITS];
    //x coordinates
    final int y[] = new int[GAME_UNITS];
    //y coordinates

    int bodyParts = 6;
    //initial snake body length
    int applesEaten;
    int appleX;
    //x coordinate of apple location
    int appleY;
    //y coordinate of apple location
    char direction = 'R';
    // L left R right D down U up for directions
    boolean running = false;
    Timer timer;
    Random random;




    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());

    }

    public void startGame() {
        newApple();

    }

    public void paintComponent(Graphics g) {

    }

    public void draw(Graphics g) {

    }

    public void newApple() {

    }

    public void move() {

    }

    public void checkApple() {

    }

    public void checkCollisions() {

    }

    public void gameOver(Graphics g) {

    }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {

        }
    }

    @Override
    public  void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    }
}
