package Lista2;

import java.util.Scanner;

public class Ex2_MaiorIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Informe uma idade para validacao: ");
        idade = input.nextInt();

        if ( idade >= 18 )
            System.out.println("Pessoa maior de idade.");
        else
            System.out.println("Pessoa menor de idade");


        input.close();
    }
}
