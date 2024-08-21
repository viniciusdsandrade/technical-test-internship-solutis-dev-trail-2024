package Exercicio01;

/*
    Crie uma hierarquia de classes conforme o diagrama abaixo com os seguintes atributos e comportamentos
    Utilize os seus conhecimento e distribua as características de forma que tudo o que for comum a todos os animais
    fique na classe animal

Cachorro
    Possui nome
    Possui Idade
    Deve emitir som
    Deve correr

Cavalo
    Possui Nome
    Possui idade
    Deve emitir som
    Deve correr

Preguiça
    Possui Nome
    Possui idade
    Deve emitir som
    Deve subir em árvore
 */
public class Animal {


    private String nome;
    private int idade;

    public Animal() {
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Som do animal");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Animal animal)) return false;

        return idade == animal.idade &&
                nome.equals(animal.nome);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 1;

        hash *= prime + nome.hashCode();
        hash *= prime + idade;

        if (hash < 0) hash *= -1;

        return hash;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"nome\": \"" + nome + "\",\n" +
                "\"idade\": " + idade + "\n" +
                "}\n";
    }
}
