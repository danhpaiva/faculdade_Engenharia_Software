package Lista3_Fabricio;

/*
Crie um programa para exibir o menu de um caixa eletrônico. Ele deve possuir as opções: 
Exibir saldo, Exibir extrato, Realizar depósito, Realizar saque, e Sair. 
Se alguma opção inválida for fornecida, exiba uma mensagem de erro e saia do programa.
*/

import java.util.Scanner;

public class Ex11_CaixaEletronico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Caixa Eletronico: ");

        char opcaoMenu = ' ';

        System.out.println("\nExibir Saldo(A)\t\tExibir Extrato(B)\tRealizar Deposito(C)\tRealizar Saque(D)\tSair(E)\n");
        opcaoMenu = input.next().charAt(0);


        switch (opcaoMenu) {
            case 'A':
                System.out.println("Voce escolheu o menu \'Exibir Saldo\'");
                break;
            case 'B':
                System.out.println("Voce escolheu o menu \'Exibir Extrato\'");
                break;
            case 'C':
                System.out.println("Voce escolheu o menu \'Realizar Deposito\'");
                break;
            case 'D':
                System.out.println("Voce escolheu o menu \'Realizar Saque\'");
                break;
            case 'E':
                System.out.println("Voce escolheu o menu \'Sair\'");
                break;
        
            default:
                System.out.println("A opcao escolhida e invalida.");
                break;
        }


        input.close();

    }

}
