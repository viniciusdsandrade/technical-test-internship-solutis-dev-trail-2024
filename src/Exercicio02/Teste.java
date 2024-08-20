package Exercicio02;

import Exercicio01.Animal;
import Exercicio01.Cachorro;
import Exercicio01.Cavalo;
import Exercicio01.Preguica;

import java.util.Arrays;

/*
    Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque o metodo que emite
    o som de cada um de forma polimórfica, isto é, independente do tipo de animal.
 */
public class Teste {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Spirit", 8);
        Animal preguica = new Preguica("Sid", 3);

        Animal[] animais = {cachorro, cavalo, preguica};

        Arrays.stream(animais).forEach(Animal::emitirSom);
    }
}
