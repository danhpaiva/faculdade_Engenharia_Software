//Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que a cotação é US$ 1 = R$ 4,95.

import java.util.Scanner;

public class Ex5_Real{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double dolar = 0.0;
        Double valorReal = 0.0;
        Double cotacao = 4.95;

        System.out.println("Informe um valor em dolar: ");
        dolar = input.nextDouble();

        valorReal = dolar * cotacao;

        System.out.printf("O valor em real eh: %.2f", valorReal);

        input.close();
    }
}