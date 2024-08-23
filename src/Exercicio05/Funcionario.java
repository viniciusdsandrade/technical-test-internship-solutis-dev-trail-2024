package Exercicio05;

/*
Resolva a seguinte situação utilizando os conceitos aprendidos.
Uma empresa quer manter o registro da vida acadêmica de todos os funcionários,
o modelo deve contemplar o registro das seguintes informações, de forma incremental:
     Para o funcionário que não estudou, apenas o nome e o código funcional;
     Para o funcionário que concluiu o ensino básico, a escola;
     Para o funcionário que concluiu o ensino médio, a escola;
     Para o funcionário que concluiu a graduação, a Universidade;
 */
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

        if (nivelEscolaridade == NIVEL_ACADEMICO.SEM_ESTUDO) {
            this.nomeInstituicao = "";
        } else {
            this.nomeInstituicao = nomeInstituicao;
        }
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;

        Funcionario that = (Funcionario) o;

        return codigoFuncional == that.codigoFuncional &&
                nome.equals(that.nome) &&
                nivelEscolaridade == that.nivelEscolaridade &&
                nomeInstituicao.equals(that.nomeInstituicao);
    }

    @Override
    public int hashCode() {
        int hash = nome.hashCode();
        final int prime = 31;

        hash *= prime * hash + codigoFuncional;
        hash *= prime * hash + nivelEscolaridade.hashCode();
        hash *= prime * hash + nomeInstituicao.hashCode();

        if (hash < 0) hash = -hash;

        return hash;
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

