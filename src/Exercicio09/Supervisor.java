package Exercicio09;

public class Supervisor extends Funcionario implements Comissao {

    private static final double ADICIONAL_SUPERVISOR = 600.00;

    public Supervisor() {
    }

    public Supervisor(String nome,
                      int codigoFuncional,
                      NIVEL_ACADEMICO nivelEscolaridade,
                      String nomeInstituicao,
                      double renda) {
        super(nome, codigoFuncional, nivelEscolaridade, nomeInstituicao, renda);
    }

    @Override
    public double getAdicional() {
        return ADICIONAL_SUPERVISOR;
    }
}
