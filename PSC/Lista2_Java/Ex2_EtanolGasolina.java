package Lista2_Java;

/*Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina? 
Especialistas indicam que o consumo do carro aumenta em torno de trinta por cento, quando abastecido com etanol, 
logo, só vale a pena abastecer com ele se o valor estiver abaixo de setenta por cento do valor da gasolina. 
Para auxiliar motoristas a realizar este cálculo, crie um algoritmo que receba o preço dos dois combustíveis, 
e informe qual deve ser a escolha, com base no custo. */

import java.util.Scanner;

public class Ex2_EtanolGasolina {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double precoGasolina = 0;
        double precoEtanol = 0;
        double percentualDeVariacao;

        System.out.println("Informe o valor da gasolina: ");
        precoGasolina = input.nextDouble();

        System.out.println("Informe o valor do etanol: ");
        precoEtanol = input.nextDouble();
    
        percentualDeVariacao = (precoEtanol * 100)/precoGasolina;
    
        if (percentualDeVariacao < 70)
            System.out.println("Você deve abastecer com Etanol");
        else 
            System.out.println("Você deve abastecer com Gasolina");
    
        input.close();
    }

}
