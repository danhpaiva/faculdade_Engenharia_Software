package Lista2;

import java.util.Scanner;

public class Ex3_Desconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float valorOriginal = 0;
        float valorPago = 0;

        System.out.print("Informe o valor do Produto: ");
        valorOriginal = input.nextFloat();
        System.out.print("Informe o valor que você pagou: ");
        valorPago = input.nextFloat();

        if (valorPago > valorOriginal)
            System.out.println("O valor pago deve ser menor ou igual ao valor original do produto.");
        else if (valorPago == valorOriginal)
            System.out.println("Você não recebeu nenhum desconto.");
        else 
            System.out.printf("O desconto foi de R$ %.2f", valorOriginal - valorPago);

        input.close();
    }
    
}
