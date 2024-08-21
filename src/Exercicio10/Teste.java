package Exercicio10;

import Exercicio09.*;

import static Exercicio09.NIVEL_ACADEMICO.ENSINO_SUPERIOR;

/*
    Refaça o exercício 7 considerando que
    10% dos funcionários são Gerentes,
    20% são supervisores e
    70% são vendedores.
 */
public class Teste {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        for (int i = 0; i < funcionarios.length; i++) {
            if (i < 1) {
                funcionarios[i] = new Gerente("Vinícius Andrade", 1, ENSINO_SUPERIOR , "UFSC", 10_000.00);
            } else if (i < 3) {
                funcionarios[i] = new Supervisor("Vinícius Andrade", 1, ENSINO_SUPERIOR , "UFSC", 10_000.00);
            } else {
                funcionarios[i] = new Vendedor("Vinícius Andrade", 1, ENSINO_SUPERIOR , "UFSC", 10_000.00);
            }
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
