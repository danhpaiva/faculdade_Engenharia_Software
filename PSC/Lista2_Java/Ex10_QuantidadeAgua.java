package Lista2_Java;

/*A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para cada quilograma de peso. 
Crie um algoritmo que recebe o peso de uma pessoa e informe a quantidade recomendada de água em litros. */

import java.util.Scanner;

public class Ex10_QuantidadeAgua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso = 0;

        System.out.println("Informe o seu peso em Kg: ");
        peso = input.nextDouble();

        System.out.printf("A quantidade de água que você deve ingerir por dia e: %.2f litros", peso * 0.035);

        input.close();
    }

}
