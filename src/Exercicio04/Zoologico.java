package Exercicio04;

import Exercicio01.Animal;
import Exercicio01.Cachorro;
import Exercicio01.Cavalo;
import Exercicio01.Preguica;

/*
    Crie uma classe Zoologico, com 10 jaulas (utilize um array) coloque em cada jaula um animal diferente,
    percorra cada jaula e emita o som e, se o tipo de animal possuir o comportamento, faça-o correr.
 */
public class Zoologico {

    private final Animal[] jaulas = new Animal[10];

    public Zoologico() {
        jaulas[0] = new Cachorro("Rex", 5);
        jaulas[1] = new Cavalo("Spirit", 8);
        jaulas[2] = new Preguica("Sid", 3);
        jaulas[3] = new Cachorro("Rex", 5);
        jaulas[4] = new Cavalo("Spirit", 8);
        jaulas[5] = new Preguica("Sid", 3);
        jaulas[6] = new Cachorro("Rex", 5);
        jaulas[7] = new Cavalo("Spirit", 8);
        jaulas[8] = new Preguica("Sid", 3);
        jaulas[9] = new Cachorro("Rex", 5);
    }

    // Percorra cada jaula e emita o som e, se o tipo de animal possuir o comportamento, faça-o correr.
    public void emitirSom() {
        for (Animal animal : jaulas) {
            animal.emitirSom();
            switch (animal) {
                case Cachorro cachorro -> cachorro.correr();
                case Cavalo cavalo -> cavalo.correr();
                default -> {
                }
            }
        }
    }
}
