package Lista4;

import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe a soma e a média dos números.
*/

public class Ex8_SomaMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] numeros = new int[5];

        int soma = 0;

        System.out.println("Informe 5 numeros do tipo inteiro: ");
        for (int i = 0; i < 5; i++)
        {
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++)
        {
            soma += numeros[i];
        }

        System.out.println("A soma entre os numeros informados eh: " + soma);
        System.out.println("A media entre os numeros informados eh: " + soma/5);


        input.close();
        
    }

}
