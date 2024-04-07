package Lista2_Java;

/*Crie um programa que calcule a área, o perímetro e a diagonal de um retângulo. O resultado deve aparecer de 
maneira organizada e clara para a pessoa utilizadora. */

import java.util.Scanner;

public class Ex5_DadosRetangulo {

    public static double Area (double ladoMaior, double ladoMenor)
    {
        return (ladoMaior * ladoMenor);
    }

    public static double Perimetro (double ladoMaior, double ladoMenor){
        return (2 * ladoMaior + 2 * ladoMenor);
    }

    public static double Diagonal (double ladoMaior, double ladoMenor){
        double diagonal = Math.pow(ladoMaior, 2) + Math.pow(ladoMenor, 2);
        return (Math.sqrt(diagonal));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ladoMaior = 0;
        double ladoMenor = 0;

        System.out.println("Informe o lado maior do retangulo:");
        ladoMaior = input.nextInt();

        System.out.println("Informe o lado menor do retangulo:");
        ladoMenor = input.nextInt();

        System.out.println("\nInformacoes do retangulo: ");
        System.out.printf("Area:\t\t %.2f \n" , Area(ladoMaior, ladoMenor));
        System.out.printf("Perimetro:\t %.2f \n", Perimetro(ladoMaior, ladoMenor));
        System.out.printf("Diagonal:\t %.2f \n", Diagonal(ladoMaior, ladoMenor));

        input.close();

    }

}
