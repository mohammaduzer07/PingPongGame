import javax.swing.*;
import java.awt.*;

public class Score extends Rectangle{

    int width;
    int height;
    int player1;
    int player2;

    Score(int width, int height)
    {
        this.height = height;
        this.width = width;
    }

    public void CheckWinner() {
        if (player1 >= 10) {
            ImageIcon icon = new ImageIcon("winner.png");
            JOptionPane.showMessageDialog(null, "Player 1 won! GameOver", "Game Over", JOptionPane.INFORMATION_MESSAGE, icon);
            restart();
        } else if (player2 >= 10) {
            ImageIcon icon = new ImageIcon("winner.png");
            JOptionPane.showMessageDialog(null, "Player 2 won! GameOver", "Game Over", JOptionPane.INFORMATION_MESSAGE, icon);
            restart();
        }
    }
    public void restart() {
        player1 = 0;
        player2 = 0;
        // Reset all other variables to their initial values
        // Start the game again
    }
    public void gameOver() {
        System.exit(0);
    }
    public void draw(Graphics g)
    {
        g.setColor(Color.orange);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

        g.drawLine(width/2,0,width/2,height);

        g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), width/2 - 85,50);
        g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), width/2 + 20,50);
    }

}
