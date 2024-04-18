/* Problema "retângulo"
Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas decimais.*/

package LogicaProgramacao.java;

import java.util.Scanner;

public class exercicio_02_Retangulo {
    public static void main(String[] args) {

        double largura, comprimento, valor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        largura = entrada.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        comprimento = entrada.nextDouble();

        System.out.println("Digite o valor do metro quadrado: ");
        valor = entrada.nextDouble();

        double area = comprimento * largura;
        double preco = area * valor;

        System.out.println(String.format("Area do terreno: %.2f m²%nPreço do metro quadrado: R$ %.2f", area, preco));

        entrada.close();
    }
}
