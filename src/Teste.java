import animais_aereos.Pombo;
import animais_aquaticos.Peixe;
import animais_terrestres.Cachorro;
import animais_terrestres.Elefante;
import animais_terrestres.Gato;
import animais_terrestres.Leao;
import enums.habitats.HabitatTerrestre;

import static enums.habitats.HabitatAquatico.OCEANOS;
import static enums.habitats.HabitatTerrestre.SAVANAS;
import static enums.habitats.HabitatsAereos.URBANO;
import static enums.tipoAgua.Agua.SALGADA;

public class Teste {
    public static void main(String[] args) {
        // Criação de um objeto Pombo
        Pombo pombo = new Pombo(URBANO, "Pombo Correio", 2, 50.0f, 0.75f, 3000.0f, 6.0f);

        // Exibir informações iniciais do pombo
        System.out.println("Informações iniciais do Pombo:");
        System.out.println(pombo);

        // Testando os métodos setters e getters
        System.out.println("Nome inicial: " + pombo.getNome());
        System.out.println("Idade inicial: " + pombo.getIdade());
        System.out.println("Massa inicial: " + pombo.getMassaEmKg());

        // Alterando e exibindo valores
        pombo.setNome("Pombo Voador");
        pombo.setIdade(3);
        pombo.setMassaEmKg(0.80f);

        System.out.println("Após alterar atributos:");
        System.out.println("Nome: " + pombo.getNome());
        System.out.println("Idade: " + pombo.getIdade());
        System.out.println("Massa: " + pombo.getMassaEmKg());

        // Testando o metodo comer
        pombo.comer(0.05f);
        System.out.println("Após comer:");
        System.out.println(pombo);

        // Testando o metodo mover (voar)
        pombo.moverse(100.0f);
        System.out.println("Após se mover (voar):");
        System.out.println(pombo);

        // Testando o metodo dormir
        pombo.dormir(8);
        System.out.println("Após dormir:");
        System.out.println(pombo);

        // Testando o metodo voar
        pombo.voar(200.0f);
        System.out.println("Após voar:");
        System.out.println(pombo);

        // Exibir informações finais do pombo
        System.out.println("Informações finais do Pombo:");
        System.out.println(pombo);

        System.out.println("----------------------------------------------------------------------");

        // Criação de um objeto Peixe
        Peixe peixe = new Peixe(OCEANOS, "Peixe-Palhaço", 3, 50.0f, 0.25f, SALGADA);

        // Exibir informações iniciais do peixe
        System.out.println("Informações iniciais do Peixe:");
        System.out.println(peixe);

        // Testando os métodos setters e getters
        System.out.println("Nome inicial: " + peixe.getNome());
        System.out.println("Idade inicial: " + peixe.getIdade());
        System.out.println("Massa inicial: " + peixe.getMassaEmKg());

        // Alterando e exibindo valores
        peixe.setNome("Peixe Tropical");
        peixe.setIdade(4);
        peixe.setMassaEmKg(0.30f);

        System.out.println("Após alterar atributos:");
        System.out.println("Nome: " + peixe.getNome());
        System.out.println("Idade: " + peixe.getIdade());
        System.out.println("Massa: " + peixe.getMassaEmKg());

        // Testando o metodo comer
        peixe.comer(0.01f);
        System.out.println("Após comer:");
        System.out.println(peixe);

        // Testando o metodo mover (nadar)
        peixe.moverse(20.0f);
        System.out.println("Após se mover (nadar):");
        System.out.println(peixe);

        // Testando o metodo dormir
        peixe.dormir(6);
        System.out.println("Após dormir:");
        System.out.println(peixe);

        // Testando o metodo nadar
        peixe.nadar(15.0f);
        System.out.println("Após nadar:");
        System.out.println(peixe);

        // Exibir informações finais do peixe
        System.out.println("Informações finais do Peixe:");
        System.out.println(peixe);

        System.out.println("----------------------------------------------------------------------");

        // Criação de um objeto Cachorro
        Cachorro cachorro = new Cachorro(HabitatTerrestre.URBANO, "Rex", 5, 4, 15.0f, 30.0f);

        // Exibir informações iniciais do cachorro
        System.out.println("Informações iniciais do Cachorro:");
        System.out.println(cachorro);

        // Testando os métodos setters e getters
        System.out.println("Nome inicial: " + cachorro.getNome());
        System.out.println("Idade inicial: " + cachorro.getIdade());
        System.out.println("Massa inicial: " + cachorro.getMassaEmKg());

        // Alterando e exibindo valores
        cachorro.setNome("Max");
        cachorro.setIdade(6);
        cachorro.setMassaEmKg(35.0f);

        System.out.println("Após alterar atributos:");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Idade: " + cachorro.getIdade());
        System.out.println("Massa: " + cachorro.getMassaEmKg());

        // Testando o metodo comer
        cachorro.comer(0.5f);
        System.out.println("Após comer:");
        System.out.println(cachorro);

        // Testando o metodo mover (correr ou caminhar)
        cachorro.moverse(100.0f);
        System.out.println("Após se mover:");
        System.out.println(cachorro);

        // Testando o metodo dormir
        cachorro.dormir(8);
        System.out.println("Após dormir:");
        System.out.println(cachorro);

        // Exibir informações finais do cachorro
        System.out.println("Informações finais do Cachorro:");
        System.out.println(cachorro);

        System.out.println("----------------------------------------------------------------------");

        // Criação de um objeto Elefante
        Elefante elefante = new Elefante(SAVANAS, "Dumbo", 10, 4, 25.0f, 5000.0f);

        // Exibir informações iniciais do elefante
        System.out.println("Informações iniciais do Elefante:");
        System.out.println(elefante);

        // Testando os métodos setters e getters
        System.out.println("Nome inicial: " + elefante.getNome());
        System.out.println("Idade inicial: " + elefante.getIdade());
        System.out.println("Massa inicial: " + elefante.getMassaEmKg());

        // Alterando e exibindo valores
        elefante.setNome("Dumbo Junior");
        elefante.setIdade(12);
        elefante.setMassaEmKg(5500.0f);

        System.out.println("Após alterar atributos:");
        System.out.println("Nome: " + elefante.getNome());
        System.out.println("Idade: " + elefante.getIdade());
        System.out.println("Massa: " + elefante.getMassaEmKg());

        // Testando o metodo comer
        elefante.comer(150.0f);
        System.out.println("Após comer:");
        System.out.println(elefante);

        // Testando o metodo mover
        elefante.moverse(200.0f);
        System.out.println("Após se mover:");
        System.out.println(elefante);

        // Testando o metodo dormir
        elefante.dormir(5);
        System.out.println("Após dormir:");
        System.out.println(elefante);

        // Exibir informações finais do elefante
        System.out.println("Informações finais do Elefante:");
        System.out.println(elefante);

        System.out.println("----------------------------------------------------------------------");

        // Criação de um objeto Gato
        Gato gato = new Gato(HabitatTerrestre.URBANO, "Mingau", 3, 4, 48.0f, 4.5f);

        // Exibir informações iniciais do gato
        System.out.println("Informações iniciais do Gato:");
        System.out.println(gato);

        // Testando os métodos setters e getters
        System.out.println("Nome inicial: " + gato.getNome());
        System.out.println("Idade inicial: " + gato.getIdade());
        System.out.println("Massa inicial: " + gato.getMassaEmKg());

        // Alterando e exibindo valores
        gato.setNome("Whiskers");
        gato.setIdade(4);
        gato.setMassaEmKg(5.0f);

        System.out.println("Após alterar atributos:");
        System.out.println("Nome: " + gato.getNome());
        System.out.println("Idade: " + gato.getIdade());
        System.out.println("Massa: " + gato.getMassaEmKg());

        // Testando o metodo comer
        gato.comer(0.1f);
        System.out.println("Após comer:");
        System.out.println(gato);

        // Testando o metodo mover
        gato.moverse(20.0f);
        System.out.println("Após se mover:");
        System.out.println(gato);

        // Testando o metodo dormir
        gato.dormir(8);
        System.out.println("Após dormir:");
        System.out.println(gato);

        // Exibir informações finais do gato
        System.out.println("Informações finais do Gato:");
        System.out.println(gato);

        System.out.println("----------------------------------------------------------------------");

        // Criação de um objeto Leao
        Leao leao = new Leao(SAVANAS, "Simba", 5, 4, 80.0f, 190.0f);

        // Exibir informações iniciais do leão
        System.out.println("Informações iniciais do Leão:");
        System.out.println(leao);

        // Testando os métodos setters e getters
        System.out.println("Nome inicial: " + leao.getNome());
        System.out.println("Idade inicial: " + leao.getIdade());
        System.out.println("Massa inicial: " + leao.getMassaEmKg());

        // Alterando e exibindo valores
        leao.setNome("Mufasa");
        leao.setIdade(6);
        leao.setMassaEmKg(200.0f);

        System.out.println("Após alterar atributos:");
        System.out.println("Nome: " + leao.getNome());
        System.out.println("Idade: " + leao.getIdade());
        System.out.println("Massa: " + leao.getMassaEmKg());

        // Testando o metodo comer
        leao.comer(5.0f);
        System.out.println("Após comer:");
        System.out.println(leao);

        // Testando o metodo mover
        leao.moverse(100.0f);
        System.out.println("Após se mover:");
        System.out.println(leao);

        // Testando o metodo dormir
        leao.dormir(10);
        System.out.println("Após dormir:");
        System.out.println(leao);

        // Exibir informações finais do leão
        System.out.println("Informações finais do Leão:");
        System.out.println(leao);

    }
}

