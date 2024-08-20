package classes_abstratas;

import enums.habitats.HabitatTerrestre;
import enums.tipoAnimal.AnimalTerreste;

import java.util.Objects;

public abstract class AnimalTerresteAB implements AnimalIF {

    protected AnimalTerreste animalTerreste;
    protected HabitatTerrestre habitatTerrestre;
    protected String nome;
    protected int idade;
    protected int qtdMembros;
    protected float velocidadeMaxima;
    protected float comidaIngerida;
    protected float distanciaPercorrida;
    protected int horasDormidas;

    public AnimalTerresteAB() {
    }

    public AnimalTerresteAB(HabitatTerrestre habitatTerrestre,
                            String nome,
                            int idade,
                            int qtdMembros,
                            float velocidadeMaxima,
                            float comidaIngerida,
                            float distanciaPercorrida,
                            int horasDormidas) {

        this.habitatTerrestre = habitatTerrestre;
        this.nome = nome;
        this.idade = idade;
        this.qtdMembros = qtdMembros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.comidaIngerida = comidaIngerida;
        this.distanciaPercorrida = distanciaPercorrida;
        this.horasDormidas = horasDormidas;
    }

    public AnimalTerresteAB(HabitatTerrestre habitatTerrestre,
                            float comidaIngerida,
                            float distanciaPercorrida,
                            int horasDormidas) {
        this.habitatTerrestre = habitatTerrestre;
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

    public int getIdade() {
        return idade;
    }

    public AnimalTerreste getAnimalTerreste() {
        return animalTerreste;
    }

    public HabitatTerrestre getHabitatTerrestre() {
        return habitatTerrestre;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdMembros() {
        return qtdMembros;
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

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setQtdMembros(int qtdMembros) {
        this.qtdMembros = qtdMembros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof AnimalTerresteAB that)) return false;

        return Objects.equals(this.animalTerreste, that.animalTerreste) &&
                Objects.equals(this.habitatTerrestre, that.habitatTerrestre) &&
                String.valueOf(this.nome).equals(that.nome) &&
                this.idade == that.idade &&
                this.qtdMembros == that.qtdMembros &&
                Float.compare(that.velocidadeMaxima, this.velocidadeMaxima) == 0 &&
                Float.compare(that.comidaIngerida, this.comidaIngerida) == 0 &&
                Float.compare(that.distanciaPercorrida, this.distanciaPercorrida) == 0 &&
                this.horasDormidas == that.horasDormidas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 1;

        hash *= prime + ((nome == null) ? 0 : nome.hashCode());
        hash *= prime + ((animalTerreste == null) ? 0 : animalTerreste.hashCode());
        hash *= prime + ((habitatTerrestre == null) ? 0 : habitatTerrestre.hashCode());
        hash *= prime + ((idade == 0) ? 0 : idade);
        hash *= prime + ((qtdMembros == 0) ? 0 : qtdMembros);
        hash *= prime + ((velocidadeMaxima == 0) ? 0 : Float.floatToIntBits(velocidadeMaxima));
        hash *= prime + ((comidaIngerida == 0) ? 0 : Float.floatToIntBits(comidaIngerida));
        hash *= prime + ((distanciaPercorrida == 0) ? 0 : Float.floatToIntBits(distanciaPercorrida));
        hash *= prime + ((horasDormidas == 0) ? 0 : horasDormidas);

        if (hash < 0) hash = -hash;

        return hash;
    }

    @Override
    public String toString() {
        return "{" +
                "\"animalTerreste\":\"" + animalTerreste + "\"," +
                "\"habitatTerrestre\":\"" + habitatTerrestre + "\"," +
                "\"nome\":\"" + nome + "\"," +
                "\"idade\":" + idade + "," +
                "\"qtdMembros\":" + qtdMembros + "," +
                "\"comidaIngerida\":\"" + comidaIngerida + "\"," +
                "\"distanciaPercorrida\":" + distanciaPercorrida + "," +
                "\"horasDormidas\":" + horasDormidas +
                "}";
    }
}
