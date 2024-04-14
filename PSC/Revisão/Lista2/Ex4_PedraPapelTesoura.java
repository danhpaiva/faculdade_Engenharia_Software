package Lista2;

import java.util.Scanner;
import java.util.Random;

public class Ex4_PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        String[] jogadas = {"Pedra", "Papel", "Tesoura"};
        int escolhaUsuario = 0;
        
        
            System.out.println("Escolha sua jogada (0 - Pedra, 1 - Papel, 2 - Tesoura): ");
            escolhaUsuario = input.nextInt();
            
            while (escolhaUsuario < 0 || escolhaUsuario > 3) {
                System.out.println("Escolha inválida. Por favor, escolha novamente.");
                escolhaUsuario = input.nextInt();
            }
            
            int escolhaComputador = random.nextInt(3);
            
            System.out.println("Você escolheu: " + jogadas[escolhaUsuario]);
            System.out.println("O computador escolheu: " + jogadas[escolhaComputador]);
            
            if (escolhaUsuario == escolhaComputador) {
                System.out.println("Empate!");
            } else if ((escolhaUsuario == 0 && escolhaComputador == 2) ||
                       (escolhaUsuario == 1 && escolhaComputador == 0) ||
                       (escolhaUsuario == 2 && escolhaComputador == 1)) {
                System.out.println("Você ganhou!");
            } else {
                System.out.println("Você perdeu!");
            }
        
        input.close();

    }
}
