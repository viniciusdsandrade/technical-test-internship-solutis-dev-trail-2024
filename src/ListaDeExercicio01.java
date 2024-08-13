import java.util.Scanner;

public class ListaDeExercicio01 {

    /*
    Lista de Exercícios 01 – Introdução Java
    1. O que são variáveis locais?

    2. Quais os tipos de dados primitivos da linguagem Java?

    3. O que são bytecodes?

    4. O que é uma referência?

    5. O que é Garbage Collection?

    6. Qual a necessidade de adotar um padrão de codificação?

    7. Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma
    que a variável A passe a possuir o valor da variável B e que a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

    8. Escreva uma classe que verifica se um dado número inteiro é par ou ímpar.

    9. Encontre o quadrado dos números de 0 até 10. Utilize o controle de fluxo for.

    10. Faça um programa com 3 variáveis do tipo inteiro (int) tal que a primeira tenha o valor de 6, a segunda o valor 4 e a terceira receba o valor da divisão da
    primeira pela segunda. Exiba o valor da terceira variável. Faça uma análise do
    resultado.

    11. Utilize a estrutura if para fazer um programa que retorne o nome de um
    produto a partir do código do mesmo. Considere os seguintes códigos:

    001 ? Parafuso;
    002 ? Porca;
    003 ? Prego;

    Para qualquer outro código: XXX ? Diversos.

    12. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double.

    13. Escreva uma classe que imprima todas as possibilidades de que no lançamento de dois dados tenhamos o valor 7 como resultado da soma dos valores de cada dado.

    14. Faça um programa que utilize a estrutura while para ler 50 números e calcule e exiba a média aritmética deles. (Pesquise sobre como realizar entrada de dados)
    15. Refaça o programa anterior utilizando a estrutura do while.

    OBS: A entrega deve ser feita na sala de aula dia 15/05/2015 de forma
    digital.
     */

    /*
    Respostas
    1. Variáveis locais são variáveis declaradas dentro de um metodo, construtor ou bloco de código. Elas são acessíveis apenas dentro do bloco onde foram declaradas.
    2. Os tipos de dados primitivos da linguagem Java são: byte, short, int, long, float, double, char e boolean.
    inteiros: byte, short, int, long
    ponto flutuantes: float, double
    caractere: char
    booleano: boolean
    3. Bytecodes são códigos de máquina gerados pelo compilador Java e interpretados pela JVM.
    4. Uma referência é um endereço de memória que aponta para um objeto.
    5. Garbage Collection é um processo automático de gerenciamento de memória que remove objetos não utilizados da memória.
    6. Adotar um padrão de codificação é importante para manter a consistência e legibilidade do código, facilitando a manutenção e colaboração entre desenvolvedores.
     */

    public static void main(String[] args) {
        /*
        7. Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma
        que a variável A passe a possuir o valor da variável B e que a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
         */
        exercicio07();

        /*
        8. Escreva uma classe que verifica se um dado número inteiro é par ou ímpar.
         */
        exercicio08();

        /*
        9. Encontre o quadrado dos números de 0 até 10. Utilize o controle de fluxo for.
         */
        exercicio09();

        /*
        10. Faça um programa com 3 variáveis do tipo inteiro (int) tal que a primeira tenha o valor de 6, a segunda o valor 4 e a terceira receba o valor da divisão da
        primeira pela segunda.
        Exiba o valor da terceira variável.
        Faça uma análise do resultado.
         */
        exercicio10();

        /*
        11. Utilize a estrutura if para fazer um programa que retorne o nome de um
        produto a partir do código do mesmo.
        Considere os seguintes códigos:

        001 ? Parafuso;
        002 ? Porca;
        003 ? Prego;
         */
        exercicio11();

        /*
        12. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double.
         */
        exercicio12();

        /*
        13. Escreva uma classe que imprima todas as possibilidades de que no lançamento de dois dados tenhamos o valor 7 como resultado da soma dos valores de cada dado.
         */
        exercicio13();

        /*
        14. Faça um programa que utilize a estrutura while para ler 50 números e calcule e exiba a média aritmética deles.
        (Pesquise sobre como realizar entrada de dados)
         */
        exercicio14();

        /*
        15. Refaça o programa anterior utilizando a estrutura do while.
         */
        exercicio15();
    }

