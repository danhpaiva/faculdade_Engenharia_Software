package Lista2_Java;

/*Escreva um programa que seja capaz de realizar a soma de duas frações, não é necessário simplificar. 
As entradas serão o numerador e, o denominador da primeira fração, seguidos do numerador e, o denominador da 
segunda fração. O resultado também deverá ser exibido em formato de fração. e.g: ⅗ */

import java.util.Scanner;

public class Ex13_Fracao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numerador1 = 0;
        int denominador1 = 0;
        int numerador2 = 0;
        int denominador2=0;

        int numeradorFinal = 0;
        int denominadorFinal = 0;

        int aux = 0;

        System.out.println("Informe o numerador da primeira fracao: ");
        numerador1 = input.nextInt();

        System.out.println("Informe o denominador da primeira fracao: ");
        denominador1 = input.nextInt();

        System.out.println("Informe o numerador da segunda fracao: ");
        numerador2 = input.nextInt();

        System.out.println("Informe o denominador da segunda fracao: ");
        denominador2 = input.nextInt();

        if(denominador1 == denominador2)
        {
            numeradorFinal = numerador1 + numerador2;
            denominadorFinal = denominador1;
        }
        else
        {
            denominadorFinal = denominador1 * denominador2;

            numerador1 = numerador1 * (denominadorFinal/denominador1);
            numerador2 = numerador2 * (denominadorFinal/denominador2);

            numeradorFinal = numerador1 + numerador2;
            
        }

        System.out.println("O resultado da fracao e: " + numeradorFinal + "/" + denominadorFinal);

        input.close();
    }

}
