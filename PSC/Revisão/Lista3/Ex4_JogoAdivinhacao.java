package Lista3;

import java.util.Scanner;
import java.util.Random;

public class Ex4_JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random valor = new Random();

        int numero = valor.nextInt(1,100);
        int palpite = 0;
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Estou pensando em um número entre 1 e 100...");
        System.out.println("Tente adivinhar qual é!");
        

        while (!acertou)
        {
            tentativas++;

            System.out.print("Digite seu palpite: ");
            palpite = input.nextInt();

            if (palpite > numero)
                System.out.println("Muito alto");
            else if (palpite < numero)
                System.out.println("Muito baixo");
            else if (palpite == numero){
                System.out.println("Correto!");
                System.out.println("Numero de tentativas: " + tentativas);
                acertou = true;
            }

        }

        input.close();
    }
}
