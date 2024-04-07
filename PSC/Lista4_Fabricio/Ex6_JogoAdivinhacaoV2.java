package Lista4_Fabricio;

/*
 Modifique o programa do Jogo de Adivinhação para que após cada tentativa, o programa deve informar ao usuário se o palpite é muito alto, muito baixo, ou correto. 
 Uma vez que o usuário adivinhe o número corretamente, o programa perguntará se ele gostaria de jogar novamente. O usuário pode continuar jogando quantas vezes quiser 
 até que escolha sair do jogo.
*/


import java.util.Random;
import java.util.Scanner;
import java.lang.Character;

public class Ex6_JogoAdivinhacaoV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random valor = new Random();

        int numero = valor.nextInt(1,100);
        int palpite = 0;
        int tentativas = 0;
        boolean acertou = false;

        boolean jogarNovamente = false;
        char jogarNovamenteSN = ' ';

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Estou pensando em um número entre 1 e 100...");
        System.out.println("Tente adivinhar qual é!");
        

        while (!acertou || jogarNovamente)
        {
            tentativas++;

            System.out.print("\nDigite seu palpite: ");
            palpite = input.nextInt();

            if (palpite > numero)
                System.out.println("Muito alto");
            else if (palpite < numero)
                System.out.println("Muito baixo");
            else if (palpite == numero){
                System.out.println("Correto!");
                System.out.println("Numero de tentativas: " + tentativas);
                acertou = true;

                System.out.println("\nDeseja jogar novamente? (S/N)");
                jogarNovamenteSN = input.next().charAt(0);

                jogarNovamente = Character.toUpperCase(jogarNovamenteSN) == 'S' ? true : false;                
            }

        }

        input.close();

    }

}
