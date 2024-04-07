package Lista2_Java;

/*Crie um programa para calcular a regra de três. */

import java.util.Scanner;;

public class Ex4_RegraDeTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;
        double resultado = 0;
        
        System.out.println("Informe o primeiro valor para a regra de três: ");
        valor1 = input.nextDouble();

        System.out.println("Informe a referencia do primeiro valor: ");
        valor2 = input.nextDouble();

        System.out.println("Informe o terceiro valor para o calculo: ");
        valor3 = input.nextDouble();

        resultado = (valor2 * valor3) / valor1;

        System.out.printf("O resultado da regra de tres eh: %.2f", resultado);
        
        input.close();

    }

}
