package Lista2_Java;

/*Muitas pessoas têm dúvida sobre qual o gasto com energia de determinados equipamentos que possuem. 
Crie um algoritmo que receba a potência do equipamento em Watts, a quantidade de horas que ele fica ligado por dia, 
e o valor do KW/h. O cálculo é feito multiplicando a potência pela quantidade de horas, depois, dividindo por mil. 
Ao final, apresente a quantidade de KWh consumidos pelo equipamento e qual será o valor pago por eles. */

import java.util.Scanner;

public class Ex11_Kwh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double potenciaEquipamento = 0;
        double horasDeConsumo = 0;
        double kwhValor = 0;

        double kwhConsumidos = 0;
        double valorDoConsumo = 0;

        System.out.println("Informe a potencia do equipamento em Watts: ");
        potenciaEquipamento = input.nextDouble();

        System.out.println("Informe a quantidade de horas que o equipamento fica ligado por dia: ");
        horasDeConsumo = input.nextDouble();

        System.out.println("Informe o valor do Kw/h: ");
        kwhValor = input.nextDouble();

        kwhConsumidos = (potenciaEquipamento * horasDeConsumo) / 1000;
        valorDoConsumo = kwhConsumidos * kwhValor;

        System.out.printf("Os KWh consumidos em 1 dia e: %.2f\n", kwhConsumidos);
        System.out.printf("O valor pago por esse tempo consumido e: R$%.2f\n", valorDoConsumo);

        input.close();
    }

}
