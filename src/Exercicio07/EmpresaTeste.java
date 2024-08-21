package Exercicio07;

import Exercicio06.Funcionario;
import Exercicio06.NIVEL_ACADEMICO;

import static Exercicio06.NIVEL_ACADEMICO.*;

/*
Crie um programa que simule uma empresa com 10 funcionários, utilize um array,
sendo que a escolaridade dos funcionários é distribuída da seguinte forma:
40% ensino básico, 40% ensino médio e 20% nível superior.
Calcule os custos da empresa com salários totais e por nível de escolaridade,
utilize a classe funcionário desenvolvida no exercício anterior.
 */
public class EmpresaTeste {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        double custoTotal = 0;
        double custoBasico = 0;
        double custoMedio = 0;
        double custoSuperior = 0;

        for (int i = 0; i < funcionarios.length; i++) {
            if (i < 4) {
                funcionarios[i] = new Funcionario("Funcionário", 1234, ENSINO_FUNDAMENTAL_1, "Escola 1", 1000);
            } else if (i < 8) {
                funcionarios[i] = new Funcionario("Funcionário", 1234, ENSINO_MEDIO, "Escola 2", 2000);
            } else {
                funcionarios[i] = new Funcionario("Funcionário", 1234, ENSINO_SUPERIOR, "Faculdade 1", 3000);
            }

            custoTotal += funcionarios[i].getRenda();

            if (funcionarios[i].getNivelEscolaridade() == ENSINO_FUNDAMENTAL_1 ||
                    funcionarios[i].getNivelEscolaridade() == ENSINO_FUNDAMENTAL_2) {
                custoBasico += funcionarios[i].getRenda();
            } else if (funcionarios[i].getNivelEscolaridade() == ENSINO_MEDIO) {
                custoMedio += funcionarios[i].getRenda();
            } else {
                custoSuperior += funcionarios[i].getRenda();
            }
        }

        System.out.println("Custo total da empresa: R$" + custoTotal);
        System.out.println("Custo total da empresa com funcionários de ensino básico: R$" + custoBasico);
        System.out.println("Custo total da empresa com funcionários de ensino médio: R$" + custoMedio);
        System.out.println("Custo total da empresa com funcionários de nível superior: R$" + custoSuperior);
    }
}
