/*Problema "terreno"
Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular, bem como o valor do metro quadrado do terreno. Em seguida, o programa deve mostrar o valor da área do terreno, bem como o 
valor do preço do terreno, ambos com duas casas decimais.*/

package LogicaProgramacao.java;

import java.util.Scanner;

public class exercicio_01_Terreno {
    public static void main(String[] args) {

        double base, altura;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a base do retangulo: ");
        base = entrada.nextDouble();

        System.out.println("Digite a altura do retangulo: ");
        altura = entrada.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        System.out.println(String.format("Area: %.4f%nPerimetro: %.4f%nDiagonas: %.4f", area, perimetro, diagonal));
        entrada.close();
    }
}