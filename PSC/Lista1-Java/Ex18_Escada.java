/*Cada degrau de uma escada tem X de altura. Faça um programa que receba essa altura e a altura que o 
usuário deseja alcançar subindo a escada, calcule e mostre quantos degraus ele deverá subir para atingir 
seu objetivo, sem se preocupar com a altura do usuário. Todas as medidas fornecidas devem estar em metros.*/

import java.util.Scanner;

public class Ex18_Escada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double alturaDegrau = 0;
        double alturaDesejada = 0;
        int quantidadeDegraus = 0;

        System.out.println("Informe a altura do degrau da escada em metros: ");
        alturaDegrau = input.nextDouble();

        System.out.println("Informe a altura que voce precisa subir: ");
        alturaDesejada = input.nextDouble();

        quantidadeDegraus = (int)(alturaDesejada / alturaDegrau);

        System.out.println("A quantidade de degraus necessarios e: " + quantidadeDegraus );

        input.close();
    }
}
