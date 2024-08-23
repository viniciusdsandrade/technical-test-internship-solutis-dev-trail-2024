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

public class Pessoa implements Cloneable {

    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String endereco) {
        this.setNome(nome);
        this.setEndereco(endereco);
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
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
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        if (endereco == null || endereco.trim().isEmpty())
            throw new IllegalArgumentException("Endereço não pode ser nulo ou vazio.");
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        if (!telefone.matches("\\(\\d{2}\\) \\d{4,5}-\\d{4}"))
            throw new IllegalArgumentException("Telefone deve estar no formato (XX) XXXXX-XXXX.");
        this.telefone = telefone;
    }

    // Construtor de cópia
    public Pessoa(Pessoa copia) {
        this.nome = copia.nome;
        this.endereco = copia.endereco;
        this.telefone = copia.telefone;
    }

    @Override
    public Object clone() {
        Pessoa clone = null;
        try {
            clone = new Pessoa(this);
        } catch (Exception ignored) {
        }
        return clone;
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
                "\t\"nome\": \"" + nome + "\",\n" +
                "\t\"endereco\": \"" + endereco + "\",\n" +
                "\t\"telefone\": \"" + telefone + "\"\n" +
                "}\n";
    }
}
