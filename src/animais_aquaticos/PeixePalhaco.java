package animais_aquaticos;

import classes_abstratas.AnimalAquaticoAB;
import enums.habitats.HabitatAquatico;

import static enums.tipoAnimal.AnimalAquatico.PEIXE_PALHACO;

public class PeixePalhaco extends AnimalAquaticoAB {

    public PeixePalhaco(HabitatAquatico habitatAquatico,
                        String nome,
                        int idade,
                        int profundidadeMaxima,
                        int comidaIngerida,
                        int distanciaPercorrida,
                        int horasDormidas) {
        super(habitatAquatico,
                nome,
                idade,
                profundidadeMaxima,
                comidaIngerida,
                distanciaPercorrida,
                horasDormidas);

        animalAquatico = PEIXE_PALHACO;
    }

    public PeixePalhaco(HabitatAquatico habitatAquatico,
                        int comidaIngerida,
                        int distanciaPercorrida,
                        int horasDormidas) {
        super(habitatAquatico,
                comidaIngerida,
                distanciaPercorrida,
                horasDormidas);

        animalAquatico = PEIXE_PALHACO;
    }

    @Override
    public void comer(float quantidade) {
        super.comer(quantidade);
        System.out.println("Peixe-palhaço comendo...");
    }

    @Override
    public void moverse(float distancia) {
        super.moverse(distancia);
        System.out.println("Peixe-palhaço se movendo...");
    }

    @Override
    public void dormir(int horas) {
        super.dormir(horas);
        System.out.println("Peixe-palhaço dormindo...");
    }

    @Override
    public String toString() {
        return "{" +
                "\"animalAquatico\":\"" + animalAquatico + "\"," +
                "\"habitatAquatico\":\"" + habitatAquatico + "\"," +
                "\"nome\":\"" + nome + "\"," +
                "\"idade\":" + idade + "," +
                "\"profundidadeMaxima\":" + profundidadeMaxima + "," +
                "\"comidaIngerida\":" + comidaIngerida + "," +
                "\"distanciaPercorrida\":" + distanciaPercorrida + "," +
                "\"horasDormidas\":" + horasDormidas +
                '}';
    }
}
