//Crie um algoritmo que solicite o nome, o endereço e o telefone do usuário e depois mostre os dados digitados.

import java.util.Scanner;

public class Ex4_Dados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        String rua;
        String bairro;
        int numeroResidencia;
        String telefone;

        System.out.println("Informe o seu nome: ");
        nome = input.nextLine();

        System.out.println("Informe o numero do seu telefone (sem espaço e sem -): ");
        telefone = input.nextLine();

        System.out.println("Informe o nome da sua rua: ");
        rua = input.nextLine();

        System.out.println("Informe o nome do seu bairro: ");
        bairro = input.nextLine();

        System.out.println("Informe o numero da sua casa: ");
        numeroResidencia = input.nextInt();

        System.out.println("Esses são os seus dados: ");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + rua + ", " + numeroResidencia + " - Bairro: " + bairro);
        System.out.println("Telefone: " + telefone);

        input.close();

    }
}
