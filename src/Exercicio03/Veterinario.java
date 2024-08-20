package Exercicio03;

import Exercicio01.Animal;

/*
    Implemente uma classe Veterinario que contenha um
    metodo examinar() cujo parâmetro de entrada é um Animal, quando o animal for examinado ele deve emitir um som,
    passe os 3 animais com parâmetro.
 */
public class Veterinario {
    public void examinar(Animal animal) {
        animal.emitirSom();
    }
}
