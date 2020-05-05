
package Strategy;


public class Principal {
    public static void main(String[] args) {
        ICMS icms = new ICMS();
        ISS iss = new ISS();
        Orcamento orcamento = new Orcamento(14);
        calcularImposto calculadora = new calcularImposto();
        
        calculadora.calculadora(orcamento, iss);
        calculadora.calculadora(orcamento, icms);

    }
}
