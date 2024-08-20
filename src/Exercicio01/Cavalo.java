package Exercicio01;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som do cavalinho");
    }

    public void correr() {
        System.out.println("Cavalinho Correndo");
    }
}
