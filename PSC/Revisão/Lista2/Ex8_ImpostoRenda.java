package Lista2;

import java.util.Scanner;

public class Ex8_ImpostoRenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salario = 0;
        double impostoRenda = 0;

        salario = input.nextFloat();

        if (salario < 0)
            System.out.println("O Salario nao pode ser um valor negativo.");
        else if (salario <= 2000)
            System.out.println("Isento");
        else if (salario <= 3000)
        {
            salario -= 2000;
            impostoRenda = salario * 0.08;
        }
        else if (salario <= 4500)
        {
            salario -= 3000;
            impostoRenda = 1000 * 0.08 + salario * 0.18;
        }
        else
        {
            salario -= 4500;
            impostoRenda = 1000 * 0.08 + 1500 * 0.18 + salario * 0.28;
        }

        System.out.printf("R$ %.2f", impostoRenda);
        System.out.println();

        input.close();
    }
}
