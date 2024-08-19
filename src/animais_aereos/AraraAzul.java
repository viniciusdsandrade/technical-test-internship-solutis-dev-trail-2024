package animais_aereos;

import classes_abstratas.AnimalAereoAB;
import enums.habitats.HabitatsAereos;
import enums.tipoAnimal.AnimalAereo;

import static enums.tipoAnimal.AnimalAereo.ARARA_AZUL;

public class AraraAzul extends AnimalAereoAB {

    public AraraAzul() {
    }

    public AraraAzul(HabitatsAereos habitatsAereos,
                     String nome,
                     int idade,
                     float velocidadeMaxima,
                     float envergadura,
                     float altitudeMaxima,
                     int comidaIngerida,
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

    public AraraAzul(HabitatsAereos habitatsAereos,
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
        return "{" +
                "\"animalAereo\":\"" + animalAereo + "\"," +
                "\"habitatsAereos\":\"" + habitatAereo + "\"," +
                "\"nome\":\"" + nome + "\"," +
                "\"idade\":" + idade + "," +
                "\"velocidadeMaxima\":" + velocidadeMaxima + "," +
                "\"envergadura\":" + envergadura + "," +
                "\"altitudeMaxima\":" + altitudeMaxima + "," +
                "\"comidaIngerida\":" + comidaIngerida + "," +
                "\"distanciaPercorrida\":" + distanciaPercorrida + "," +
                "\"horasDormidas\":" + horasDormidas +
                '}';
    }
}
