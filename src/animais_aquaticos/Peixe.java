package animais_aquaticos;

import classes_abstratas.AnimalMarinhoAB;
import enums.habitats.HabitatAquatico;
import enums.tipoAgua.Agua;

import static enums.tipoAnimal.AnimalAquatico.PEIXE;

public class Peixe extends AnimalMarinhoAB {

    public Peixe(HabitatAquatico habitatAquatico,
                 String nome,
                 int idade,
                 float profundidadeMaxima,
                 float massaEmKg,
                 Agua agua) {

        super(habitatAquatico,
                nome,
                idade,
                profundidadeMaxima,
                massaEmKg,
                agua);

        this.animalAquatico = PEIXE;
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
    public void nadar(float distancia) {
        this.distanciaPercorrida += distancia;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"animalAquatico\": \"" + animalAquatico + "\",\n" +
                "  \"habitatAquatico\": \"" + habitatAquatico + "\",\n" +
                "  \"nome\": \"" + nome + "\",\n" +
                "  \"idade\": " + idade + ",\n" +
                "  \"profundidadeMaxima\": " + profundidadeMaxima + ",\n" +
                "  \"comidaIngerida\": " + comidaIngerida + ",\n" +
                "  \"distanciaPercorrida\": " + distanciaPercorrida + ",\n" +
                "  \"horasDormidas\": " + horasDormidas + "\n" +
                " \"agua\": \"" + agua + "\"\n" +
                "}\n";
    }
}
