/*Problema "consumo"
Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
médio do carro, com três casas decimais.*/

package LogicaProgramacao.java;

import java.util.Scanner;

public class exercicio_08_Consumo {
    public static void main(String[] args) {

        double distancia, combustivel;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a distância percorrida: ");
        distancia = entrada.nextDouble();

        System.out.println("Digite o combustível gasto: ");
        combustivel = entrada.nextDouble();

        double media = distancia / combustivel;

        System.out.println(String.format("Consumo médio: %.3f", media));

        entrada.close();
    }
}
