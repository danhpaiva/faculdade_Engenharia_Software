/*Construa um programa que calcule as raízes de uma equação de 2º grau (Ax2+Bx+C). Sendo que os valores 
A,B e C são fornecidos pelo usuário. Considere que tem duas raízes.*/

import java.util.Scanner;

public class Ex15_Raizes {

    public static double raizDelta (int a, int b, int c){
        double delta = Math.pow(b, 2) - 4 * a * c;
        return Math.sqrt(delta);
    }

    public static double raiz1 (int a, int b, int c, double raizDelta){
        return (-b + raizDelta) / (2.0 * a);
    }

    public static double raiz2 (int a, int b, int c, double raizDelta){
        return (-b - raizDelta) / (2.0 * a);
    }
        

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        double raizDeDelta = 0;

        System.out.println("Informe os valores de A, B e C da equação: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        raizDeDelta = raizDelta(a, b, c);

        System.out.printf("As raizes da equacao sao: %.1f e %.1f", raiz1(a, b, c, raizDeDelta), raiz2(a, b, c, raizDeDelta) );

        input.close();
    }
}