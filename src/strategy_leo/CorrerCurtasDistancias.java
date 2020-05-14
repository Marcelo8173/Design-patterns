/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy_leo;

//classe strategy concreta - essa classe é uma familia de algoritmos pronta para ser usada.


public class CorrerCurtasDistancias implements CorrerStrategy{

    @Override
    public void correr() {
        System.out.println("correr curtas distancias, com o objetivo proximo");
    }
    
}
