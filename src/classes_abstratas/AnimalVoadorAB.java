package classes_abstratas;

import enums.habitats.HabitatsAereos;
import enums.tipoAnimal.AnimalAereo;

import java.util.Objects;

public abstract class AnimalVoadorAB extends AnimalAB {

    // Enumeradores para a espécie e habitat do animal
    protected AnimalAereo animalAereo;
    protected HabitatsAereos habitatAereo;

    // Características específicas dos animais voadores
    protected float velocidadeMaxima;
    protected float envergadura;
    protected float altitudeMaxima;

    // Características comuns a todos os tipos de animais (getters e setters definidos na classe AnimalAB)
    protected String nome;
    protected int idade;
    protected float comidaIngerida;
    protected float distanciaPercorrida;
    protected int horasDormidas;
    protected float massaEmKg;

    public AnimalVoadorAB() {
    }

    public AnimalVoadorAB(HabitatsAereos habitatAereo,
                          String nome,
                          int idade,
                          float velocidadeMaxima,
                          float envergadura,
                          float altitudeMaxima,
                          float massaEmKg) {

        this.habitatAereo = habitatAereo;
        this.nome = nome;
        this.idade = idade;
        this.velocidadeMaxima = velocidadeMaxima;
        this.envergadura = envergadura;
        this.altitudeMaxima = altitudeMaxima;
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
    public void dormir(int horas) {
        this.horasDormidas += horas;
    }

    public abstract void voar(float distancia);

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public float getAltitudeMaxima() {
        return altitudeMaxima;
    }
    public float getEnvergadura() {
        return envergadura;
    }
    public HabitatsAereos getHabitatAereo() {
        return habitatAereo;
    }
    public AnimalAereo getAnimalAereo() {
        return animalAereo;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        if (velocidadeMaxima <= 0) throw new IllegalArgumentException("A velocidade máxima deve ser positiva.");
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void setAltitudeMaxima(float altitudeMaxima) {
        if (altitudeMaxima <= 0) throw new IllegalArgumentException("A altitude máxima deve ser positiva.");
        this.altitudeMaxima = altitudeMaxima;
    }
    public void setEnvergadura(float envergadura) {
        if (envergadura <= 0) throw new IllegalArgumentException("A envergadura deve ser positiva.");
        this.envergadura = envergadura;
    }
    public void setHabitatAereo(HabitatsAereos habitatAereo) {
        this.habitatAereo = habitatAereo;
    }
    public void setAnimalAereo(AnimalAereo animalAereo) {
        this.animalAereo = animalAereo;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnimalVoadorAB that)) return false;

        return this.idade == that.idade &&
                Float.compare(this.comidaIngerida, that.comidaIngerida) == 0 &&
                Float.compare(this.distanciaPercorrida, that.distanciaPercorrida) == 0 &&
                this.horasDormidas == that.horasDormidas &&
                Float.compare(this.massaEmKg, that.massaEmKg) == 0 &&
                Float.compare(this.velocidadeMaxima, that.velocidadeMaxima) == 0 &&
                Float.compare(this.envergadura, that.envergadura) == 0 &&
                Float.compare(this.altitudeMaxima, that.altitudeMaxima) == 0 &&
                this.animalAereo == that.animalAereo &&
                this.habitatAereo == that.habitatAereo &&
                this.nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = animalAereo.hashCode();

        hash *= prime + habitatAereo.hashCode();
        hash *= prime + nome.hashCode();
        hash *= prime + idade;
        hash *= prime + Float.hashCode(comidaIngerida);
        hash *= prime + Float.hashCode(distanciaPercorrida);
        hash *= prime + horasDormidas;
        hash *= prime + Float.hashCode(massaEmKg);
        hash *= prime + Float.hashCode(velocidadeMaxima);
        hash *= prime + Float.hashCode(envergadura);
        hash *= prime + Float.hashCode(altitudeMaxima);

        if (hash < 0) hash = -hash;

        return hash;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"nome\": \"" + nome + "\",\n" +
                "  \"animalAereo\": \"" + animalAereo + "\",\n" +
                "  \"habitatAereo\": \"" + habitatAereo + "\",\n" +
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