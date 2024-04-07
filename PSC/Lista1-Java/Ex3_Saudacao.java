//Crie um algoritmo que leia o primeiro nome do usuário e escreva uma saudação para ele.

import java.util.Scanner;

public class Ex3_Saudacao{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;

        System.out.println("Informe o seu nome: ");
        nome = input.nextLine();

        System.out.println("Ola, " + nome);

        input.close();
    }
}