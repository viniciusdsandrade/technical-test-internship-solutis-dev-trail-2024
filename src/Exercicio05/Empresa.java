package Exercicio05;

/*
Resolva a seguinte situação utilizando os conceitos aprendidos.
Uma empresa quer manter o registro da vida acadêmica de todos os funcionários,
o modelo deve contemplar o registro das seguintes informações, de forma incremental:
     Para o funcionário que não estudou, apenas o nome e o código funcional;
     Para o funcionário que concluiu o ensino básico, a escola;
     Para o funcionário que concluiu o ensino médio, a escola;
     Para o funcionário que concluiu a graduação, a Universidade;
 */

public class Empresa {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 1, NIVEL_ACADEMICO.SEM_ESTUDO, "");
        Funcionario funcionario2 = new Funcionario("Pedro", 2, NIVEL_ACADEMICO.ENSINO_FUNDAMENTAL_1, "Escola A");
        Funcionario funcionario3 = new Funcionario("Maria", 2, NIVEL_ACADEMICO.ENSINO_FUNDAMENTAL_2, "Escola A");
        Funcionario funcionario4 = new Funcionario("José", 3, NIVEL_ACADEMICO.ENSINO_MEDIO, "Escola B");
        Funcionario funcionario5 = new Funcionario("Ana", 4, NIVEL_ACADEMICO.ENSINO_SUPERIOR, "Universidade C");

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
        System.out.println(funcionario5);
    }
}
