package Lista2_Java;

import java.util.Scanner;

/*Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica escolhido 
e o valor total a ser pago. */

public class Ex7_PrecoTotalCeramica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double larguraArea = 0.0;
        Double comprimentoArea = 0.0;
        Double larguraCeramica = 0.0;
        Double comprimentoCeramica = 0.0;
        Double valorCeramica = 0.0;

        double area = 0;
        double areaCeramica = 0;

        double quantidadePecasBasico = 0;
        double quantidadePecasTotal = 0;
        double precoTotalCeramica = 0;

        System.out.println("Informe a largura da Area: ");
        larguraArea = input.nextDouble();

        System.out.println("Informe o comprimento da Area: ");
        comprimentoArea = input.nextDouble();

        System.out.println("Informe a largura da Ceramica: ");
        larguraCeramica = input.nextDouble();

        System.out.println("Informe o comprimento da Ceramica: ");
        comprimentoCeramica = input.nextDouble();

        System.out.println("Informe o valor do metro quadrado da Ceramica: ");
        valorCeramica = input.nextDouble();

        area = larguraArea * comprimentoArea;
        areaCeramica = larguraCeramica * comprimentoCeramica;

        quantidadePecasBasico = area/areaCeramica;

        quantidadePecasTotal = quantidadePecasBasico + (quantidadePecasTotal * 0.1);

        precoTotalCeramica = (valorCeramica * areaCeramica) * quantidadePecasTotal;

        System.out.printf("A quantidade de peças necessárias para a obra eh: %.0f\n", quantidadePecasTotal);
        System.out.printf("O preco total para comprar as pecas eh: %.2f", precoTotalCeramica);

        input.close();
    }
}


