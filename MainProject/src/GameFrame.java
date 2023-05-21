import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    GameFrame()
    {
        setTitle("Pong Game");
//        setLayout(null);
//        setSize(1000, 555);
        setBackground(Color.black);
        getContentPane().setBackground(Color.orange);
        GamePanel panel = new GamePanel();
        add(panel);
//        setFocusable(true);
        pack();
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to Stop execution of the program
    }
    public static void main(String[] args) {

        GameFrame g = new GameFrame();

    }
}
