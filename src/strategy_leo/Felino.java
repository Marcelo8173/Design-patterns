
package strategy_leo;

//superclasse
abstract public class Felino {
    protected CorrerStrategy correrStrategy;
    protected PularStrategy pularStrategy;
    
    abstract public void display();
    abstract public void rugir();

    public void setCorrerStrategy(CorrerStrategy correrStrategy) {
        this.correrStrategy = correrStrategy;
    }
    
    public void performarCorrer(){
        correrStrategy.correr();
    }
    
    
    public void setPularStrategy(PularStrategy pularStrategy) {
        this.pularStrategy = pularStrategy;
    }
    
    public void performarPular(){
        pularStrategy.pular();
    }
}