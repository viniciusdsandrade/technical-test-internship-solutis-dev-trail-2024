package Exercicio01;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som do cachorrinho");
    }

    public void correr() {
        System.out.println("Cachorrinho Correndo");
    }
}
