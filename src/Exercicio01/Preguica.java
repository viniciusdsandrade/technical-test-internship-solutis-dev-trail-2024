package Exercicio01;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som da preguiçinha");
    }

    public void subirArvore() {
        System.out.println("Subir em árvore");
    }
}
