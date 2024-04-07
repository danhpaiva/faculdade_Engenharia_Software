package Lista2_Java;

/*Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para 
uma obra. A pessoa utilizadora deve informar as medidas de largura e comprimento da área que será revestida e da 
cerâmica escolhida. Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento. */

import java.util.Scanner;;

public class Ex6_Ceramica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double larguraArea = 0.0;
        Double comprimentoArea = 0.0;
        Double larguraCeramica = 0.0;
        Double comprimentoCeramica = 0.0;

        double area = 0;
        double areaCeramica = 0;

        double quantidadePecasBasico = 0;
        double quantidadePecasTotal = 0;

        System.out.println("Informe a largura da Area: ");
        larguraArea = input.nextDouble();

        System.out.println("Informe o comprimento da Area: ");
        comprimentoArea = input.nextDouble();

        System.out.println("Informe a largura da Ceramica: ");
        larguraCeramica = input.nextDouble();

        System.out.println("Informe o comprimento da Ceramica: ");
        comprimentoCeramica = input.nextDouble();

        area = larguraArea * comprimentoArea;
        areaCeramica = larguraCeramica * comprimentoCeramica;

        quantidadePecasBasico = area/areaCeramica;

        quantidadePecasTotal = quantidadePecasBasico + (quantidadePecasTotal * 0.1);

        System.out.printf("A quantidade de peças necessárias para a obra eh: %.0f", quantidadePecasTotal);
        
        input.close();
    }
    
}
