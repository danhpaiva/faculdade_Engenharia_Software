//Escreva um programa que converte uma quantidade de metros para centímetros.

import java.util.Scanner;

public class Ex8_Centimetros{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double medidaMetros = 0.0;
        Double medidaCentimetros = 0.0;

        System.out.println("Informe uma medida em metros: ");
        medidaMetros = input.nextDouble();

        medidaCentimetros = medidaMetros * 100;

        System.out.println("A medida em centimentros eh: " + medidaCentimetros);

        input.close();
    }
}
