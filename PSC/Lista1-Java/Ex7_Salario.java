//Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado.

import java.util.Scanner;

public class Ex7_Salario{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double salario = 0.0;
        Double salarioReajustado = 0.0;

        System.out.println("Informe o seu salario (sem ponto): ");
        salario = input.nextDouble();

        salarioReajustado = salario + (salario * 0.07);

        System.out.println("O seu salario reajustado eh: " + salarioReajustado);

        input.close();
    }
}
