package Lista4;

/*
Faça um programa que receba dois números inteiros e gere os números 
inteiros que estão no intervalo compreendido por eles.
*/

import java.util.Scanner;

public class Ex10_GerarNumerosInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;

        System.out.println("Informe 2 numeros inteiros: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        System.out.println();

        for (int inteiro = n1 + 1; inteiro < n2; inteiro++) {
                System.out.println(inteiro);
        }

        input.close();

    }

}
