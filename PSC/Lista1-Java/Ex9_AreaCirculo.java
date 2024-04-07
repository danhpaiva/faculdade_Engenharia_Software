//Desenvolva um programa que calcula a área de um círculo, onde o raio é fornecido pelo usuário

import java.util.Scanner;

public class Ex9_AreaCirculo{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double raioCirculo = 0.0;
        Double areaCirculo = 0.0;

        System.out.println("Informe o raio do Circulo em metros: ");
        raioCirculo = input.nextDouble();

        areaCirculo = Math.PI * Math.pow(raioCirculo, 2);

        System.out.printf("A area do circulo eh: %.2f metros", areaCirculo);

        input.close();
    }
}
