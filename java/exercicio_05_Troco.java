/*Problema "troco"
Fazer um programa para calcular o troco no processo de pagamento de um produto  de uma mercearia. O programa deve ler o preço unitário do produto, a quantidade 
de unidades compradas deste produto, e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve mostrar o valor do 
troco a ser devolvido ao cliente.*/

package LogicaProgramacao.java;

import java.util.Scanner;

public class exercicio_05_Troco {
    public static void main(String[] args) {

        int preco, quantidade, dinheiro;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o preço unitário do produto: ");
        preco = entrada.nextInt();

        System.out.println("Digite a quantidade comprada: ");
        quantidade = entrada.nextInt();

        System.out.println("Digite o dinheiro recebido: ");
        dinheiro = entrada.nextInt();

        double troco = dinheiro - (preco * quantidade);

        System.out.println(String.format("Troco = %.2f", troco));

        entrada.close();
    }
}
