package Lista5_Fabricio;

/*
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, 
segundo a tabela abaixo.

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, 
pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. 
No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que 
resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas 
casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a 
mensagem "Isento".
*/


import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salario = 0;
        double impostoRenda = 0;

        salario = input.nextFloat();

        if (salario < 0)
            System.out.println("O Salario nao pode ser um valor negativo.");
        else if (salario <= 2000)
            System.out.println("Isento");
        else if (salario <= 3000)
        {
            salario -= 2000;
            impostoRenda = salario * 0.08;
        }
        else if (salario <= 4500)
        {
            salario -= 3000;
            impostoRenda = 1000 * 0.08 + salario * 0.18;
        }
        else
        {
            salario -= 4500;
            impostoRenda = 1000 * 0.08 + 1500 * 0.18 + salario * 0.28;
        }

        System.out.printf("R$ %.2f", impostoRenda);
        System.out.println();

        input.close();
    }
}