package classes_abstratas;

import enums.habitats.HabitatAquatico;
import enums.tipoAnimal.AnimalAquatico;

import java.util.Objects;

public abstract class AnimalAquaticoAB implements AnimalIF {

    protected AnimalAquatico animalAquatico;
    protected HabitatAquatico habitatAquatico;
    protected String nome;
    protected int idade;
    protected float profundidadeMaxima;
    protected float comidaIngerida;
    protected float distanciaPercorrida;
    protected int horasDormidas;

    public AnimalAquaticoAB() {
    }

    public AnimalAquaticoAB(HabitatAquatico habitatAquatico,
                            String nome,
                            int idade,
                            float profundidadeMaxima,
                            float comidaIngerida,
                            float distanciaPercorrida,
                            int horasDormidas) {
        this.habitatAquatico = habitatAquatico;
        this.nome = nome;
        this.idade = idade;
        this.profundidadeMaxima = profundidadeMaxima;
        this.comidaIngerida = comidaIngerida;
        this.distanciaPercorrida = distanciaPercorrida;
        this.horasDormidas = horasDormidas;
    }

    public AnimalAquaticoAB(HabitatAquatico habitatAquatico,
                            float comidaIngerida,
                            float distanciaPercorrida,
                            int horasDormidas) {
        this.habitatAquatico = habitatAquatico;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfundidadeMaxima(int profundidadeMaxima) {
        this.profundidadeMaxima = profundidadeMaxima;
    }

    public int getIdade() {
        return idade;
    }

    public AnimalAquatico getAnimalAquatico() {
        return animalAquatico;
    }

    public HabitatAquatico getHabitatAquatico() {
        return habitatAquatico;
    }

    public String getNome() {
        return nome;
    }

    public float getComidaIngerida() {
        return comidaIngerida;
    }

    public float getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    public float getProfundidadeMaxima() {
        return profundidadeMaxima;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof AnimalAquaticoAB that)) return false;

        return Objects.equals(this.animalAquatico, that.animalAquatico) &&
                Objects.equals(this.habitatAquatico, that.habitatAquatico) &&
                String.valueOf(this.nome).equals(that.nome) &&
                this.idade == that.idade &&
                Objects.equals(this.profundidadeMaxima, that.profundidadeMaxima) &&
                Objects.equals(this.comidaIngerida, that.comidaIngerida) &&
                Objects.equals(this.distanciaPercorrida, that.distanciaPercorrida) &&
                this.horasDormidas == that.horasDormidas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 1;

        hash *= prime + ((nome == null) ? 0 : nome.hashCode());
        hash *= prime + ((animalAquatico == null) ? 0 : animalAquatico.hashCode());
        hash *= prime + ((habitatAquatico == null) ? 0 : habitatAquatico.hashCode());
        hash *= prime + ((idade == 0) ? 0 : idade);
        hash *= prime + ((profundidadeMaxima == 0) ? 0 : Float.floatToIntBits(profundidadeMaxima));
        hash *= prime + ((comidaIngerida == 0) ? 0 : Float.floatToIntBits(comidaIngerida));
        hash *= prime + ((distanciaPercorrida == 0) ? 0 : Float.floatToIntBits(distanciaPercorrida));
        hash *= prime + ((horasDormidas == 0) ? 0 : horasDormidas);

        if (hash < 0) hash = -hash;

        return hash;
    }

    @Override
    public String toString() {
        return "{" +
                "\"animalAquatico\":\"" + animalAquatico + "\"," +
                "\"habitatAquatico\":\"" + habitatAquatico + "\"," +
                "\"nome\":\"" + nome + "\"," +
                "\"idade\":" + idade + "," +
                "\"profundidadeMaxima\":" + profundidadeMaxima + "," +
                "\"comidaIngerida\":" + comidaIngerida + "," +
                "\"distanciaPercorrida\":" + distanciaPercorrida + "," +
                "\"horasDormidas\":" + horasDormidas +
                "}";
    }
}