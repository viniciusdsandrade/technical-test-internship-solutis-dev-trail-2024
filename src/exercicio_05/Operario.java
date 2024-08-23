package exercicio_05;

import exercicio_03.Empregado;

/*
    Implemente a classe Operario como subclasse da classe Empregado.
    Um determinado operário tem como atributos, para além dos atributos da classe Pessoa e da classe Empregado,
    o atributo valorProducao (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário)
    e comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário).
    Note que deverá redefinir nesta subclasse o metodo herdado calcularSalario
    (o salário de um operário é equivalente ao salário de um empregado usual acrescido da referida comissão).
    Escreva um programa de teste adequado para esta classe.
 */

public class Operario extends Empregado implements Cloneable {

    private double valorProducao;
    private double comissao;

    public Operario() {
    }

    public Operario(String nome,
                    int codigoSetor,
                    double salarioBase,
                    double imposto,
                    double valorProducao,
                    double comissao) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.setValorProducao(valorProducao);
        this.setComissao(comissao);
    }

    public Operario(String nome,
                    String endereco,
                    int codigoSetor,
                    double salarioBase,
                    double imposto,
                    double valorProducao,
                    double comissao) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.setValorProducao(valorProducao);
        this.setComissao(comissao);
    }

    public Operario(String nome,
                    String endereco,
                    String telefone,
                    int codigoSetor,
                    double salarioBase,
                    double imposto,
                    double valorProducao,
                    double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.setValorProducao(valorProducao);
        this.setComissao(comissao);
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setValorProducao(double valorProducao) {
        if (valorProducao < 0) throw new IllegalArgumentException("O valor de produção não pode ser negativo.");
        this.valorProducao = valorProducao;
    }

    public void setComissao(double comissao) {
        if (comissao < 0) throw new IllegalArgumentException("A comissão não pode ser negativa.");
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao * comissao / 100);
    }

    public Operario(Operario copia) {
        super(copia);
        this.valorProducao = copia.valorProducao;
        this.comissao = copia.comissao;
    }

    @Override
    public Object clone() {
        Operario clone = null;
        try {
            clone = new Operario(this);
        } catch (Exception ignored) {
        }
        return clone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Operario that = (Operario) obj;

        return super.equals(obj) &&
                Double.compare(this.valorProducao, that.valorProducao) == 0 &&
                Double.compare(this.comissao, that.comissao) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = super.hashCode();

        hash *= prime + Double.hashCode(valorProducao);
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
                "\t\"valorProducao\": " + getValorProducao() + ",\n" +
                "\t\"comissao\": " + getComissao() + ",\n" +
                "\t\"salarioTotal\": " + calcularSalario() + "\n" +
                "}\n";
    }
}
