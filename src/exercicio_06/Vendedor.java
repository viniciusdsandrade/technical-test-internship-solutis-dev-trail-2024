package exercicio_06;

import exercicio_03.Empregado;

/*
    Implemente a classe Vendedor como subclasse da classe Empregado. Um determinado vendedor tem como atributos,
    para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorVendas (correspondente ao valor monetário dos artigos vendidos)
    e o atributo comissao (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor).
    Note que deverá redefinir nesta subclasse o metodo herdado calcularSalario (o salário de um vendedor
    é equivalente ao salário de um empregado usual acrescido da referida comissão). Escreva um programa de teste adequado para esta classe.
 */

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor() {
        super();
    }

    public Vendedor(String nome,
                    int codigoSetor,
                    double salarioBase,
                    double imposto,
                    double valorVendas,
                    double comissao) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome,
                    String endereco,
                    int codigoSetor,
                    double salarioBase,
                    double imposto,
                    double valorVendas,
                    double comissao) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
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
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * comissao / 100);
    }
}