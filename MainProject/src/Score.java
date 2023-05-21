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
    public void draw(Graphics g)
    {
        g.setColor(Color.darkGray);
        g.setFont(new Font("Consolas", Font.ROMAN_BASELINE, 60));

        g.drawLine(width/2,0,width/2,height);

        g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), width/2 - 85,50);
        g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), width/2 + 20,50);
    }

}
