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
public class TrigreToy extends Felino{

    public TrigreToy() {
        correrStrategy = new CorrerToy();
        pularStrategy = new NaoPula();
    }
    
    @Override
    public void display() {}

    @Override
    public void rugir() {}
    
}
