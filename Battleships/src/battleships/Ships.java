/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleships;

import java.util.Random;

/**
 *
 * @author Vaughn
 */

enum ShipTypes {
    AIRCRAFT_CARRIER(5), BATTLESHIP(4), SUBMARINE(3), DESTROYER(2);

    private final int size;
    
    ShipTypes(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }
}
public class Ships extends BattleField {

    private int size;
    private int health;
    private int player1health;
    private int player2health;
    private int player1moves;
    private int player2moves;
    
    private ShipTypes[] type;
    
    public Ships() {
        resetShips();
    }
    
    
    public void resetShips() {
        // set health to 0;
        health = 0;
        player1moves = 0;
        player2moves = 0;
        // reset the board
        super.resetBattleField();
        // place player 1s ship pieces
        placeShipPieces();
        // switch to player 2;
        super.nextPlayer();
        // place player 2s ship pieces
        placeShipPieces();
        // switch back to player 1
        super.nextPlayer();
        // health is total health of all ships
        // divide for 2 for each players health
        player1health = health / 2;
        player2health = health / 2;
    }
    
    public void placeShipPieces() {
        // while loops to place all ships
        while (!placeShips(ShipTypes.AIRCRAFT_CARRIER)) {}
        while (!placeShips(ShipTypes.BATTLESHIP)){}
        while (!placeShips(ShipTypes.DESTROYER)){}
        while (!placeShips(ShipTypes.SUBMARINE)){}
        while (!placeShips(ShipTypes.DESTROYER)){}
        while (!placeShips(ShipTypes.SUBMARINE)){}
    }
    
    public Boolean placeShips(ShipTypes s) {
        Random rand = new Random();
        
        // random position of board for x and y coords
        int xpos = rand.nextInt(BattleField.getX());
        int ypos = rand.nextInt(BattleField.getX());
 //       System.out.println("X POS - " + xpos + "\nY POS - " + ypos);
        
        // random number between 0-1 for orientation
        // 0 = horizontal
        // 1 = vertical
        int orientation = rand.nextInt(2);
 //       System.out.println("Orientation - " + orientation);  
        
        boolean isSpotTaken = true;
        switch (orientation) {
            // vertical placement
            case 0:
                if (xpos < s.getSize() - 1) {
                    // for all buttons that the ship will fit into
                    for (int i=xpos;i<xpos + s.getSize(); i++) {
                        // if the value of the spot is above 0
                        // it is taken by another ship
                        // say the spot is taken
                        if (super.getValueOfSpot(i, ypos) != 0) {
                            isSpotTaken = false;
                        } 
                    }
                    // if spot is not taken
                    if (isSpotTaken) {
                        // insert the ship into those spots 
                        // and increase health
                        for (int i=xpos;i<xpos + s.getSize(); i++) {
                            super.setValueOfSpot(i, ypos, s.getSize());
                            health += 1;
                        }
                    }
                } else {
                    // goes the opposite direction
                    // to check what spots are available
                    for (int i=xpos;i>xpos - s.getSize(); i--) {
                        if (super.getValueOfSpot(i, ypos) != 0) {
                            isSpotTaken = false;
                        }                        
                    }
                    if (isSpotTaken) {
                        for (int i=xpos;i>xpos - s.getSize(); i--) {
                            super.setValueOfSpot(i, ypos, s.getSize());
                            health += 1;
                        }                    
                    }
                }
                break;
            // horizontal placement
            case 1:
                 if (ypos < s.getSize() - 1) {
                    for (int i=ypos;i<ypos + s.getSize(); i++) {
                        if (super.getValueOfSpot(xpos, i) != 0) {
                            isSpotTaken = false;
                        } 
                    }
                    if (isSpotTaken) {
                        for (int i=ypos;i<ypos + s.getSize(); i++) {
                            super.setValueOfSpot(xpos, i, s.getSize());
                            health += 1;
                        }
                    }                    
                } else {
                    for (int i=ypos;i>ypos - s.getSize(); i--) {
                        if (super.getValueOfSpot(xpos, i) != 0) {
                            isSpotTaken = false;
                        }
                    }
                    if (isSpotTaken) {
                        for (int i=ypos;i>ypos - s.getSize(); i--) {
                            super.setValueOfSpot(xpos, i, s.getSize());
                            health += 1;
                        }                    
                    }                    
                }
        }        
        return isSpotTaken;
    }
    
    public void shipHit(int player) {
        switch(player) {
            case 1:
                player1health -= 1;
                break;
            case 2:
                player2health -= 1;
                break;
        }
    }
    
    public void moveTaken(int player) {
        switch (player) {
            case 1:
                player1moves++;
                break;
            case 2:
                player2moves++;
                break;
        }
    }
    
    public int getHealth(int player) {
        switch(player) {
            case 1:
                return player1health;
            case 2:
                return player2health;
        }
        return health;
    }
    
    public int getPlayerMoves(int player) {
        switch(player) {
            case 1: 
                return player1moves;
            case 2:
                return player2moves;
        }
        return 0;
    }

}
