/*Escreva um programa que calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores 
resultantes em formato de tabela como a seguir:*/


public class Ex19_Formatacao {

    public static double cubo (int n)
    {
        return Math.pow(n, 3);
    }

    public static double quadrado (int n)
    {
        return Math.pow(n, 2);
    }
    public static void main(String[] args) {

        System.out.println("Número\t\tQuadrado\tCubo");
        System.out.printf("0\t\t%.0f\t\t%.0f\n",quadrado(0), cubo(0));
        System.out.printf("1\t\t%.0f\t\t%.0f\n",quadrado(1), cubo(1));
        System.out.printf("2\t\t%.0f\t\t%.0f\n",quadrado(2), cubo(2));
        System.out.printf("3\t\t%.0f\t\t%.0f\n",quadrado(3), cubo(3));
        System.out.printf("4\t\t%.0f\t\t%.0f\n",quadrado(4), cubo(4));
        System.out.printf("5\t\t%.0f\t\t%.0f\n",quadrado(5), cubo(5));
        System.out.printf("6\t\t%.0f\t\t%.0f\n",quadrado(6), cubo(6));
        System.out.printf("7\t\t%.0f\t\t%.0f\n",quadrado(7), cubo(7));
        System.out.printf("8\t\t%.0f\t\t%.0f\n",quadrado(8), cubo(8));
        System.out.printf("9\t\t%.0f\t\t%.0f\n",quadrado(9), cubo(9));
        System.out.printf("10\t\t%.0f\t\t%.0f\n",quadrado(10), cubo(10));

    }
}