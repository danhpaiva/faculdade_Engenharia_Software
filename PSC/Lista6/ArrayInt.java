package Lista6;

import java.util.Scanner;

public class ArrayInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];
        
        System.out.println("Informe 5 números inteiros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Os numeros informados foram: " + numeros[i]);
        }
        
        input.close();
    }
}