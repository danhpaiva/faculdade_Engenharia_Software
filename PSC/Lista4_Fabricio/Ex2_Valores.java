package Lista4_Fabricio;

/*
Faça um programa que leia um número indeterminado de valores e mostre o valor lido, seu quadrado, 
seu cubo e sua raiz quadrada. Finalize a entrada com valor negativo ou zero.
*/


import java.util.Scanner;

public class Ex2_Valores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int [10];
        int numero = 0;

        int cont = 0;
        
        System.out.println("Digite quantos numeros degejar. Para parar digite um numero negativo ou zero:");
        
        while (true) {
            numero = input.nextInt();
            
            if (numero <= Parametros.CONDICAODEPARADAEX2.getValor())
                break;
    
            numeros[cont] = numero;
            cont++;

            if (cont == (numeros.length)) {
                int[] auxArray = new int[numeros.length + 1];
                System.arraycopy(numeros, 0, auxArray, 0, numeros.length);
                numeros = auxArray;
            }
        }

        System.out.println("Seus valores:");
        System.out.println("Valor\tValor ao Quadrado\tValor ao Cubo\tRaiz Quadrada Valor");

        for (int i = 0; i < (numeros.length - 1); i++) {
            System.out.printf("%d\t", numeros[i]);
            System.out.printf("%.2f\t", Math.pow(numeros[i], 2));
            System.out.printf("\t\t%.2f\t", Math.pow(numeros[i], 3));
            System.out.printf("\t%.2f\t\n", Math.sqrt(numeros[i]));
        }


        input.close();
    }

}
