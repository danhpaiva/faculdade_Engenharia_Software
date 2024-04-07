package Lista3_Fabricio;

/*
Escreva um programa em Java para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário.
Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar 
(total a pagar = total - desconto), sabendo-se que:
- Se quantidade <= 5, o desconto será de 2%
- Se quantidade > 5 e quantidade <=10, o desconto será de 3%
- Se quantidade > 10 e quantidade <30, o desconto será de 5%
- Se quantidade >= 30 o desconto será de 10%
*/


import java.util.Scanner;

public class Ex7_Produto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeProduto = null;
        int quantidadeProduto = 0;
        float precoUnitarioProduto = 0;

        float total = 0;
        double desconto = 0;
        double totalAPagar = 0;
        

        System.out.println("Informe o nome do produto: ");
        nomeProduto = input.nextLine();
        System.out.println("Informe a quantidade adquirida: ");
        quantidadeProduto = input.nextInt();
        System.out.println("Informe o preco unitario do produto: ");
        precoUnitarioProduto = input.nextFloat();

        
        total = quantidadeProduto * precoUnitarioProduto;
        
        if (quantidadeProduto <= 5)
            desconto = total * 0.02;
        else if (quantidadeProduto > 5 && quantidadeProduto <= 10)
            desconto = total * 0.03;
        else if (quantidadeProduto > 10 && quantidadeProduto < 30)
            desconto = total * 0.05;
        else if (quantidadeProduto >= 30)
            desconto = total * 0.1;

        totalAPagar = total - desconto;

        System.out.println("\nProduto\t\tQuantidade\tPreco Unitario\t\tTotal\t\tDesconto\tTotal a Pagar");
        System.out.printf("%s\t\t%d\t\tR$%.2f\t\t\tR$ %.2f\t\tR$ %.2f\t\tR$ %.2f", nomeProduto, quantidadeProduto, precoUnitarioProduto, total, desconto, totalAPagar);

        input.close();

    }

}
