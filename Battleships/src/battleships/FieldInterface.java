/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleships;

/**
 *
 * @author Vaughn
 */
public interface FieldInterface {
    public void resetBattleField();
    public void setClicked(int x, int y);
    public Boolean isClicked(int x, int y);
    public int getValueOfSpot(int x, int y);
    public void setValueOfSpot(int x, int y, int value);
    public void nextPlayer();
}
