package Lista2;

import java.util.Scanner;

public class Ex7_Nota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float notaAluno = 0;

        System.out.print("Informe a nota do aluno: ");
        notaAluno = input.nextFloat();

        if (notaAluno < 70)
            System.out.println("Reprovado!");
        else 
            System.out.println("Aprovado!");

        input.close();
    }
    
}
