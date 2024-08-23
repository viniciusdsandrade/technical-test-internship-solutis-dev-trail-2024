package classes_abstratas;

/*
    4. Crie uma classe Peixe e Pombo.
    De quem vamos herdar? Um peixe nada e um pombo voa então os métodos 'nadar' e 'voar' devem estar na classe abstrata Animal?
    Não. Então criem uma classe abstrata AnimalMarinhoAB, AnimalVoadorAB, AnimalTerrestreAB que implementa a classe abstrata AnimalAB
    para representar a classe abstrata para animais marinhos e aéreos “que voam”.
 */

public abstract class AnimalAB implements AnimalIF {

    protected String nome;
    protected int idade;
    protected float massaEmKg;

    protected float comidaIngerida;
    protected float distanciaPercorrida;
    protected int horasDormidas;

    public AnimalAB() {
    }

    public AnimalAB(String nome,
                    int idade,
                    float massaEmKg) {

        if (nome == null || nome.trim().isEmpty()) throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        if (idade < 0) throw new IllegalArgumentException("Idade não pode ser negativa.");
        if (massaEmKg <= 0) throw new IllegalArgumentException("Massa deve ser maior que zero.");

        this.nome = nome;
        this.idade = idade;
        this.massaEmKg = massaEmKg;

        this.comidaIngerida = 0.0f;
        this.distanciaPercorrida = 0.0f;
        this.horasDormidas = 0;
    }

    @Override
    public void comer(float quantidade) {
        if (quantidade <= 0) throw new IllegalArgumentException("Quantidade de comida deve ser maior que zero.");
        this.comidaIngerida += quantidade;
    }

    @Override
    public void moverse(float distancia) {
        if (distancia <= 0) throw new IllegalArgumentException("Distância deve ser maior que zero.");
        this.distanciaPercorrida += distancia;
    }

    @Override
    public void dormir(int horas) {
        if (horas <= 0) throw new IllegalArgumentException("Horas dormidas devem ser maior que zero.");
        this.horasDormidas += horas;
    }

    public float getComidaIngerida() {
        return comidaIngerida;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public float getMassaEmKg() {
        return massaEmKg;
    }
    public float getDistanciaPercorrida() {
        return distanciaPercorrida;
    }
    public int getHorasDormidas() {
        return horasDormidas;
    }

    public void setIdade(int idade) {
        if (idade < 0) throw new IllegalArgumentException("Idade não pode ser negativa.");
        this.idade = idade;
    }
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        this.nome = nome;
    }
    public void setMassaEmKg(float massaEmKg) {
        if (massaEmKg <= 0) throw new IllegalArgumentException("Massa deve ser maior que zero.");
        this.massaEmKg = massaEmKg;
    }
}
