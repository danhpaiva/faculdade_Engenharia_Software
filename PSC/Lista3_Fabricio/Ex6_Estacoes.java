package Lista3_Fabricio;

/*
Escreva um programa que peça ao usuário que insira um número de 1 a 4, correspondendo a cada estação do ano 
(1 para Primavera, 2 para Verão, 3 para Outono, e 4 para Inverno) para identificar a estação escolhida 
e imprimir uma mensagem característica daquela estação.
*/

import java.util.Scanner;

public class Ex6_Estacoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 0;

        System.out.println("Informe um numero para a estacao do ano: ");
        System.out.println("1 para Primavera");
        System.out.println("2 para Verao");
        System.out.println("3 para Outono");
        System.out.println("4 para Inverno\n");
        numero = input.nextInt();

        switch (numero) {
            case 1:
                System.out.println("A primavera eh a estacao das flores.");
                break;
            case 2:
                System.out.println("O verao eh a estacao mais quente.");
                break;
            case 3:
                System.out.println("O outono eh a estacao da renovacao.");
                break;
            case 4:
                System.out.println("O inverno eh a estacao mais fria.");
                break;
        
            default:
                System.out.println("Codigo invalido!");
                break;
        }

        input.close();
    }


}
