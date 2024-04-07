//Escreva um algoritmo para ler um valor e escrever o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Ex12_AntecessorSucessor {

    public static int obterAntecessor (int n){
        return n - 1;
    }

    public static int obterASucessor (int n){
        return n + 1;
    }
        

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = 0;

        System.out.println("Informe um numero sem casas decimais: ");
        valor = input.nextInt();

        System.out.println("O antecessor do numero eh: " + obterAntecessor(valor) + ", e o sucessor eh: " + obterASucessor(valor));

        input.close();
    }
}