package Lista6;

import java.util.Scanner;

public class Ex3_Notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] notas = new int[4];
        float somaNotas = 0;
        
        System.out.println("Informe as 4 notas do aluno: ");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = input.nextInt();
        }
        
        System.out.println("As notas sao: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        System.out.println("\n A media entre as notes eh: ");
        for (int nota : notas) {
            somaNotas += nota;
        }
        System.out.println(somaNotas/notas.length);
        
        input.close();
    }
}
