package exercicio_04;

import exercicio_03.Empregado;

/*
    Implemente a classe Administrador como subclasse da classe Empregado.
    Um determinado administrador tem como atributos, para além dos atributos da classe Pessoa e da classe Empregado,
    o atributo ajudaDeCusto (ajudas referentes a viagens, estadias, ...).
    Note que deverá redefinir na classe Administrador o metodo herdado calcularSalario
    (o salário de um administrador é equivalente ao salário de um empregado usual acrescido das ajudas de custo).
    Escreva um programa de teste adequado para esta classe.
 */

public class Administrador extends Empregado {

    private double ajudaDeCusto;

    public Administrador() {
        super();
    }

    public Administrador(String nome,
                         int codigoSetor,
                         double salarioBase,
                         double imposto,
                         double ajudaDeCusto) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome,
                         String endereco,
                         int codigoSetor,
                         double salarioBase,
                         double imposto,
                         double ajudaDeCusto) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome,
                         String endereco,
                         String telefone,
                         int codigoSetor,
                         double salarioBase,
                         double imposto,
                         double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
}
