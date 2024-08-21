package Exercicio05;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private NIVEL_ACADEMICO nivelEscolaridade;
    private String nomeInstituicao;

    public Funcionario() {
    }

    public Funcionario(String nome,
                       int codigoFuncional,
                       NIVEL_ACADEMICO nivelEscolaridade,
                       String nomeInstituicao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.nivelEscolaridade = nivelEscolaridade;
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public NIVEL_ACADEMICO getNivelEscolaridade() {
        return nivelEscolaridade;
    }

    public void setNivelEscolaridade(NIVEL_ACADEMICO nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"nome\": \"" + nome + "\",\n" +
                "\"codigoFuncional\": " + codigoFuncional + ",\n" +
                "\"nivelEscolaridade\": \"" + nivelEscolaridade + "\",\n" +
                "\"nomeInstituicao\": \"" + nomeInstituicao + "\"\n" +
                "}\n";
    }
}

