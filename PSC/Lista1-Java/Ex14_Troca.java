//Escreva um algoritmo para ler um valor e escrever o seu antecessor e o seu sucessor.
import java.util.Scanner;

public class Ex14_Troca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valorA = 0;
        int valorB = 0;
        int aux = 0;

        System.out.println("Informe o numero A: ");
        valorA = input.nextInt();

        System.out.println("Informe o numero B: ");
        valorB = input.nextInt();

        aux = valorA;
        valorA = valorB;
        valorB = aux;

        System.out.println("Depois da troca o valor A eh: " + valorA);
        System.out.println("Depois da troca o valor B eh: " + valorB);

        input.close();
    }
}
