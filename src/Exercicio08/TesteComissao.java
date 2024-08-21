package Exercicio08;

import Exercicio06.Funcionario;

import static Exercicio06.NIVEL_ACADEMICO.ENSINO_MEDIO;
import static Exercicio06.NIVEL_ACADEMICO.ENSINO_SUPERIOR;

/*
    Faça uma hierarquia de Comissões,
    crie as comissões de Gerente, Vendedor e Supervisor.
    Cada uma das comissões fornece um adicional ao salário conforme abaixo:

    Gerente: R$1500,00
    Supervisor: R$600,00
    Vendedor: R$250,00
 */
public class TesteComissao {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Gerente", 1, ENSINO_MEDIO, "Instituicao A", 1000.00);
        Funcionario supervisor = new Supervisor("Supervisor", 2, ENSINO_SUPERIOR, "Instituicao A", 1000.00);
        Funcionario vendedor = new Vendedor("Vendedor", 3, ENSINO_MEDIO, "Instituicao A", 1000.00);

        System.out.println("Gerente: " + gerente.calcularRendaTotal());
        System.out.println("Supervisor: " + supervisor.calcularRendaTotal());
        System.out.println("Vendedor: " + vendedor.calcularRendaTotal());
    }
}
