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
public class ShipPieces {
    private boolean isShipDead;
    
    public ShipPieces() {
        isShipDead = false;
    }
    
    public void destroyed() {
        isShipDead = true;
    }
    
    public boolean isDestroyed() {
        return isShipDead;
    }
}
