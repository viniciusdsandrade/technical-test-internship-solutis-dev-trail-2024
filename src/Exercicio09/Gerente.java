package Exercicio09;

public class Gerente extends Funcionario implements Comissao {

    private static final double SUPERVISOR_ADICIONAL = 600.00;

    public Gerente() {
    }

    public Gerente(String nome,
                   int codigoFuncional,
                   NIVEL_ACADEMICO nivelEscolaridade,
                   String nomeInstituicao,
                   double renda) {
        super(nome, codigoFuncional, nivelEscolaridade, nomeInstituicao, renda);
    }

    @Override
    public double getAdicional() {
        return SUPERVISOR_ADICIONAL;
    }
}
