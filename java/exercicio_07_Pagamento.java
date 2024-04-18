/*Problema "pagamento"
Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a quantidade de horas trabalhadas por ele(a). Ao final, 
mostrar o valor do pagamento do funcionário com uma mensagem explicativa.*/

package LogicaProgramacao.java;

import java.util.Scanner;

public class exercicio_07_Pagamento {
    public static void main(String[] args) {

        int valor, horas;
        String nome;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite o valor por horas: ");
        valor = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horas = entrada.nextInt();
        entrada.nextLine();

        double pagamento = valor * horas;

        System.out.println(String.format("O pagamento para %s deve ser %.2f", nome, pagamento));

        entrada.close();
    }
}
