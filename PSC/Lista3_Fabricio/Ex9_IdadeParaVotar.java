package Lista3_Fabricio;

/*
(Decom/UFOP - Adaptado) A permissão para uma pessoa votar ou não é determinado pela idade dela, conforme a tabela:

Idade (anos)   Classificação
menor que 16   Não é eleitor
de 16 a 17     Eleitor facultativo
de 18 a 65     Eleitor obrigatório
acima de 65    Eleitor facultativo

Crie um programa capaz de ler a idade de uma pessoa e imprimir sua classificação eleitoral. 
Entrada: QUAL A IDADE DA PESSOA?: 17
Saída: ELEITOR FACULTATIVO */

import java.util.Scanner;

public class Ex9_IdadeParaVotar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Informe uma idade para validacao: ");
        idade = input.nextInt();

        if(idade < 16)
            System.out.println("Nao eh eleitor.");
        if (idade == 16 || idade == 17)
            System.out.println("Eleitor facultativo.");
        if ( idade >= 18 && idade <= 65)
            System.out.println("Eleitor obrigatorio.");
        if (idade > 65)
            System.out.println("Eleitor facultativo.");


        input.close();
    }

}
