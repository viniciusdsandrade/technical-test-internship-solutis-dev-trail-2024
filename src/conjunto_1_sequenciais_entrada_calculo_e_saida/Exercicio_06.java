package conjunto_1_sequenciais_entrada_calculo_e_saida;

public class Exercicio_06 {

    /*
    6. Calcule e exiba área ocupada por um círculo cujo raio mede 5 metros. A área de um círculo
    é ¶ multiplicado pelo raio elevado ao quadrado. Em Java o valor de ¶ está disponível em
    Math.PI
     */

    public static void main(String[] args) {
        System.out.println("Exercício 06");

        double raio = 5;
        double area = calcularAreaCirculo(raio);

        System.out.println("A área ocupada por um círculo de raio 5 metros é: " + area);
    }

    public static double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}
