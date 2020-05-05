/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

//classe que é capaz de manipular as classes que implemetam a interface
public class calcularImposto {
    public void calculadora(Orcamento orcamento, Imposto qualquerImposto){
        double resultado = qualquerImposto.calcula(orcamento);
        
        System.out.println(resultado);
    }
}
