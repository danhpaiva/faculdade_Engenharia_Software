package Lista6;

import java.util.Scanner;

public class Ex5_ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        
        System.out.println("Informe 20 números inteiros: ");
        for (int i = 0; i < numeros.length; i++) 
        {
            numeros[i] = input.nextInt();

            if(numeros[i] % 2 == 0)
                pares[i] = numeros[i];
            else
                impares[i] = numeros[i];
        }
        
        System.out.println("Os numeros informados foram: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("\nOs numeros pares foram: ");
        for (int i = 0; i < pares.length; i++) {
            if(pares[i] != null)
                System.out.println(pares[i]);
        }

        System.out.println("\nOs numeros impares foram: ");
        for (int i = 0; i < impares.length; i++) {
            if(impares[i] != null)
                System.out.println(impares[i]);
        }
        
        input.close();
    }
    
}
