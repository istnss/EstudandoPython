/*Problema "soma"
Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela  o valor da soma destes números.*/

package LogicaProgramacao.java;

import java.util.Scanner;

public class exercicio_04_Soma {

    public static void main(String[] args) {

        int x, y;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de x: ");
        x = entrada.nextInt();

        System.out.println("Digite o valor de y: ");
        y = entrada.nextInt();

        int soma = (x + y);

        System.out.println("Soma = " + soma);

        entrada.close();
    }
}
