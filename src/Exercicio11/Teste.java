package Exercicio11;

import Exercicio09.Funcionario;

import static Exercicio09.NIVEL_ACADEMICO.*;


/*
    Sobreescreva o metodo toString de forma que ele imprima o nome do
    funcionário, a comissão e o salário total.
    Imprima todos os funcionários da empresa criada no exercício 7.
 */

public class Teste {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < funcionarios.length; i++) {
            if (i < 4) {
                funcionarios[i] = new Funcionario("Funcionário", 1234, ENSINO_FUNDAMENTAL_1, "Escola 1", 1000);
            } else if (i < 8) {
                funcionarios[i] = new Funcionario("Funcionário", 1234, ENSINO_MEDIO, "Escola 2", 2000);
            } else {
                funcionarios[i] = new Funcionario("Funcionário", 1234, ENSINO_SUPERIOR, "Faculdade 1", 3000);
            }
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
