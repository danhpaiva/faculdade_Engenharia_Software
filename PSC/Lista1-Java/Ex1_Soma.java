import java.util.Scanner;

//Crie um programa que solicita ao usuário dois números e, em seguida, mostra a soma desses números.

public class Ex1_Soma{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = 0, n2 = 0, resultado = 0;

        System.out.println("Informe o primeiro numero: ");
        n1 = input.nextInt();

        System.out.println("Informe o segundo numero: ");
        n2 = input.nextInt();

        resultado = n1 + n2;
        System.out.println("A soma dos numeros eh: " + resultado);


        input.close();
    }
}