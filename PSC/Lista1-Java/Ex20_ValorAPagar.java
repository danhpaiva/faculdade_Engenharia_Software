/*Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor das peças - 
o código da peça 1, valor unitário da peça 1, quantidade de peças 1 - 
o código da peça 2, valor unitário da peça 2, quantidade de peças 2. 
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.*/

import java.util.Scanner;

public class Ex20_ValorAPagar {

    public static Double valorTotal (int porcentagem, double valorPeca, int quantidadePeca)
    {
        double percentual = valorPeca * quantidadePeca * ((float)porcentagem/100);
        double resultado = valorPeca * quantidadePeca + percentual;
        return resultado;
    }        

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int porcentagem1 = 0;
        String codigoPeca1 = null;
        double valorPeca1 = 0;
        int quantidadePecas1 = 0;

        int porcentagem2 = 0;
        String codigoPeca2 = null;
        double valorPeca2 = 0;
        int quantidadePecas2 = 0;

        System.out.println("Informe a porcentagem que será acrescida no valor da peça 1: ");
        porcentagem1 = input.nextInt();
        System.out.println("Informe o codigo da peça 1: ");
        codigoPeca1 = input.next();
        System.out.println("Informe o valor da peça 1: ");
        valorPeca1 = input.nextDouble();
        System.out.println("Informe a quantidade de peças 1: ");
        quantidadePecas1 = input.nextInt();

        System.out.println("Informe a porcentagem que será acrescida no valor da peça 2: ");
        porcentagem2 = input.nextInt();
        System.out.println("Informe o codigo da peça 2: ");
        codigoPeca2 = input.next();
        System.out.println("Informe o valor da peça 2: ");
        valorPeca2 = input.nextDouble();
        System.out.println("Informe a quantidade de peças 2: ");
        quantidadePecas2 = input.nextInt();


        System.out.println("\nValor total a pagar: ");
        System.out.printf(codigoPeca1 + "\t\t%.2f\t\t\n", valorTotal(porcentagem1, valorPeca1, quantidadePecas1));
        System.out.printf(codigoPeca2 + "\t\t%.2f\t\t\n", valorTotal(porcentagem2, valorPeca2, quantidadePecas2));
        System.out.printf("\nTotal: \t\tR$%.2f\t\n", valorTotal(porcentagem1, valorPeca1, quantidadePecas1) + valorTotal(porcentagem2, valorPeca2, quantidadePecas2));

        input.close();
    }
}