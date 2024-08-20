package Exercicio03;

import Exercicio01.Animal;
import Exercicio01.Cachorro;
import Exercicio01.Cavalo;
import Exercicio01.Preguica;

public class TesteVeterinario {
    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();

        Cachorro cachorro = new Cachorro("Rex", 5);
        Cavalo cavalo = new Cavalo("Pé de Pano", 10);
        Preguica preguica = new Preguica("Dorminhoco", 15);

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        //Alternativamente
        Animal cachorro1 = new Cachorro("Rex", 5);
        Animal cavalo1 = new Cavalo("Spirit", 8);
        Animal preguica1 = new Preguica("Sid", 3);

        Animal[] animais = {cachorro1, cavalo1, preguica1};

        for (Animal animal : animais) {
            veterinario.examinar(animal);
        }
    }
}
