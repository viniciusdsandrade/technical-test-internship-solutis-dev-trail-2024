package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.getDouble;

public class Exercicio_29 {

    /*
    29. Receba do usuário dois pontos do plano cartesiano.
    Estes pontos devem representar os
    vértices superior esquerdo e inferior direito de um retângulo paralelo aos eixos x e y.

    Primeiramente informe se estes pontos podem constituir um retângulo, ou seja:
    - se é um retângulo
    - se é uma reta horizontal
    - se é uma reta vertical
    - se é um ponto
    Depois, calcule e exiba área deste retângulo.

    Em seguida, receba outro ponto e exiba a posição dele em relação ao retângulo.

    Uma das 10 seguintes situações é possível:
    - acima e à esquerda
    - acima
    - acima e à direita
    - embaixo e à esquerda
    - embaixo
    - embaixo e à direita
    - à esquerda
    - à direita
    - dentro do retângulo
    - na linha do retângulo
     */

    public static void main(String[] args) {
        System.out.println("Exercício 29");
        Scanner entrada = new Scanner(System.in);

        double x1, y1, x2, y2, x3, y3;

        System.out.println("Digite as coordenadas do primeiro ponto:");
        System.out.print("x1: ");
        x1 = getDouble(entrada);

        System.out.print("y1: ");
        y1 = getDouble(entrada);

        System.out.println("Digite as coordenadas do segundo ponto:");
        System.out.print("x2: ");
        x2 = getDouble(entrada);

        System.out.print("y2: ");
        y2 = getDouble(entrada);

        Ponto verticeSuperiorEsquerdo = new Ponto(x1, y1);
        Ponto verticeInferiorDireito = new Ponto(x2, y2);

        // Verifica o tipo de forma geométrica
        String tipoForma = verificarTipoForma(verticeSuperiorEsquerdo, verticeInferiorDireito);
        System.out.println(tipoForma);

        // Calcula a área se for um retângulo
        if (tipoForma.equals("É um retângulo.")) {
            double area = calcularAreaRetangulo(verticeSuperiorEsquerdo, verticeInferiorDireito);
            System.out.println("Área do retângulo: " + area);
        }

        System.out.println("Digite as coordenadas de um ponto para verificar a posição em relação ao retângulo:");
        System.out.print("x3: ");
        x3 = getDouble(entrada);

        System.out.print("y3: ");
        y3 = getDouble(entrada);

        Ponto ponto = new Ponto(x3, y3);

        // Verifica a posição do ponto em relação ao retângulo
        String posicaoPonto = verificarPosicaoPonto(verticeSuperiorEsquerdo, verticeInferiorDireito, ponto);
        System.out.println(posicaoPonto);

        entrada.close();
    }

    // Função para verificar a posição do ponto em relação ao retângulo
    private static String verificarPosicaoPonto(Ponto verticeSuperiorEsquerdo, Ponto verticeInferiorDireito, Ponto ponto) {
        if (ponto.getX() < verticeSuperiorEsquerdo.getX() && ponto.getY() > verticeSuperiorEsquerdo.getY()) {
            return "O ponto está acima e à esquerda do retângulo.";
        } else if (ponto.getX() > verticeInferiorDireito.getX() && ponto.getY() > verticeSuperiorEsquerdo.getY()) {
            return "O ponto está acima e à direita do retângulo.";
        } else if (ponto.getX() < verticeSuperiorEsquerdo.getX() && ponto.getY() < verticeInferiorDireito.getY()) {
            return "O ponto está embaixo e à esquerda do retângulo.";
        } else if (ponto.getX() > verticeInferiorDireito.getX() && ponto.getY() < verticeInferiorDireito.getY()) {
            return "O ponto está embaixo e à direita do retângulo.";
        } else if (ponto.getX() < verticeSuperiorEsquerdo.getX()) {
            return "O ponto está à esquerda do retângulo.";
        } else if (ponto.getX() > verticeInferiorDireito.getX()) {
            return "O ponto está à direita do retângulo.";
        } else if (ponto.getY() > verticeSuperiorEsquerdo.getY()) {
            return "O ponto está acima do retângulo.";
        } else if (ponto.getY() < verticeInferiorDireito.getY()) {
            return "O ponto está embaixo do retângulo.";
        } else if (estaNaLinhaDoRetangulo(verticeSuperiorEsquerdo, verticeInferiorDireito, ponto)) {
            return "O ponto está na linha do retângulo.";
        } else {
            return "O ponto está dentro do retângulo.";
        }
    }

    // Função auxiliar para verificar se o ponto está na linha do retângulo
    private static boolean estaNaLinhaDoRetangulo(Ponto verticeSuperiorEsquerdo, Ponto verticeInferiorDireito, Ponto ponto) {
        return (ponto.getX() == verticeSuperiorEsquerdo.getX() && ponto.getY() >= verticeSuperiorEsquerdo.getY() && ponto.getY() <= verticeInferiorDireito.getY()) ||
                (ponto.getX() == verticeInferiorDireito.getX() && ponto.getY() >= verticeSuperiorEsquerdo.getY() && ponto.getY() <= verticeInferiorDireito.getY()) ||
                (ponto.getY() == verticeSuperiorEsquerdo.getY() && ponto.getX() >= verticeSuperiorEsquerdo.getX() && ponto.getX() <= verticeInferiorDireito.getX()) ||
                (ponto.getY() == verticeInferiorDireito.getY() && ponto.getX() >= verticeSuperiorEsquerdo.getX() && ponto.getX() <= verticeInferiorDireito.getX());
    }

    // Função para verificar o tipo de forma geométrica
    private static String verificarTipoForma(Ponto verticeSuperiorEsquerdo, Ponto verticeInferiorDireito) {
        if (verticeSuperiorEsquerdo.getX() == verticeInferiorDireito.getX() && verticeSuperiorEsquerdo.getY() == verticeInferiorDireito.getY()) {
            return "É um ponto.";
        } else if (verticeSuperiorEsquerdo.getX() == verticeInferiorDireito.getX()) {
            return "É uma reta vertical.";
        } else if (verticeSuperiorEsquerdo.getY() == verticeInferiorDireito.getY()) {
            return "É uma reta horizontal.";
        } else {
            return "É um retângulo.";
        }
    }

    // Função para calcular a área do retângulo
    private static double calcularAreaRetangulo(Ponto verticeSuperiorEsquerdo, Ponto verticeInferiorDireito) {
        double largura = Math.abs(verticeInferiorDireito.getX() - verticeSuperiorEsquerdo.getX());
        double altura = Math.abs(verticeSuperiorEsquerdo.getY() - verticeInferiorDireito.getY());
        return largura * altura;
    }
}
