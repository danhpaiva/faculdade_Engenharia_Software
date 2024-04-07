package Lista4_Fabricio;

/*
Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:
a) a quantidade de pessoas com idade superior a 50 anos;
b) a média das alturas das pessoas com idade entre 10 e 20 anos;
c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.
*/


import java.util.Scanner;

public class Ex3_Pessoas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[10];
        int idade = 0;
        float altura = 0;
        float peso = 0;

        int contPessoasIdade50 = 0;
        int contPessoasIdadeEntre10e20 = 0;
        double alturaPessoasIdadeEntre10e20 = 0;
        int contPessoasPesoMenor40 = 0;

        System.out.println("Informe a idade, a altura e o peso de 10 pessoas: ");

        for (int i = 0; i < pessoas.length; i++) {
            idade = input.nextInt();
            altura = input.nextFloat();
            peso = input.nextFloat();

            pessoas[i] = new Pessoa(idade, altura, peso); 
        }

        for (Pessoa pessoa : pessoas) {

            if (pessoa.idade > 50)
                contPessoasIdade50++;
            else if (pessoa.idade >= 10 && pessoa.idade <= 20)
            {
                contPessoasIdadeEntre10e20++;
                alturaPessoasIdadeEntre10e20 += pessoa.altura;
            }

            if(pessoa.peso < 40)
                contPessoasPesoMenor40++;

        }

        System.out.println("A quantidade de pessoas com idade superior a 50 anos eh: " + contPessoasIdade50);
        System.out.printf("\nA media de altura das pessoas com idade entre 10 e 20 anos eh: %.2f" + (alturaPessoasIdadeEntre10e20/contPessoasIdadeEntre10e20));
        System.out.println("Pessoas com menos de 40 quilos representem " + contPessoasPesoMenor40 + "% da quantidade total.");


        input.close();
    }

}
