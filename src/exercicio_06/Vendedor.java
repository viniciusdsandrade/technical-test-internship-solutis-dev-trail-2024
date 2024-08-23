package exercicio_06;

import exercicio_03.Empregado;

/*
    Implemente a classe Vendedor como subclasse da classe Empregado. Um determinado vendedor tem como atributos,
    para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorVendas (correspondente ao valor monetário dos artigos vendidos)
    e o atributo comissao (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor).
    Note que deverá redefinir nesta subclasse o metodo herdado calcularSalario (o salário de um vendedor
    é equivalente ao salário de um empregado usual acrescido da referida comissão).
    Escreva um programa de teste adequado para esta classe.
 */

public class Vendedor extends Empregado implements Cloneable {

    private double valorVendas;
    private double comissao;

    public Vendedor() {
    }

    public Vendedor(String nome,
                    int codigoSetor,
                    double salarioBase,
                    double imposto,
                    double valorVendas,
                    double comissao) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.setValorVendas(valorVendas);
        this.setComissao(comissao);
    }

    public Vendedor(String nome,
                    String endereco,
                    int codigoSetor,
                    double salarioBase,
                    double imposto,
                    double valorVendas,
                    double comissao) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.setValorVendas(valorVendas);
        this.setComissao(comissao);
    }

    public Vendedor(String nome,
                    String endereco,
                    String telefone,
                    int codigoSetor,
                    double salarioBase,
                    double imposto,
                    double valorVendas,
                    double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.setValorVendas(valorVendas);
        this.setComissao(comissao);
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setValorVendas(double valorVendas) {
        if (valorVendas < 0) throw new IllegalArgumentException("O valor das vendas não pode ser negativo.");
        this.valorVendas = valorVendas;
    }

    public void setComissao(double comissao) {
        if (comissao < 0) throw new IllegalArgumentException("A comissão não pode ser negativa.");
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * comissao / 100);
    }

    public Vendedor(Vendedor copia) {
        super(copia);
        this.valorVendas = copia.valorVendas;
        this.comissao = copia.comissao;
    }

    @Override
    public Object clone() {
        Vendedor copia = null;
        try {
            copia = new Vendedor(this);
        } catch (Exception ignored) {
        }
        return copia;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Vendedor that = (Vendedor) obj;

        return super.equals(obj) &&
                Double.compare(this.valorVendas, that.valorVendas) == 0 &&
                Double.compare(this.comissao, that.comissao) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = super.hashCode();

        hash *= prime + Double.hashCode(valorVendas);
        hash *= prime + Double.hashCode(comissao);

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
                "\t\"valorVendas\": " + getValorVendas() + ",\n" +
                "\t\"comissao\": " + getComissao() + ",\n" +
                "\t\"salarioTotal\": " + calcularSalario() + "\n" +
                "}\n";
    }
}