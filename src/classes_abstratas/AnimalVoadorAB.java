package classes_abstratas;

import enums.habitats.HabitatsAereos;
import enums.tipoAnimal.AnimalAereo;

import java.util.Objects;

public abstract class AnimalVoadorAB implements AnimalIF {

    protected HabitatsAereos habitatAereo;
    protected AnimalAereo animalAereo;
    protected String nome;
    protected int idade;
    protected float velocidadeMaxima;
    protected float envergadura;
    protected float altitudeMaxima;
    protected float comidaIngerida;
    protected float distanciaPercorrida;
    protected int horasDormidas;

    public AnimalVoadorAB() {
    }

    public AnimalVoadorAB(HabitatsAereos habitatAereo,
                          String nome,
                          int idade,
                          float velocidadeMaxima,
                          float envergadura,
                          float altitudeMaxima,
                          float comidaIngerida,
                          float distanciaPercorrida,
                          int horasDormidas) {
        this.habitatAereo = habitatAereo;
        this.nome = nome;
        this.idade = idade;
        this.velocidadeMaxima = velocidadeMaxima;
        this.envergadura = envergadura;
        this.altitudeMaxima = altitudeMaxima;
        this.comidaIngerida = comidaIngerida;
        this.distanciaPercorrida = distanciaPercorrida;
        this.horasDormidas = horasDormidas;
    }

    public AnimalVoadorAB(HabitatsAereos habitatAereo,
                          float comidaIngerida,
                          float distanciaPercorrida,
                          int horasDormidas) {
        this.habitatAereo = habitatAereo;
        this.comidaIngerida = comidaIngerida;
        this.distanciaPercorrida = distanciaPercorrida;
        this.horasDormidas = horasDormidas;
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

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnvergadura(int envergadura) {
        this.envergadura = envergadura;
    }

    public void setAltitudeMaxima(int altitudeMaxima) {
        this.altitudeMaxima = altitudeMaxima;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public HabitatsAereos getHabitatAereo() {
        return habitatAereo;
    }

    public AnimalAereo getAnimalAereo() {
        return animalAereo;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public float getEnvergadura() {
        return envergadura;
    }

    public float getComidaIngerida() {
        return comidaIngerida;
    }

    public float getAltitudeMaxima() {
        return altitudeMaxima;
    }

    public float getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof AnimalVoadorAB that)) return false;

        return Objects.equals(this.animalAereo, that.animalAereo) &&
                Objects.equals(this.habitatAereo, that.habitatAereo) &&
                String.valueOf(this.nome).equals(that.nome) &&
                this.idade == that.idade &&
                Float.compare(this.velocidadeMaxima, that.velocidadeMaxima) == 0 &&
                Float.compare(this.envergadura, that.envergadura) == 0 &&
                Float.compare(this.altitudeMaxima, that.altitudeMaxima) == 0 &&
                Float.compare(this.comidaIngerida, that.comidaIngerida) == 0 &&
                Float.compare(this.distanciaPercorrida, that.distanciaPercorrida) == 0 &&
                this.horasDormidas == that.horasDormidas;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 1;

        hash *= prime + ((nome == null) ? 0 : nome.hashCode());
        hash *= prime + ((animalAereo == null) ? 0 : animalAereo.hashCode());
        hash *= prime + ((habitatAereo == null) ? 0 : habitatAereo.hashCode());
        hash *= prime + ((idade == 0) ? 0 : idade);
        hash *= prime + ((velocidadeMaxima == 0) ? 0 : Float.floatToIntBits(velocidadeMaxima));
        hash *= prime + ((envergadura == 0) ? 0 : Float.floatToIntBits(envergadura));
        hash *= prime + ((altitudeMaxima == 0) ? 0 : Float.floatToIntBits(altitudeMaxima));
        hash *= prime + ((comidaIngerida == 0) ? 0 : Float.floatToIntBits(comidaIngerida));
        hash *= prime + ((distanciaPercorrida == 0) ? 0 : Float.floatToIntBits(distanciaPercorrida));
        hash *= prime + ((horasDormidas == 0) ? 0 : horasDormidas);

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