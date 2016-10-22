package Lesson2;

/**
 * Created by Lobseer on 21.10.2016.
 */
public class Player {
    private int positionX;
    private int positionY;
    public Player() {
        positionX=0;
        positionY=0;
    }
    public Player(int startX, int startY)
    {
        positionX=startX;
        positionY=startY;
    }
    public void move(int x, int y) {
        positionX+=x;
        positionY+=y;
    }
}

class Vector2
{
    private int x;
    private int y;
    public final static Vector2 UP = new Vector2(1,0);
    public final static Vector2 DOWN = new Vector2(-1,0);
    public final static Vector2 RIGHT= new Vector2(0,1);
    public final static Vector2 LEFT = new Vector2(0,-1);


    public Vector2() {
        x=0;
        y=0;
    }
    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "("+x+", "+y+")";
    }
}
