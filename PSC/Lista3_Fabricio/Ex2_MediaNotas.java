package Lista3_Fabricio;

/*
 Escreva um programa em Java para ler as notas da 1ª, 2ª e  3ª avaliações de um aluno. Calcular a 
 média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado 
 (considerar que média igual ou maior que 7 o aluno é aprovado). Escrever também a média calculada.
*/

import java.util.Scanner;

public class Ex2_MediaNotas {

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

        System.out.println("Informe as notas para o calculo da media: ");
        nota1 = input.nextInt();
        nota2 = input.nextInt();
        nota3 = input.nextInt();

        media = somaDeTresNumeros(nota1, nota2, nota3) / 3;
        System.out.printf("A media simples das notas eh: " + media);

        if (media >= 7 )
            System.out.println("\nAprovado!");
        else 
            System.out.println("\nReprovado!");


        input.close();
    }

}
