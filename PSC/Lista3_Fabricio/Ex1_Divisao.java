package Lista3_Fabricio;

/*
 Crie um algoritmo que leia dois números e exiba o resultado da divisão entre eles. O algoritmo deverá seguir 
 todas as regras da divisão de números reais.
*/

import java.util.Scanner;

public class Ex1_Divisao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float dividendo = 0;
        float divisor = 0;

        System.out.println("Informe dois numeros: ");
        dividendo = input.nextFloat();
        divisor = input.nextFloat();

        if(divisor == 0){
            System.out.println("Nao eh possivel realizar divisao por 0.");
            return;
        }

        System.out.printf("O resultado da divisao entre os dois numeros eh %.2f", dividendo/divisor);

        input.close();

    }

}
