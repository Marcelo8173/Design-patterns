/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy_leo;

/**
 *
 * @author marcelo
 */
public class Leopardo extends Felino{

    public Leopardo() {
        correrStrategy = new CorrerLongasDistancias();
        pularStrategy = new PularAlto();
    }
    
    
    @Override
    public void display() {}

    @Override
    public void rugir() {}
}
