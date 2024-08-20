package animais_terrestres;

import classes_abstratas.AnimalTerresteAB;
import enums.habitats.HabitatTerrestre;

import static enums.tipoAnimal.AnimalTerreste.CACHORRO;

public class Cachorro extends AnimalTerresteAB {

    public Cachorro(HabitatTerrestre habitatTerrestre,
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

        this.animalTerreste = CACHORRO;
    }

    // Construtor simplificado
    public Cachorro(HabitatTerrestre habitatTerrestre,
                    float comidaIngerida,
                    float distanciaPercorrida,
                    int horasDormidas) {

        super(habitatTerrestre,
                comidaIngerida,
                distanciaPercorrida,
                horasDormidas);

        this.animalTerreste = CACHORRO;
    }

    @Override
    public void comer(float quantidade) {
        super.comer(quantidade);
        System.out.println("Cachorro comendo...");
    }

    @Override
    public void moverse(float distancia) {
        super.moverse(distancia);
        System.out.println("Cachorro se movendo...");
    }

    @Override
    public void dormir(int horas) {
        super.dormir(horas);
        System.out.println("Cachorro dormindo...");
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