    private static void exercicio07() {
        Scanner scanner = new Scanner(System.in);
        int A, B, temp;

        System.out.println("Exercício 07");

        System.out.print("Digite o valor de A: ");
        A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        B = scanner.nextInt();

        temp = A;
        A = B;
        B = temp;

        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
    }

    private static void exercicio08() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Exercício 08");

        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0) System.out.println("O número " + numero + " é par.");
        else System.out.println("O número " + numero + " é ímpar.");

        // Outra forma de resolver o exercício 8 é utilizando uma função isPar
        /*
        if (isPar(numero))
            System.out.println("O número " + numero + " é par.");
        else
            System.out.println("O número " + numero + " é ímpar.");
         */
        scanner.close();
    }

    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    private static void exercicio09() {
        System.out.println("Exercício 09");

        for (int i = 0; i <= 10; i++) {
            System.out.println("O quadrado de " + i + " é " + (i * i));
        }

        // Outra forma de resolver o exercício 9 é utilizando a função Math.pow
        /*
        for (int i = 0; i <= 10; i++) {
            System.out.println("O quadrado de " + i + " é " + Math.pow(i, 2));
         }
         */
    }

    private static void exercicio10() {
        int a = 6;
        int b = 4;
        int c = a / b;

        System.out.println("O valor de c é: " + c);
        System.out.println("O resultado de 6 / 4 é 1,5, mas como a variável c é do tipo inteiro, " +
                "o resultado é truncado para 1.");
    }

    private static void exercicio11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercício 11");

        // Solicita ao usuário que insira o código do produto
        System.out.print("Digite o código do produto (001, 002, 003): ");
        String codigoProduto = scanner.nextLine();

        // Verifica o código e retorna o nome do produto correspondente
        if (codigoProduto.equals("001")) {
            System.out.println("Produto: Parafuso");
        } else if (codigoProduto.equals("002")) {
            System.out.println("Produto: Porca");
        } else if (codigoProduto.equals("003")) {
            System.out.println("Produto: Prego");
        } else {
            System.out.println("Código inválido. Por favor, insira um código válido (001, 002, 003).");
        }

        /*
        Outra forma de resolver o exercício 11 é utilizando um switch-case, como mostrado abaixo:
        switch (codigoProduto) {
            case "001" -> System.out.println("Produto: Parafuso");
            case "002" -> System.out.println("Produto: Porca");
            case "003" -> System.out.println("Produto: Prego");
            default -> System.out.println("Código inválido.
            Por favor, insira um código válido (001, 002, 003).");
        }
         */

        scanner.close();
    }

    private static void exercicio12() {
        System.out.println("Exercício 12");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Divisão por 2 de " + i + ": " + (i / 2));
                System.out.println("Divisão por 2 de " + i + ": " + ((double) i / 2));
            }
        }
    }

    private static void exercicio13() {
        System.out.println("Exercício 13");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 7) {
                    System.out.println("Dado 1: " + i + ", Dado 2: " + j);
                }
            }
        }
    }

    private static void exercicio14() {
        Scanner scanner = new Scanner(System.in);
        int numero, soma = 0;
        double media;
        int contador = 0;

        System.out.println("Exercício 14");

        while (contador < 50) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            soma += numero;
            contador++;
        }

        media = (double) soma / 50;

        System.out.println("A média aritmética dos números digitados é: " + media);
    }

    private static void exercicio15() {
        Scanner scanner = new Scanner(System.in);
        int numero, soma = 0;
        double media;
        int contador = 0;

        System.out.println("Exercício 15");

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            soma += numero;
            contador++;
        } while (contador < 50);

        media = (double) soma / 50;

        System.out.println("A média aritmética dos números digitados é: " + media);
    }
}
