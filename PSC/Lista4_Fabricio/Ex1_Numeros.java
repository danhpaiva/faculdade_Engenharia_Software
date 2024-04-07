package Lista4_Fabricio;

/*
Crie um programa que lê vários números inteiros e positivos e imprima o produto dos números ímpares e 
a soma dos números pares.
*/

import java.util.Scanner;

public class Ex1_Numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int [10];

        int produto = 1;
        int soma = 0;

        int cont = 0;
        
        System.out.println("Digite quantos numeros degejar. Para parar digite 99999:");
        
        while (true) {
            int numero = input.nextInt();
            
            if (numero == Parametros.CONDICAODEPARADAEX1.getValor())
                break;
    
            numeros[cont] = numero;
            cont++;

            if (cont == numeros.length) {
                int[] auxArray = new int[numeros.length * 2];
                System.arraycopy(numeros, 0, auxArray, 0, numeros.length);
                numeros = auxArray;
            }
        }

        for (int numero : numeros) {
            
            if (numero % 2 == 0)
                soma += numero;
            else
                produto *= numero;
        }

        System.out.println("A soma dos numeros pares eh: " + soma);
        System.out.println("O produto entre os numeros impares eh: " + produto);


        input.close();
    }
}
