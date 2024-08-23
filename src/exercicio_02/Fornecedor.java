package exercicio_02;

import exercicio_01.Pessoa;

/*
    Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor.
    Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa,
    os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor).

    Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores,
    um metodo obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e valorDivida.
    Após implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o
    funcionamento dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa.
 */

public class Fornecedor extends Pessoa implements Cloneable {

    private double valorCredito;
    private double valorDivida;

    public Fornecedor() {
        super();
    }

    public Fornecedor(String nome,
                      double valorCredito,
                      double valorDivida) {
        super(nome);
        this.setValorCredito(valorCredito);
        this.setValorDivida(valorDivida);
    }

    public Fornecedor(String nome,
                      String endereco,
                      double valorCredito,
                      double valorDivida) {
        super(nome, endereco);
        this.setValorCredito(valorCredito);
        this.setValorDivida(valorDivida);
    }

    public Fornecedor(String nome,
                      String endereco,
                      String telefone,
                      double valorCredito,
                      double valorDivida) {
        super(nome, endereco, telefone);
        this.setValorCredito(valorCredito);
        this.setValorDivida(valorDivida);
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorCredito(double valorCredito) {
        if (valorCredito < 0) throw new IllegalArgumentException("O valor do crédito não pode ser negativo.");
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(double valorDivida) {
        if (valorDivida < 0) throw new IllegalArgumentException("O valor da dívida não pode ser negativo.");
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    public Fornecedor(Fornecedor copia) {
        super(copia);
        this.valorCredito = copia.valorCredito;
        this.valorDivida = copia.valorDivida;
    }

    @Override
    public Object clone() {
        Fornecedor clone = null;
        try {
            clone = new Fornecedor(this);
        } catch (Exception ignored) {
        }
        return clone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Fornecedor that = (Fornecedor) obj;

        return super.equals(obj) &&
                Double.compare(this.valorCredito, that.valorCredito) == 0 &&
                Double.compare(this.valorDivida, that.valorDivida) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = super.hashCode();

        hash *= prime + Double.hashCode(valorCredito);
        hash *= prime + Double.hashCode(valorDivida);

        if (hash < 0) hash *= -1;

        return hash;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\t\"nome\": \"" + getNome() + "\",\n" +
                "\t\"endereco\": \"" + getEndereco() + "\",\n" +
                "\t\"telefone\": \"" + getTelefone() + "\",\n" +
                "\t\"valorCredito\": " + getValorCredito() + ",\n" +
                "\t\"valorDivida\": " + getValorDivida() + ",\n" +
                "\t\"saldo\": " + obterSaldo() + "\n" +
                "}\n";
    }
}