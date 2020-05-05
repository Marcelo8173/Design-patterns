
package Strategy;

//como cada imposto deve ser calculado em cima do orcamento, eu recebo a classe orcamento como parametro da função
public interface Imposto {
    public double calcula(Orcamento orcamento);
}
