package Exercicio08;

import Exercicio06.Funcionario;
import Exercicio06.NIVEL_ACADEMICO;

public class Gerente extends Funcionario implements Comissao {
    private static final double ADICIONAL = 1500.00;

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
        return ADICIONAL;
    }
}
