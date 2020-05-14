/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy_leo;

public class FelinoCliente {
    public static void main(String[] args) {
        Felino leo = new Leo();
        Felino leopardo = new Leopardo();
        Felino tigreToy = new TrigreToy();
        
        
        leo.performarCorrer();
        leo.performarPular();
        leopardo.performarCorrer();
        leopardo.performarPular();
        tigreToy.performarCorrer();
        tigreToy.performarPular();
        
        
        leo.setCorrerStrategy(new CorrerLongasDistancias());
        leo.performarCorrer();
    }
 
}
