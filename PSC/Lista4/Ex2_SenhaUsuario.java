package Lista4;

/*
Faça um programa que leia um nome de usuário e a sua senha e não aceite a 
senha igual ao nome do usuário, mostrando uma mensagem de erro e 
voltando a pedir as informações.
*/

import java.util.Scanner;

public class Ex2_SenhaUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = null;
        String senha = null;

        System.out.println("Informe o seu nome de usuario: ");
        nome = input.nextLine();
        System.out.println("Informe a sua senha: ");
        senha = input.nextLine();

        while (nome.equals(senha))
        {
            System.out.println("A sua senha nao pode ser igual ao seu nome de usuario, informe outros: ");
            nome = input.nextLine();
            senha = input.nextLine();
        }

        input.close();
        
    }

}
