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

    public void setQtdMembros(int qtdMembros) {
        if (qtdMembros < 0) throw new IllegalArgumentException("A quantidade de membros não pode ser negativa");
        this.qtdMembros = qtdMembros;
    }

    public AnimalTerreste getAnimalTerreste() {
        return animalTerreste;
    }

    public void setAnimalTerreste(AnimalTerreste animalTerreste) {
        this.animalTerreste = animalTerreste;
    }

    public HabitatTerrestre getHabitatTerrestre() {
        return habitatTerrestre;
    }

    public void setHabitatTerrestre(HabitatTerrestre habitatTerrestre) {
        this.habitatTerrestre = habitatTerrestre;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
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
        int result = animalTerreste.hashCode();
        result = 31 * result + habitatTerrestre.hashCode();
        result = 31 * result + nome.hashCode();
        result = 31 * result + idade;
        result = 31 * result + Float.hashCode(comidaIngerida);
        result = 31 * result + Float.hashCode(distanciaPercorrida);
        result = 31 * result + horasDormidas;
        result = 31 * result + Float.hashCode(massaEmKg);
        result = 31 * result + qtdMembros;
        result = 31 * result + Float.hashCode(velocidadeMaxima);
        return result;
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
