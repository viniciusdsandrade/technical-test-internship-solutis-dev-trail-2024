package Exercicio06;

import java.util.ArrayList;
import java.util.List;

/*
Estenda o modelo implementado no exercício anterior de forma que all funcionário possua uma renda básica de R$ 1000,00 e:
    ■ Com a conclusão do ensino básico a renda total é renda básica acrescentada em 10%;
    ■ Com a conclusão do ensino médio a renda total é a renda do nível anterior acrescentada em 50%;
    ■ Com a conclusão da graduação a renda total é a renda do nível anterior acrescentada em 100%;
 */

/*
Observações:
    Com base no enunciado anterior, assumo que o funcionário para além da renda básica de R$ 1000,00 + eventuais comissões, possua o seu salário base
    definido no momento da criação do objeto Funcionario. A renda total é o somatório da renda básica e do salário base.
 */

public class Empresa {

    List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa() {
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        switch (funcionario.getNivelEscolaridade()) {
            case SEM_ESTUDO -> funcionarios.add(
                    new Funcionario(
                            funcionario.getNome(),
                            funcionario.getCodigoFuncional(),
                            funcionario.getNivelEscolaridade(),
                            "",
                            funcionario.getRenda()
                    )
            );
            case ENSINO_FUNDAMENTAL_1, ENSINO_FUNDAMENTAL_2,
                 ENSINO_MEDIO, ENSINO_SUPERIOR -> funcionarios.add(
                    new Funcionario(
                            funcionario.getNome(),
                            funcionario.getCodigoFuncional(),
                            funcionario.getNivelEscolaridade(),
                            funcionario.getNomeInstituicao(),
                            funcionario.getRenda()
                    )
            );
            case null, default -> {
            }
        }
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios.toArray(new Funcionario[0]);
    }

    public void listarFuncionarios() {
        funcionarios.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Funcionario funcionario0 = new Funcionario("Carlos", 0, NIVEL_ACADEMICO.ENSINO_SUPERIOR, "Universidade J", 900);
        Funcionario funcionario1 = new Funcionario("João", 1, NIVEL_ACADEMICO.ENSINO_FUNDAMENTAL_1, "Escola D", 1500);
        Funcionario funcionario2 = new Funcionario("Maria", 2, NIVEL_ACADEMICO.ENSINO_FUNDAMENTAL_2, "Escola A", 2000);
        Funcionario funcionario3 = new Funcionario("José", 3, NIVEL_ACADEMICO.ENSINO_MEDIO, "Escola B", 2500);
        Funcionario funcionario4 = new Funcionario("Ana", 4, NIVEL_ACADEMICO.ENSINO_SUPERIOR, "Universidade C", 3000);

        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(funcionario0);
        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(funcionario2);
        empresa.adicionarFuncionario(funcionario3);
        empresa.adicionarFuncionario(funcionario4);

        empresa.listarFuncionarios();
    }


}
