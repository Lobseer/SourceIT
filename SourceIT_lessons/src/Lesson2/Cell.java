package Lesson2;

/**
 * Created by А1 on 17.10.2016.
 */
public class Cell {

    public void setMine(boolean mine) {
        this.mine = mine;
    }
    public boolean isMine() {
        return mine;
    }

    private boolean mine;

    public Cell()
    {
        mine = false;
    }
    public Cell(boolean value)
    {
        mine = value;
    }

    public String toString() {
        return mine ? "[X]" : "[ ]";
    }
}
