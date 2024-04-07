//Crie um programa que calcula a média simples de três notas fornecidas pelo usuário.

import java.util.Scanner;

public class Ex11_MediaSimples{

    public static int somaDeTresNumeros(int n1, int n2, int n3)
    {
        int resultado = 0;

        resultado = n1 + n2 + n3;

        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int media = 0;

        System.out.println("Informe as notas para o cálculo da média: ");
        nota1 = input.nextInt();
        nota2 = input.nextInt();
        nota3 = input.nextInt();

        media = somaDeTresNumeros(nota1, nota2, nota3) / 3;

        System.out.printf("A media simples das notas eh: " + media);

        input.close();
    }
}
