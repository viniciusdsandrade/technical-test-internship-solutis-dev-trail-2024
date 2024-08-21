package exercicio_05;

/*
    Implemente a classe Operario como subclasse da classe Empregado.
    Um determinado operário tem como atributos, para além dos atributos da classe Pessoa e da classe Empregado,
    o atributo valorProducao (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário)
    e comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário).
    Note que deverá redefinir nesta subclasse o metodo herdado calcularSalario
    (o salário de um operário é equivalente ao salário de um empregado usual acrescido da referida comissão).
    Escreva um programa de teste adequado para esta classe.
 */

import exercicio_03.Empregado;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario() {
        super();
    }

    public Operario(String nome,
                    int codigoSetor,
                    double salarioBase,
                    double imposto,
                    double valorProducao,
                    double comissao) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome,
                    String endereco,
                    int codigoSetor,
                    double salarioBase,
                    double imposto,
                    double valorProducao,
                    double comissao) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome,
                    String endereco,
                    String telefone,
                    int codigoSetor,
                    double salarioBase,
                    double imposto,
                    double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao * comissao / 100);
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"nome\":\"" + getNome() + "\"," +
                "\"endereco\":\"" + getEndereco() + "\"," +
                "\"telefone\":\"" + getTelefone() + "\"," +
                "\"codigoSetor\":" + getCodigoSetor() + "," +
                "\"salarioBase\":" + getSalarioBase() + "," +
                "\"imposto\":" + getImposto() + "," +
                "\"valorProducao\":" + valorProducao + "," +
                "\"comissao\":" + comissao + "," +
                "\"salarioTotal\":" + calcularSalario() +
                "}\n";
    }
}
