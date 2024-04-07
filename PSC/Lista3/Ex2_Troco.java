package Lista3;


import java.util.Scanner;

public class Ex2_Troco {

    private static void calcularTroco (double valorPago, double valorCompra)
    {
        double troco = valorPago - valorCompra;

        System.out.printf("\nValor Pago: R$ %.2f", valorPago);
        System.out.printf("\nValor da Compra: R$ %.2f", valorCompra);

        System.out.printf("\n\nTroco: R$ %.2f\n", troco);

        int[] notas = {50, 20, 10, 5, 2, 1};

        for (int nota : notas) 
        {
            if (troco >= nota)
            {
                int quantidade = (int)(troco / nota);
                System.out.printf("\nNotas de R$ %d,00: %d", nota, quantidade);
                troco -= quantidade * nota;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorCompra = 0;
        double valorPago = 0;

        System.out.println("Informe o valor da compra: ");
        valorCompra = input.nextDouble();

        System.out.println("Informe o valor pago: ");
        valorPago = input.nextDouble();

        if (valorPago < valorCompra)
        {
            System.out.println("O valor pago é insuficiente para realizar a compra.");
            return;
        }

        calcularTroco (valorPago, valorCompra);
        

        input.close();
    }

}
