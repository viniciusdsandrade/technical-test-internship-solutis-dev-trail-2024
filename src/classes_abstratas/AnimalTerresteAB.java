package classes_abstratas;

import enums.habitats.HabitatTerrestre;
import enums.tipoAnimal.AnimalTerreste;

import java.util.Objects;

public abstract class AnimalTerresteAB extends AnimalAB {

    // Enumeradores para a espécie e habitat do animal
    protected AnimalTerreste animalTerreste;
    protected HabitatTerrestre habitatTerrestre;

    // Características comuns a todos os tipos de animais (getters e setters definidos na classe AnimalAB)
    protected String nome;
    protected int idade;
    protected float comidaIngerida;
    protected float distanciaPercorrida;
    protected int horasDormidas;
    protected float massaEmKg;

    // Características específicas dos animais terrestres
    protected int qtdMembros;
    protected float velocidadeMaxima;

    public AnimalTerresteAB() {
    }

    public AnimalTerresteAB(HabitatTerrestre habitatTerrestre,
                            String nome,
                            int idade,
                            int qtdMembros,
                            float velocidadeMaxima,
                            float massaEmKg) {

        this.habitatTerrestre = habitatTerrestre;
        this.nome = nome;
        this.idade = idade;
        this.qtdMembros = qtdMembros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.massaEmKg = massaEmKg;

        this.comidaIngerida = 0.0f;
        this.distanciaPercorrida = 0.0f;
        this.horasDormidas = 0;
    }

    @Override
    public void comer(float quantidade) {
        this.comidaIngerida += quantidade;
    }

    @Override
    public void moverse(float distancia) {
        this.distanciaPercorrida += distancia;
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
    }

    public int getQtdMembros() {
        return qtdMembros;
    }

    public AnimalTerreste getAnimalTerreste() {
        return animalTerreste;
    }

    public HabitatTerrestre getHabitatTerrestre() {
        return habitatTerrestre;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setQtdMembros(int qtdMembros) {
        if (qtdMembros < 0) throw new IllegalArgumentException("A quantidade de membros não pode ser negativa");
        this.qtdMembros = qtdMembros;
    }

    public void setAnimalTerreste(AnimalTerreste animalTerreste) {
        this.animalTerreste = animalTerreste;
    }

    public void setHabitatTerrestre(HabitatTerrestre habitatTerrestre) {
        this.habitatTerrestre = habitatTerrestre;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        if (velocidadeMaxima <= 0) throw new IllegalArgumentException("A velocidade máxima deve ser maior que zero.");
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnimalTerresteAB that)) return false;

        return this.idade == that.idade &&
                Float.compare(this.comidaIngerida, that.comidaIngerida) == 0 &&
                Float.compare(this.distanciaPercorrida, that.distanciaPercorrida) == 0 &&
                this.horasDormidas == that.horasDormidas &&
                Float.compare(this.massaEmKg, that.massaEmKg) == 0 &&
                this.qtdMembros == that.qtdMembros &&
                Float.compare(this.velocidadeMaxima, that.velocidadeMaxima) == 0 &&
                this.animalTerreste == that.animalTerreste &&
                this.habitatTerrestre == that.habitatTerrestre &&
                this.nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = animalTerreste.hashCode();

        hash *= prime + habitatTerrestre.hashCode();
        hash *= prime + nome.hashCode();
        hash *= prime + idade;
        hash *= prime + Float.hashCode(comidaIngerida);
        hash *= prime + Float.hashCode(distanciaPercorrida);
        hash *= prime + horasDormidas;
        hash *= prime + Float.hashCode(massaEmKg);
        hash *= prime + qtdMembros;
        hash *= prime + Float.hashCode(velocidadeMaxima);

        if (hash < 0) hash = -hash;

        return hash;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"animalTerreste\": \"" + animalTerreste + "\",\n" +
                "  \"habitatTerrestre\": \"" + habitatTerrestre + "\",\n" +
                "  \"nome\": \"" + nome + "\",\n" +
                "  \"idade\": " + idade + ",\n" +
                "  \"qtdMembros\": " + qtdMembros + ",\n" +
                "  \"comidaIngerida\": \"" + comidaIngerida + "\",\n" +
                "  \"distanciaPercorrida\": " + distanciaPercorrida + ",\n" +
                "  \"horasDormidas\": " + horasDormidas + "\n" +
                "}";
    }
}
