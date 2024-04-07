package Lista4_Fabricio;

/*
Crie um programa em Java que implementa um jogo simples de adivinhação. O objetivo do jogo é que o usuário tente adivinhar um número secreto gerado aleatoriamente 
pelo computador. Este número estará entre 1 e 100, inclusive. Para tornar o jogo interativo e dar feedback ao jogador, o programa deve informar após cada tentativa 
se o palpite do usuário é muito alto, muito baixo, ou correto. O jogo termina quando o usuário acertar o número, e o programa deve informar o número de tentativas que 
foram necessárias para chegar à resposta correta.
*/

import java.util.Random;
import java.util.Scanner;

public class Ex5_JogoAdivinhacao {
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
    
