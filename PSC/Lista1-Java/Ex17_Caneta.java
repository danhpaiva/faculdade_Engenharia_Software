/*Faça um programa para o seguinte problema: Compraram-se N canetas iguais, que foram pagas com uma nota 
de Z reais, obtendo-se Y reais como troco. Quanto custou cada caneta?*/

import java.util.Scanner;

public class Ex17_Caneta {

    public static double raizDelta (int a, int b, int c){
        double delta = Math.pow(b, 2) - 4 * a * c;
        return Math.sqrt(delta);
    }

    public static double raiz1 (int a, int b, int c, double raizDelta){
        return (-b + raizDelta) / (2.0 * a);
    }

    public static double raiz2 (int a, int b, int c, double raizDelta){
        return (-b - raizDelta) / (2.0 * a);
    }
        

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidadeCanetas = 0;
        int valorPago = 0;
        double valorTroco = 0;
        double valorCaneta = 0;

        System.out.println("Informe a quantidade total de canetas compradas: ");
        quantidadeCanetas = input.nextInt();

        System.out.println("Informe o valor que voce entregou para pagamento: ");
        valorPago = input.nextInt();

        System.out.println("Informe o valor que voce recebeu de troco: ");
        valorTroco = input.nextDouble();

        valorCaneta = (valorPago - valorTroco) / quantidadeCanetas;

        System.out.printf("Cada caneta custou: R$%.2f", valorCaneta );

        input.close();
    }
}
