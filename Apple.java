import java.awt.Graphics;
import java.awt.Color;

public class Apple {

    private int xCoor, yCoor, height, width;

    public int getxCoor() {
        return this.xCoor;
    }

    public void setxCoor(int xCoor) {
        this.xCoor = xCoor;
    }

    public int getyCoor() {
        return this.yCoor;
    }

    public void setyCoor(int yCoor) {
        this.xCoor = yCoor;
    }

    public Apple(int xCoor, int yCoor, int tileSize) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;

        width = tileSize;
        height = tileSize;
    }

    public void tick() {

    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(xCoor * width, yCoor * height, width, height);
    }

}
