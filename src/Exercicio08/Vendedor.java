package Exercicio08;

import Exercicio06.Funcionario;
import Exercicio06.NIVEL_ACADEMICO;

public class Vendedor extends Funcionario implements Comissao {

    private static final double ADICIONAL = 250.00;

    public Vendedor() {
    }

    public Vendedor(String nome,
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
