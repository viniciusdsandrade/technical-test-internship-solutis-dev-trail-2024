package classes_abstratas;

import enums.habitats.HabitatAquatico;
import enums.tipoAgua.Agua;
import enums.tipoAnimal.AnimalAquatico;

import java.util.Objects;

public abstract class AnimalMarinhoAB extends AnimalAB {

    // Enumeradores para a espécie e habitat do animal
    protected AnimalAquatico animalAquatico;
    protected HabitatAquatico habitatAquatico;

    // Características comuns a todos os tipos de animais (getters e setters definidos na classe AnimalAB)
    protected String nome;
    protected int idade;
    protected float comidaIngerida;
    protected float distanciaPercorrida;
    protected int horasDormidas;
    protected float massaEmKg;

    // Características específicas dos animais marinhos
    protected float profundidadeMaxima;
    protected Agua agua;

    public AnimalMarinhoAB() {
    }

    public AnimalMarinhoAB(HabitatAquatico habitatAquatico,
                           String nome,
                           int idade,
                           float profundidadeMaxima,
                           float massaEmKg,
                           Agua agua) {

        this.habitatAquatico = habitatAquatico;
        this.nome = nome;
        this.idade = idade;
        this.profundidadeMaxima = profundidadeMaxima;
        this.massaEmKg = massaEmKg;
        this.agua = agua;

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

    public abstract void nadar(float distancia);

    public HabitatAquatico getHabitatAquatico() {
        return habitatAquatico;
    }
    public AnimalAquatico getAnimalAquatico() {
        return animalAquatico;
    }
    public float getProfundidadeMaxima() {
        return profundidadeMaxima;
    }
    public Agua getAgua() {
        return agua;
    }

    public void setHabitatAquatico(HabitatAquatico habitatAquatico) {
        this.habitatAquatico = habitatAquatico;
    }
    public void setProfundidadeMaxima(float profundidadeMaxima) {
        if (profundidadeMaxima <= 0) throw new IllegalArgumentException("Profundidade máxima deve ser maior que zero.");
        this.profundidadeMaxima = profundidadeMaxima;
    }
    public void setAnimalAquatico(AnimalAquatico animalAquatico) {
        this.animalAquatico = animalAquatico;
    }
    public void setAgua(Agua agua) {
        this.agua = agua;
    }


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnimalMarinhoAB that)) return false;

        return idade == that.idade &&
                Float.compare(this.comidaIngerida, that.comidaIngerida) == 0 &&
                Float.compare(this.distanciaPercorrida, that.distanciaPercorrida) == 0 &&
                this.horasDormidas == that.horasDormidas &&
                Float.compare(this.massaEmKg, that.massaEmKg) == 0 &&
                Float.compare(this.profundidadeMaxima, that.profundidadeMaxima) == 0 &&
                this.animalAquatico == that.animalAquatico &&
                this.habitatAquatico == that.habitatAquatico &&
                this.nome.equals(that.nome) &&
                this.agua == that.agua;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = animalAquatico.hashCode();

        hash *= prime + habitatAquatico.hashCode();
        hash *= prime + nome.hashCode();
        hash *= prime + idade;
        hash *= prime + Float.hashCode(comidaIngerida);
        hash *= prime + Float.hashCode(distanciaPercorrida);
        hash *= prime + horasDormidas;
        hash *= prime + Float.hashCode(massaEmKg);
        hash *= prime + Float.hashCode(profundidadeMaxima);
        hash *= prime + agua.hashCode();

        if (hash < 0) hash = -hash;

        return hash;
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
                "}";
    }
}