package Lista2;

import java.util.Scanner;

public class Ex6_MaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        var numeros = new int[5];
        int maior = 0;

        System.out.println("Informe 5 numeros do tipo inteiro: ");
        for (int i = 0; i < 5; i++)
        {
            numeros[i] = input.nextInt();
        }

        for (int numero : numeros) 
        {
            if (numero > maior) 
                maior = numero;
        }

        System.out.println("Dentre os numeros informados, o maior e: " + maior);

        input.close();
    }
}
