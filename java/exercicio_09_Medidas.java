/*Problema "medidas"
Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
com quatro casas decimais):
a) a área do quadrado que tem lado A
b) a área do triângulo retângulo que base A e altura B
c) a área do trapézio que tem bases A e B, e altura C*/

package LogicaProgramacao.java;

import java.util.Scanner;

public class exercicio_09_Medidas {
    public static void main(String[] args) {

        double A, B, C;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da medida A ");
        A = entrada.nextDouble();

        System.out.println("Digite o valor da medida B: ");
        B = entrada.nextDouble();

        System.out.println("Digite valor da medida C: ");
        C = entrada.nextDouble();

        double areaQuadrado = Math.pow(2, A);
        double areaTriangulo = A * B / 2;
        double areaTrapezio = (A + B) * C / 2;

        System.out.println(String.format("Area quadrado: %.4f%nArea triangulo: %.4f%nArea trapezio: %.4f", areaQuadrado,
                areaTriangulo, areaTrapezio));

        entrada.close();
    }
}
