package exercicio_03;

import exercicio_01.Pessoa;

/*
    Considere, como subclasse da classe Pessoa, a classe Empregado.
    Considere que cada instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa,
    os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos).

    Implemente a classe Empregado com métodos seletores e modificadores e um metodo calcularSalario.
    Escreva um programa de teste adequado para a classe Empregado.
 */

public class Empregado extends Pessoa implements Cloneable {

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado() {
        super();
    }

    public Empregado(String nome,
                     int codigoSetor,
                     double salarioBase,
                     double imposto) {
        super(nome);
        this.setCodigoSetor(codigoSetor);
        this.setSalarioBase(salarioBase);
        this.setImposto(imposto);
    }

    public Empregado(String nome,
                     String endereco,
                     int codigoSetor,
                     double salarioBase,
                     double imposto) {
        super(nome, endereco);
        this.setCodigoSetor(codigoSetor);
        this.setSalarioBase(salarioBase);
        this.setImposto(imposto);
    }

    public Empregado(String nome,
                     String endereco,
                     String telefone,
                     int codigoSetor,
                     double salarioBase,
                     double imposto) {
        super(nome, endereco, telefone);
        this.setCodigoSetor(codigoSetor);
        this.setSalarioBase(salarioBase);
        this.setImposto(imposto);
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setCodigoSetor(int codigoSetor) {
        if (codigoSetor <= 0) throw new IllegalArgumentException("O código do setor deve ser um número positivo.");
        this.codigoSetor = codigoSetor;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0) throw new IllegalArgumentException("O salário base deve ser um valor positivo.");
        this.salarioBase = salarioBase;
    }

    public void setImposto(double imposto) {
        if (imposto < 0 || imposto > 100) throw new IllegalArgumentException("O imposto deve estar entre 0 e 100.");
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return salarioBase - (salarioBase * imposto / 100);
    }

    @Override
    public Object clone() {
        Empregado clone = null;
        try {
            clone = new Empregado(this);
        } catch (Exception ignored) {
        }
        return clone;
    }

    public Empregado(Empregado copia) {
        super(copia);
        this.codigoSetor = copia.codigoSetor;
        this.salarioBase = copia.salarioBase;
        this.imposto = copia.imposto;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Empregado that = (Empregado) obj;

        return super.equals(obj) &&
                this.codigoSetor == that.codigoSetor &&
                Double.compare(this.salarioBase, that.salarioBase) == 0 &&
                Double.compare(this.imposto, that.imposto) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = super.hashCode();

        hash *= prime + codigoSetor;
        hash *= prime + Double.hashCode(salarioBase);
        hash *= prime + Double.hashCode(imposto);

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
                "\t\"salarioLiquido\": " + calcularSalario() + "\n" +
                "}\n";
    }
}