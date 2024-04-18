/*Problema "idades"
Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os nomes e a idade média entre
essas pessoas, com uma casa decimal.*/

package LogicaProgramacao.java;

import java.util.Scanner;

public class exercicio_03_Idade {
    public static void main(String[] args) {

        int idade1, idade2;
        String pessoa1, pessoa2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        pessoa1 = entrada.nextLine();

        System.out.println("Digite a idade da primeira pessoa: ");
        idade1 = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o nome da segunda pessoa: ");
        pessoa2 = entrada.nextLine();

        System.out.println("Digite a idade da segunda pessoa: ");
        idade2 = entrada.nextInt();
        entrada.nextLine();

        double media = (idade1 + (double) idade2) / 2;

        System.out.println(String.format("A média da idade entre %s e %s é: %.1f anos", pessoa1, pessoa2, media));
        entrada.close();
    }
}
