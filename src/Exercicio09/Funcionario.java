package Exercicio09;

/*
    Adicione a classe funcionário um atributo referente as comissões desenvolvidas no exercício anterior.
    Corrija o metodo renda total de forma que ele some ao valor da renda calculada o adicional da comissão do funcionário.
 */
public class Funcionario {
    private static final double RENDA_BASICA = 1000.00;

    private static final double GERENTE_ADICIONAL = 1500.00;
    private static final double SUPERVISOR_ADICIONAL = 600.00;
    private static final double VENDEDOR_ADICIONAL = 250.00;

    private String nome;
    private int codigoFuncional;
    private NIVEL_ACADEMICO nivelEscolaridade;
    private String nomeInstituicao;
    private double renda;
    private double comissao;
    private double rendaBasica;
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
        this.rendaBasica = calcularRendaBasicaTotal();
        this.comissao = calcularComissao();
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

    public double getComissao() {
        return comissao;
    }

    public double getRendaTotal() {
        return rendaTotal;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
    Estenda o modelo implementado no exercício anterior de forma que all funcionário possua uma renda básica de R$ 1000,00 e:
    ■ Com a conclusão do ensino básico a renda total é renda básica acrescentada em 10%;
    ■ Com a conclusão do ensino médio a renda total é a renda do nível anterior acrescentada em 50%;
    ■ Com a conclusão da graduação a renda total é a renda do nível anterior acrescentada em 100%;
     */

    public double calcularRendaBasicaTotal() {
        double rendaBasicaTotal = 0;

        switch (nivelEscolaridade) {
            case ENSINO_FUNDAMENTAL_1, ENSINO_FUNDAMENTAL_2 ->
                    rendaBasicaTotal = RENDA_BASICA + (RENDA_BASICA * 0.10);// 10% em cima de 10%
            case ENSINO_MEDIO -> rendaBasicaTotal = RENDA_BASICA + (RENDA_BASICA * 0.65); // 50% em cima de 10%
            case ENSINO_SUPERIOR ->
                    rendaBasicaTotal = RENDA_BASICA + (RENDA_BASICA * 2.3); // 100% em cima de 50% de 10%
            default -> {
            }
        }

        return rendaBasicaTotal;
    }

    // O cálculo da renda total envolve a renda do usuario mais o adicional da renda básica
    public double calcularRendaTotal() {
        return renda + calcularRendaBasicaTotal() + calcularComissao();
    }

    /*
    Faça uma hierarquia de Comissões,
    crie as comissões de Gerente, Vendedor e Supervisor.
    Cada uma das comissões fornece um adicional ao salário conforme abaixo:

    Gerente: R$1500,00
    Supervisor: R$600,00
    Vendedor: R$250,00
    */

    private double calcularComissao() {
        this.comissao = 0;

        switch (this) {
            case Gerente gerente -> this.comissao = GERENTE_ADICIONAL;
            case Supervisor supervisor -> this.comissao = SUPERVISOR_ADICIONAL;
            case Vendedor vendedor -> this.comissao = VENDEDOR_ADICIONAL;
            default -> {
            }
        }

        return this.comissao;
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
                "\t\"nome\": " + nome + "\",\n" +
                "\t\"codigoFuncional\": " + codigoFuncional + ",\n" +
                "\t\"nivelEscolaridade\":  " + nivelEscolaridade + "\",\n" +
                "\t\"nomeInstituicao\": " + nomeInstituicao + "\",\n" +
                "\t\"renda\": " + renda + ",\n" +
                "\t\"rendaBasica\": " + rendaBasica + ",\n" +
                "\t\"comissao\": " + comissao + ",\n" +
                "\t\"rendaTotal\": " + rendaTotal + "\n" +
                "}\n";
    }
}