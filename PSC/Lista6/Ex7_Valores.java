package Lista6;

import java.util.Scanner;

public class Ex7_Valores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;
        int multiplicacao = 1;
        
        System.out.println("Informe 5 números inteiros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }

        for (int numero : numeros) {
            soma += numero;
            multiplicacao *= numero;
        }
        
        System.out.println("Os numeros informados foram: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("\nA soma entre os numeros eh: " + soma);
        System.out.println("A multiplicacao entre os numeros eh: " + multiplicacao);
        
        input.close();
    }
    
}
