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

public class Administrador extends Empregado implements Cloneable {

    private double ajudaDeCusto;

    public Administrador() {
    }

    public Administrador(String nome,
                         int codigoSetor,
                         double salarioBase,
                         double imposto,
                         double ajudaDeCusto) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.setAjudaDeCusto(ajudaDeCusto);
    }

    public Administrador(String nome,
                         String endereco,
                         int codigoSetor,
                         double salarioBase,
                         double imposto,
                         double ajudaDeCusto) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.setAjudaDeCusto(ajudaDeCusto);
    }

    public Administrador(String nome,
                         String endereco,
                         String telefone,
                         int codigoSetor,
                         double salarioBase,
                         double imposto,
                         double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.setAjudaDeCusto(ajudaDeCusto);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        if (ajudaDeCusto < 0) throw new IllegalArgumentException("A ajuda de custo não pode ser negativa.");
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(Administrador administrador) {
        super(administrador);
        this.ajudaDeCusto = administrador.ajudaDeCusto;
    }

    @Override
    public Object clone() {
        Administrador clone = null;
        try {
            clone = new Administrador(this);
        } catch (Exception ignored) {
        }
        return clone;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Administrador that = (Administrador) obj;

        return super.equals(obj) &&
                Double.compare(this.ajudaDeCusto, that.ajudaDeCusto) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = super.hashCode();

        hash *= prime + Double.hashCode(ajudaDeCusto);

        if (hash < 0) hash *= -1;

        return hash;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\t\"nome\": \"" + getNome() + "\",\n" +
                "\t\"endereco\": \"" + getEndereco() + "\",\n" +
                "\t\"telefone\": \"" + getTelefone() + "\",\n" +
                "\t\"codigoSetor\": " + getCodigoSetor() + ",\n" +
                "\t\"salarioBase\": " + getSalarioBase() + ",\n" +
                "\t\"imposto\": " + getImposto() + ",\n" +
                "\t\"ajudaDeCusto\": " + getAjudaDeCusto() + ",\n" +
                "\t\"salarioLiquido\": " + calcularSalario() + "\n" +
                "}\n";
    }
}
