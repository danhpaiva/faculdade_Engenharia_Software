/*Faça um programa que receba de entrada a distância total (em km) percorrida por um automóvel e 
a quantidade de combustível (em litros) consumida para percorrê-la, 
calcule e imprima o consumo médio de combustível. Fórmula: distância/litro.*/

import java.util.Scanner;

public class Ex16_Combustivel {

    public static double raizDelta (int a, int b, int c){
        double delta = Math.pow(b, 2) - 4 * a * c;
        return Math.sqrt(delta);
    }

    public static double raiz1 (int a, int b, int c, double raizDelta){
        return (-b + raizDelta) / (2.0 * a);
    }

    public static double raiz2 (int a, int b, int c, double raizDelta){
        return (-b - raizDelta) / (2.0 * a);
    }
        

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distancia = 0;
        double litrosGasolina = 0;
        double consumoMedio = 0;

        System.out.println("Informe a distancia percorrida (km): ");
        distancia = input.nextDouble();

        System.out.println("Informe a quantidade de litros de gasolina consumidos: ");
        litrosGasolina = input.nextDouble();

        consumoMedio = distancia/litrosGasolina;

        System.out.printf("O consumo medio de combustivel foi: %.0f km/l", consumoMedio );

        input.close();
    }
}
