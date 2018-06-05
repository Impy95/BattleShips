/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleships;

import java.util.HashMap;

/**
 *
 * @author Vaughn
 */
public class BattleField implements FieldInterface {
    private static final int X = 8;
    private static final int Y = 8;
    private int[][] player1 = new int[X][Y];
    private int[][] player2 = new int[X][Y];
    private int player = 1;
    
    private HashMap<String, Boolean> clickedplayer1 = new HashMap<>();
    private HashMap<String, Boolean> clickedplayer2 = new HashMap<>();

    
    public BattleField() {
        resetBattleField();
    }
    
    @Override
    public void resetBattleField() {
        player1 = new int[X][Y];
        player2 = new int[X][Y];
        // clear both maps
        clickedplayer1.clear();
        clickedplayer2.clear();
        // fill both maps with the buttons and false value
        for (int x = 0; x < X; x++)
        {
            for (int y = 0; y < Y; y++)
            {
                clickedplayer1.put(x+"-"+y, Boolean.FALSE);
                clickedplayer2.put(x+"-"+y, Boolean.FALSE);
            }
        }
        setPlayer1();
    }
    
    @Override
    public void setClicked(int x, int y) {
        switch(player){
            // set button that is clicked to being true
            case 1:
                clickedplayer1.put(x+"-"+y, Boolean.TRUE);
                break;
            case 2:
                clickedplayer2.put(x+"-"+y, Boolean.TRUE);
        }
    }
    
    @Override
    public Boolean isClicked(int x, int y) {
        switch(player) {
            // return if the button at the position passed is clicked
            case 1:
                return clickedplayer1.get(x+"-"+y);
            case 2:
                return clickedplayer2.get(x+"-"+y);
        }
        return false;
    }
    
    @Override
    public int getValueOfSpot(int x, int y) {
        switch (player) {
            case 1:
                return player1[x][y];
            case 2:
                return player2[x][y];
        }
        return 0;
    }
    
    @Override
    public void setValueOfSpot(int x, int y, int value) {
        switch (player) {
            case 1:
                player1[x][y] = value;
                break;
            case 2:
                player2[x][y] = value;
                break;
        }
    }
   
    public void nextPlayer() {
        player = player == 1 ? 2:1;
    }
    
    private void setPlayer1() {
        player = 1;
    }
    
    public int getPlayer() {
        return player;
    }
    
    public static int getX() {
        return X;
    }
    
    public static int getY() {
        return Y;
    }
}
