/*Problema "circulo"
Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟􀬶. Você pode
usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use diretamente o valor 3.14159. */

package LogicaProgramacao.java;

import java.util.Scanner;

public class exercicio_06_Circulo {
    public static void main(String[] args) {

        int raio;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo: ");
        raio = entrada.nextInt();

        double area = Math.PI * (raio * raio);

        System.out.println(String.format("Area %.3f", area));

        entrada.close();
    }
}
