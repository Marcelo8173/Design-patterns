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
public class Leo extends Felino{

    public Leo() {
        correrStrategy = new CorrerCurtasDistancias();
        pularStrategy = new PularBaixo();
    }

    @Override
    public void display() {}

    @Override
    public void rugir() {}
    
}
