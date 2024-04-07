/*Escreva um programa que calcula o salário líquido de um funcionário. O programa deve solicitar o valor da hora de trabalho, 
o número de horas trabalhadas no mês e o percentual de desconto do INSS.*/

import java.util.Scanner;

public class Ex13_SalarioLiquido {

    public static Double calculoSalarioLiquido (Double valorHoraTrabalhada, Double horasTrabalhadas, int descontoINSS)
    {
        double salario = valorHoraTrabalhada * horasTrabalhadas;
        double contribuicaoINSS = salario * (double)descontoINSS/100;

        return salario - contribuicaoINSS;
    }        

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorHoraTrabalhada = 0.0;
        double horasTrabalhadas = 0.0;
        int descontoINSS = 0;

        System.out.println("Informe quanto vale a sua hora trabalhada: ");
        valorHoraTrabalhada = input.nextDouble();

        System.out.println("Informe quantas horas voce trabalhou nos ultimos 30 dias: ");
        horasTrabalhadas = input.nextDouble();

        System.out.println("Informe o seu percentual (%) de desconto do INSS: ");
        descontoINSS = input.nextInt();

        System.out.printf("O seu salario liquido eh: R$%.2f", calculoSalarioLiquido(valorHoraTrabalhada, horasTrabalhadas, descontoINSS));

        input.close();
    }
}
