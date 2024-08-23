package Exercicio07;

import Exercicio06.Empresa;
import Exercicio06.Funcionario;

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
        Empresa empresa = new Empresa();

        // Adicionar funcionários à empresa
        empresa.adicionarFuncionario(new Funcionario("Funcionário 1", 1234, ENSINO_FUNDAMENTAL_1, "Escola 1", 900));
        empresa.adicionarFuncionario(new Funcionario("Funcionário 2", 1235, ENSINO_FUNDAMENTAL_2, "Escola 2", 950));
        empresa.adicionarFuncionario(new Funcionario("Funcionário 3", 1236, ENSINO_FUNDAMENTAL_1, "Escola 3", 1100));
        empresa.adicionarFuncionario(new Funcionario("Funcionário 4", 1237, ENSINO_FUNDAMENTAL_2, "Escola 4", 1200));

        empresa.adicionarFuncionario(new Funcionario("Funcionário 5", 1238, ENSINO_MEDIO, "Escola 5", 2000));
        empresa.adicionarFuncionario(new Funcionario("Funcionário 6", 1239, ENSINO_MEDIO, "Escola 6", 2100));
        empresa.adicionarFuncionario(new Funcionario("Funcionário 7", 1240, ENSINO_MEDIO, "Escola 7", 2200));
        empresa.adicionarFuncionario(new Funcionario("Funcionário 8", 1241, ENSINO_MEDIO, "Escola 8", 2300));

        empresa.adicionarFuncionario(new Funcionario("Funcionário 9", 1242, ENSINO_SUPERIOR, "Faculdade 1", 3000));
        empresa.adicionarFuncionario(new Funcionario("Funcionário 10", 1243, ENSINO_SUPERIOR, "Faculdade 2", 3100));

        // Calcular e exibir os custos
        double custoTotal = 0;
        double custoBasico = 0;
        double custoMedio = 0;
        double custoSuperior = 0;

        for (Funcionario funcionario : empresa.getFuncionarios()) {
            double renda = funcionario.getRenda();
            custoTotal += renda;

            if (funcionario.getNivelEscolaridade() == ENSINO_FUNDAMENTAL_1 ||
                    funcionario.getNivelEscolaridade() == ENSINO_FUNDAMENTAL_2) {
                custoBasico += renda;
            } else if (funcionario.getNivelEscolaridade() == ENSINO_MEDIO) {
                custoMedio += renda;
            } else if (funcionario.getNivelEscolaridade() == ENSINO_SUPERIOR) {
                custoSuperior += renda;
            }
        }

        System.out.println("Custo total da empresa: R$" + custoTotal);
        System.out.println("Custo total da empresa com funcionários de ensino básico: R$" + custoBasico);
        System.out.println("Custo total da empresa com funcionários de ensino médio: R$" + custoMedio);
        System.out.println("Custo total da empresa com funcionários de nível superior: R$" + custoSuperior);
    }
}
