package animais_aereos;

import classes_abstratas.AnimalVoadorAB;
import enums.habitats.HabitatsAereos;

import static enums.tipoAnimal.AnimalAereo.ARARA_AZUL;

public class Pombo extends AnimalVoadorAB {

    public Pombo(HabitatsAereos habitatsAereos,
                 String nome,
                 int idade,
                 float velocidadeMaxima,
                 float envergadura,
                 float altitudeMaxima,
                 float comidaIngerida,
                 float distanciaPercorrida,
                 int horasDormidas) {

        super(habitatsAereos,
                nome,
                idade,
                velocidadeMaxima,
                envergadura,
                altitudeMaxima,
                comidaIngerida,
                distanciaPercorrida,
                horasDormidas);

        animalAereo = ARARA_AZUL;
    }

    // Construtor simplificado
    public Pombo(HabitatsAereos habitatsAereos,
                 int comidaIngerida,
                 float distanciaPercorrida,
                 int horasDormidas) {

        super(habitatsAereos,
                comidaIngerida,
                distanciaPercorrida,
                horasDormidas);

        animalAereo = ARARA_AZUL;
    }

    @Override
    public void comer(float quantidade) {
        super.comer(quantidade);
        System.out.println("Arara Azul comendo...");
    }

    @Override
    public void moverse(float distancia) {
        super.moverse(distancia);
        System.out.println("Arara Azul voando...");
    }

    @Override
    public void dormir(int horas) {
        super.dormir(horas);
        System.out.println("Arara Azul dormindo...");
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"animalAereo\": \"" + animalAereo + "\",\n" +
                "  \"habitatsAereos\": \"" + habitatAereo + "\",\n" +
                "  \"nome\": \"" + nome + "\",\n" +
                "  \"idade\": " + idade + ",\n" +
                "  \"velocidadeMaxima\": " + velocidadeMaxima + ",\n" +
                "  \"envergadura\": " + envergadura + ",\n" +
                "  \"altitudeMaxima\": " + altitudeMaxima + ",\n" +
                "  \"comidaIngerida\": " + comidaIngerida + ",\n" +
                "  \"distanciaPercorrida\": " + distanciaPercorrida + ",\n" +
                "  \"horasDormidas\": " + horasDormidas + "\n" +
                "}";
    }
}
