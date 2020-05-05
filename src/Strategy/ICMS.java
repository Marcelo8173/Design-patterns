
package Strategy;

//A classe de comportamento vão implementar a interface para que possam ser usadas pelo context depois

public class ICMS implements Imposto{
    public double calcula(Orcamento orcamento){
        return orcamento.getValor() * 0.05;
    }
}
