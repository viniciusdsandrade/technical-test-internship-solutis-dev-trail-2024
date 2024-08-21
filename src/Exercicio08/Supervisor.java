package Exercicio08;

import Exercicio06.Funcionario;
import Exercicio06.NIVEL_ACADEMICO;

public class Supervisor extends Funcionario implements Comissao {
    private static final double ADICIONAL = 600.00;

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
        return ADICIONAL;
    }
}
