import animais_aereos.Pombo;
import animais_aquaticos.Peixe;
import animais_terrestres.Cachorro;
import animais_terrestres.Elefante;
import animais_terrestres.Gato;
import animais_terrestres.Leao;

import static enums.habitats.HabitatAquatico.RECIFES_DE_CORAIS;
import static enums.habitats.HabitatTerrestre.*;
import static enums.habitats.HabitatsAereos.FLORESTAS;

public class Teste {
    public static void main(String[] args) {
        // Teste para Arara Azul
        Pombo arara = new Pombo(FLORESTAS, "Arara", 5, 40.5f, 1.2f, 3000f, 0.5f, 50.0f, 8);
        System.out.println(arara);
        arara.comer(0.3f);
        arara.moverse(15.0f);
        arara.dormir(6);

        // Teste para Peixe-palhaço
        Peixe peixe = new Peixe(RECIFES_DE_CORAIS, "Nemo", 2, 10, 0.2f, 20, 5);
        System.out.println(peixe);
        peixe.comer(0.1f);
        peixe.moverse(5.0f);
        peixe.dormir(4);

        // Teste para Cachorro
        Cachorro cachorro = new Cachorro(CAMPO_CULTIVO, "Rex", 3, 4, 25.0f, 1.0f, 10.0f, 12);
        System.out.println(cachorro);
        cachorro.comer(0.5f);
        cachorro.moverse(5.0f);
        cachorro.dormir(10);

        // Teste para Elefante
        Elefante elefante = new Elefante(SAVANAS, "Dumbo", 10, 4, 20.0f, 50.0f, 100.0f, 14);
        System.out.println(elefante);
        elefante.comer(30.0f);
        elefante.moverse(10.0f);
        elefante.dormir(12);

        // Teste para Gato
        Gato gato = new Gato(FLORESTA_TEMPERADA, "Mingau", 2, 4, 30.0f, 0.3f, 5.0f, 16);
        System.out.println(gato);
        gato.comer(0.2f);
        gato.moverse(3.0f);
        gato.dormir(14);

        // Teste para Leão
        Leao leao = new Leao(SAVANAS, "Simba", 8, 4, 50.0f, 5.0f, 20.0f, 10);
        System.out.println(leao);
        leao.comer(10.0f);
        leao.moverse(8.0f);
        leao.dormir(6);
    }
}
