import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle{

    int xVelocity;
    int yVelocity;
    int initialSpeed= 2;
    Random random;
    Ball(int x, int y, int width, int height)
    {
        super(x,y,width,height);
        random = new Random();
        int RandomXDirection = random.nextInt(2);
        if(RandomXDirection==0)
        {
            RandomXDirection--;
        }
        setXDirection(RandomXDirection * initialSpeed);
        int RandomYDirection = random.nextInt(2);
        if(RandomYDirection==0)
        {
            RandomYDirection--;
        }
        setYDirection(RandomYDirection * initialSpeed);
    }

    public void setYDirection(int randomYDirection)
    {
        yVelocity = randomYDirection;
    }
    public void setXDirection(int randomXDirection)
    {
        xVelocity = randomXDirection;
    }

    public void move()
    {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics G)
    {
        G.setColor(Color.black);
        G.fillOval(x,y,width,height);

        G.setColor(Color.white);
        G.drawLine(1000/2, 0, 1000/2, 555);

    }
}
