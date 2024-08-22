package exercicio_01;

/*
    Cria uma Classe Pessoa, contendo os atributos encapsulados,
    com seus respectivos seletores (getters) e modificadores (setters),
    e ainda o construtor padrão e pelo menos mais duas opções de construtores
    conforme sua percepção.

    Atributos:
        String nome;
        String endereço;
        String telefone;
*/
public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Pessoa that = (Pessoa) obj;

        return this.nome.equals(that.nome) &&
                this.endereco.equals(that.endereco) &&
                this.telefone.equals(that.telefone);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 1;

        hash *= prime + nome.hashCode();
        hash *= prime + endereco.hashCode();
        hash *= prime + telefone.hashCode();

        if (hash < 0) hash *= -1;

        return hash;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"nome\": \"" + nome + "\",\n" +
                "\"endereco\": \"" + endereco + "\",\n" +
                "\"telefone\": \"" + telefone + "\"\n" +
                "}\n";
    }
}
