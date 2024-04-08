package Lista6;

import java.util.Scanner;

public class Ex2_ArrayIntInverso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        
        System.out.println("Informe 10 números inteiros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }
        
        System.out.println("Os numeros informados foram em ordem inversa foram: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        
        input.close();
    }
}
