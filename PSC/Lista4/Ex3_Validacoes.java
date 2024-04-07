package Lista4;

/*
Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';
*/

import java.util.Scanner;

public class Ex3_Validacoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = null;
        int idade = 0;
        float salario = 0;
        char sexo = ' ';
        char estadoCivil = ' ';

        System.out.print("Informe o seu nome: ");
        nome = input.nextLine();
        while (nome.length() <= 3) {
            System.out.print("Nome deve ter mais que tres letras, tente novamente: ");
            nome = input.nextLine();
        }

        System.out.print("Informe a sua idade: ");
        idade = input.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.print("Idade deve ser um valor entre 0 e 150, tente novamente: ");
            idade = input.nextInt();
        }

        System.out.print("Informe o seu salario: ");
        salario = input.nextFloat();
        while (salario <= 0) {
            System.out.print("Salario deve ser maior que 0, tente novamente: ");
            salario = input.nextFloat();
        }

        System.out.print("Informe o seu sexo (f - feminino | m - masculino | o - prefiro nao informar): ");
        sexo = input.next().charAt(0);
        while (sexo != 'm' && sexo != 'f' && sexo != 'o') {
            System.out.print("Para informar o seu sexo voce deve usar as letras f, m ou o, tente novamente: ");
            sexo = input.next().charAt(0);
        }

        System.out.print("Informe o seu estado civil (s - solteiro(a) | c - casado(a) | v - viuvo(a) | d - divorciado(a): ");
        estadoCivil = input.next().charAt(0);
        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
            System.out.print("Para informar o seu estado civil voce deve usar as letras s, c, v ou d, tente novamente: ");
            estadoCivil = input.next().charAt(0);
        }

        System.out.println("\nSeus Dados:");
        System.out.println("Nome\tIdade\tSalario\t Sexo\tEstado Civil");
        System.out.println(nome + "\t" + idade + "\t" + salario + "\t  " + sexo + "\t" + estadoCivil);
        

        input.close();

    }

}
