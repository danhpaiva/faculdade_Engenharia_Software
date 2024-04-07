//Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles.

import java.util.Scanner;

public class Ex2_Divisao{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;
        int resultado;

        System.out.println("Informe o primeiro numero: ");
        n1 = input.nextInt();

        System.out.println("Informe o segundo numero: ");
        n2 = input.nextInt();

        resultado = n1 % n2;
        System.out.println("O resto divisao ente os numeros eh: " + resultado);

        input.close();
    }
}