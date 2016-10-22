package Lesson2;

import Lesson2.Cell;

import java.util.Random;

/**
 * Created by А1 on 17.10.2016.
 */
public class Saper {
    private int width;
    private int height;
    private int mineAmount;
    Cell[][] cells;
    Player player;

    public Saper() {
        height = 5;
        width = 5;
        mineAmount = 7;
        cells=new Cell[height][width];
        for(int i=0;i<height;i++)
            for(int j=0;j<width;j++)
                cells[i][j] = new Cell();
        mineGen(mineAmount);
    }
    public Saper(int _height, int _width, int _mineAmount) {
        height=_height;
        width=_width;
        mineAmount=_mineAmount;
        cells=new Cell[height][width];
        for(int i=0;i<height;i++)
            for(int j=0;j<width;j++)
                cells[i][j] = new Cell();
        mineGen(mineAmount);
    }
    public void startGame() {
        player=new Player();
    }
    private void mineGen(int mineAmout)
    {
        Random rnd = new Random();
        for(int i = 0 ; i< mineAmout; i++) {
            int r1 = rnd.nextInt(height);
            int r2 = rnd.nextInt(width);
          cells[r1][r2].setMine(true);
        }
    }
    public String toString() {
        String temp = "";
        for(int i=0;i<cells.length;i++) {
            for (int j = 0; j < cells[i].length; j++) {
                temp+=cells[i][j]+" ";
            }
            temp+="\n";
        }
        return temp;
    }
}
