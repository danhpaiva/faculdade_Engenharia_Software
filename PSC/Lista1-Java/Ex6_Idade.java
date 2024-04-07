//Crie um algoritmo que leia a idade de uma pessoa e calcule quantos dias essa pessoa já viveu.

import java.util.Scanner;

public class Ex6_Idade{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade = 0;
        int diasDeVida = 0;

        System.out.println("Informe a sua idade: ");
        idade = input.nextInt();

        diasDeVida = idade * 365;

        System.out.println("A estimativa de dias que voce viveu eh: " + diasDeVida);

        input.close();
    }
}
