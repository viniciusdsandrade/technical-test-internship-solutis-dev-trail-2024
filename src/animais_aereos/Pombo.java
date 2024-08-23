package animais_aereos;

import classes_abstratas.AnimalVoadorAB;
import enums.habitats.HabitatsAereos;

import static enums.tipoAnimal.AnimalAereo.POMBA;

public class Pombo extends AnimalVoadorAB {

    public Pombo(HabitatsAereos habitatsAereos,
                 String nome,
                 int idade,
                 float velocidadeMaxima,
                 float envergadura,
                 float altitudeMaxima,
                 float massaEmKg) {

        super(habitatsAereos,
                nome,
                idade,
                velocidadeMaxima,
                envergadura,
                altitudeMaxima,
                massaEmKg);

        this.animalAereo = POMBA;
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
    public void voar(float distancia) {
        super.moverse(distancia);
        System.out.println("Arara Azul voando...");
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
                "}\n";
    }
}
