package Lista3_Fabricio;

/*
(Decom/UFOP) Na lojinha do Sr. Aboo, encontramos produtos de informática com preços especiais. 
Mas o Sr. Aboo segue uma receita de seus antepassados para acrescentar uma porcentagem sobre o valor de custo 
do produto, garantindo assim, a estabilidade financeira das futuras gerações de sua família. A tabela abaixo, 
feita pelo avô do Sr. Aboo, descreve o valor do lucro de um produto, considerando o valor de compra do mesmo.

Para auxiliar o Sr. Aboo, codifique um programa que leia o valor da compra de um produto de informática e 
imprima a porcentagem do lucro e o valor da venda.  O programa deve exibir a mensagem "Lojinha do Sr. Aboo" e 
em seguida solicitar o valor da compra com o fornecedor, e, em seguida, exibir qual será a porcentagem de 
lucro e o valor que o item deve ser colocado para venda. */


import java.util.Scanner;

public class Ex10_LojaSrAboo {

    public static void InformacoesDaVenda (float valorCompra)
    {
        double valorVenda = 0;

        if (valorCompra < 10)
        {
            valorVenda = valorCompra + (valorCompra * 0.7);
            System.out.println("\nPorcentagem de Lucro\tValor da Venda");
            System.out.print("\t70%");
            System.out.printf("\t\tR$ %.2f", valorVenda );
        } 
        else if(valorCompra >= 10 && valorCompra < 30)
        {
            valorVenda = valorCompra + (valorCompra * 0.5);
            System.out.println("\nPorcentagem de Lucro\tValor da Venda");
            System.out.print("\t50%");
            System.out.printf("\t\tR$ %.2f", valorVenda );
        }
        else if(valorCompra >= 30 && valorCompra < 50)
        {
            valorVenda = valorCompra + (valorCompra * 0.4);
            System.out.println("\nPorcentagem de Lucro\tValor da Venda");
            System.out.print("\t40%");
            System.out.printf("\t\tR$ %.2f", valorVenda );
        }
        else if(valorCompra >= 50)
        {
            valorVenda = valorCompra + (valorCompra * 0.3);
            System.out.println("\nPorcentagem de Lucro\tValor da Venda");
            System.out.print("\t30%");
            System.out.printf("\t\tR$ %.2f", valorVenda );
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float valorCompra = 0;

        System.out.println("\nLojinha do Sr. Aboo");
        System.out.println("\nInforme o valor da compra (R$):");
        valorCompra = input.nextFloat();

        InformacoesDaVenda(valorCompra);

        input.close();
        
    }

}
