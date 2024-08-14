package conjunto_2_estruturas_condicionais;

public class Ponto {

    private double x;
    private double y;

    /**
     * Construtor para criar um ponto com coordenadas especificadas.
     *
     * @param x a coordenada x do ponto
     * @param y a coordenada y do ponto
     */
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Obtém a coordenada x do ponto.
     *
     * @return a coordenada x
     */
    public double getX() {
        return x;
    }

    /**
     * Define a coordenada x do ponto.
     *
     * @param x a nova coordenada x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Obtém a coordenada y do ponto.
     *
     * @return a coordenada y
     */
    public double getY() {
        return y;
    }

    /**
     * Define a coordenada y do ponto.
     *
     * @param y a nova coordenada y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Calcula a distância entre este ponto e outro ponto.
     *
     * @param outro o outro ponto
     * @return a distância entre os dois pontos
     */
    public double calcularDistancia(Ponto outro) {
        double dx = x - outro.x;
        double dy = y - outro.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;

        Ponto ponto = (Ponto) obj;

        return x == ponto.x && y == ponto.y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 1;

        hash *= prime + Double.hashCode(x);
        hash *= prime + Double.hashCode(y);

        if (hash < 0) hash = -hash;

        return hash;
    }

    /**
     * Retorna uma representação em string do ponto.
     *
     * @return uma string representando o ponto
     */
    @Override
    public String toString() {
        return String.format("Ponto(x: %.2f, y: %.2f)", x, y);
    }
}

