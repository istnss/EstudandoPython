/*Problema "duração"
Fazer um programa para ler uma duração de tempo em segundos, imprimir na tela esta duração no formato horas:minutos:segundos.*/

package LogicaProgramacao.java;

import java.util.Scanner;

public class exercicios_10_Duracao {
    public static void main(String[] args) {

        int duracao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a distância percorrida: ");
        duracao = entrada.nextInt();

        int horas = duracao / 3600;
        int resto = duracao % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        entrada.close();
    }
}
