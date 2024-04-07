package Lista3;


import java.util.Scanner;
import java.util.Random;

public class Ex6_Sorteio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        int n1 = 0;
        int n2 = 0;

        System.out.println("Informe dois numeros inteiro para a realizacao do sorteio: ");
        n1 = input.nextInt();
        n2 = input.nextInt();

        int min = Math.min(n1, n2);
        int max = Math.max(n1, n2);

        int valorGerado = aleatorio.nextInt(min,max);

        if (valorGerado % 2 == 0)
            System.out.printf("\nO numero gerado foi %d, um numero par.", valorGerado);
        else
            System.out.printf("\nO numero gerado foi %d, um numero impar.", valorGerado);

        input. close();
    }

}
