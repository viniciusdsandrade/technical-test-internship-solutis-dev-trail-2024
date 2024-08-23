package Exercicio06;

/*
Estenda o modelo implementado no exercício anterior de forma que all funcionário possua uma renda básica de R$ 1000,00 e:
    ■ Com a conclusão do ensino básico a renda total é renda básica acrescentada em 10%;
    ■ Com a conclusão do ensino médio a renda total é a renda do nível anterior acrescentada em 50%;
    ■ Com a conclusão da graduação a renda total é a renda do nível anterior acrescentada em 100%;
 */

/*
Observações:
    Com base no enunciado anterior, assumo que o funcionário para além da renda básica de R$ 1000,00 + eventuais comissões, possua o seu salário base
    definido no momento da criação do objeto Funcionario. A renda total é o somatório da renda básica e do salário base.
 */
public class Funcionario {
    private static final double RENDA_BASICA = 1000.00;

    private String nome;
    private int codigoFuncional;
    private NIVEL_ACADEMICO nivelEscolaridade;
    private String nomeInstituicao;
    private double renda;
    private double rendaBasicaTotal;
    private double rendaTotal;

    public Funcionario() {
    }

    public Funcionario(String nome,
                       int codigoFuncional,
                       NIVEL_ACADEMICO nivelEscolaridade,
                       String nomeInstituicao,
                       double renda) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.nivelEscolaridade = nivelEscolaridade;
        this.nomeInstituicao = nomeInstituicao;
        this.renda = renda;
        this.rendaBasicaTotal = calcularRendaBasicaTotal();
        this.rendaTotal = calcularRendaTotal();
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public NIVEL_ACADEMICO getNivelEscolaridade() {
        return nivelEscolaridade;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public double getRenda() {
        return renda;
    }

    public double getRendaTotal() {
        return rendaTotal;
    }

    public double getRendaBasicaTotal() {
        return rendaBasicaTotal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public void setNivelEscolaridade(NIVEL_ACADEMICO nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public void setRenda(double renda) {
        if (renda < 0) throw new IllegalArgumentException("Renda não pode ser negativa");
        this.renda = renda;
    }

    /*
    Estenda o modelo implementado no exercício anterior de forma que all funcionário possua uma renda básica de R$ 1000,00 e:
        ■ Com a conclusão do ensino básico a renda total é renda básica acrescentada em 10%;
        ■ Com a conclusão do ensino médio a renda total é a renda do nível anterior acrescentada em 50%;
        ■ Com a conclusão da graduação a renda total é a renda do nível anterior acrescentada em 100%;
     */

    public double calcularRendaBasicaTotal() {
        double rendaBasicaTotal = RENDA_BASICA;

        switch (nivelEscolaridade) {
            case ENSINO_FUNDAMENTAL_1, ENSINO_FUNDAMENTAL_2 -> rendaBasicaTotal += RENDA_BASICA * 0.10;
            case ENSINO_MEDIO -> rendaBasicaTotal += RENDA_BASICA * 0.65; // 10% de 50% adicional
            case ENSINO_SUPERIOR -> rendaBasicaTotal += RENDA_BASICA * 2.3; // 10% de 50% de 100% adicional
            default -> {
            }
        }

        return rendaBasicaTotal;
    }

    // O cálculo da renda total envolve a renda do usuario mais o adicional da renda básica
    public double calcularRendaTotal() {
        return this.renda + calcularRendaBasicaTotal();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;

        Funcionario that = (Funcionario) o;

        return codigoFuncional == that.codigoFuncional &&
                Double.compare(renda, that.renda) == 0 &&
                nome.equals(that.nome) &&
                nivelEscolaridade == that.nivelEscolaridade &&
                nomeInstituicao.equals(that.nomeInstituicao);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 1;

        hash *= prime + nome.hashCode();
        hash *= prime + codigoFuncional;
        hash *= prime + nivelEscolaridade.hashCode();
        hash *= prime + nomeInstituicao.hashCode();
        hash *= prime + Double.hashCode(renda);

        if (hash < 0) hash *= -1;

        return hash;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"nome\": \"" + nome + "\",\n" +
                "\"codigoFuncional\": " + codigoFuncional + ",\n" +
                "\"nivelEscolaridade\": \"" + nivelEscolaridade + "\",\n" +
                "\"nomeInstituicao\": \"" + nomeInstituicao + "\",\n" +
                "\"renda\": " + renda + ",\n" +
                "\"rendaBasicaTotal\": " + rendaBasicaTotal + ",\n" +
                "\"rendaTotal\": " + rendaTotal + "\n" +
                "}";
    }
}
