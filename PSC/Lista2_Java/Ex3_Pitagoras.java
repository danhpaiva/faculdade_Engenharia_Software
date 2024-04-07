package Lista2_Java;

/*Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =a2+b2  */

import java.util.Scanner;

public class Ex3_Pitagoras {

    public static double Pitagoras(int a, int b){
        return (Math.pow(a,2) + Math.pow(b, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.println("Informe um valor para a: ");
        a = input.nextInt();
        System.out.println("Informe um valor para b");
        b = input.nextInt();

        System.out.printf("O calculo de Pitagoras para esse valores eh: %.2f", Pitagoras(a,b));

        input.close();
    }

}
