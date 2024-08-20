package animais_terrestres;

import classes_abstratas.AnimalTerresteAB;
import enums.habitats.HabitatTerrestre;

import static enums.tipoAnimal.AnimalTerreste.LEAO;

public class Leao extends AnimalTerresteAB {

    public Leao(HabitatTerrestre habitatTerrestre,
                float comidaIngerida,
                float distanciaPercorrida,
                int horasDormidas) {

        super(habitatTerrestre,
                comidaIngerida,
                distanciaPercorrida,
                horasDormidas);

        this.animalTerreste = LEAO;
    }

    public Leao(HabitatTerrestre habitatTerrestre,
                String nome,
                int idade,
                int qtdMembros,
                float velocidadeMaxima,
                float comidaIngerida,
                float distanciaPercorrida,
                int horasDormidas) {

        super(habitatTerrestre,
                nome,
                idade,
                qtdMembros,
                velocidadeMaxima,
                comidaIngerida,
                distanciaPercorrida,
                horasDormidas);

        this.animalTerreste = LEAO;
    }

    @Override
    public void comer(float quantidade) {
        super.comer(quantidade);
        System.out.println("Leão comendo...");
    }

    @Override
    public void moverse(float distancia) {
        super.moverse(distancia);
        System.out.println("Leão se movendo...");
    }

    @Override
    public void dormir(int horas) {
        super.dormir(horas);
        System.out.println("Leão dormindo...");
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"nome\": \"" + getNome() + "\",\n" +
                "  \"animalTerreste\": \"" + animalTerreste + "\",\n" +
                "  \"habitatTerrestre\": \"" + getHabitatTerrestre() + "\",\n" +
                "  \"idade\": " + getIdade() + ",\n" +
                "  \"qtdMembros\": " + getQtdMembros() + ",\n" +
                "  \"velocidadeMaxima\": " + getVelocidadeMaxima() + ",\n" +
                "  \"comidaIngerida\": " + getComidaIngerida() + ",\n" +
                "  \"distanciaPercorrida\": " + getDistanciaPercorrida() + ",\n" +
                "  \"horasDormidas\": " + getHorasDormidas() + "\n" +
                "}";
    }
}
