package Lista4;

/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
mensagem caso o valor seja inválido e continue pedindo até que o usuário 
informe um valor válido.
*/


import java.util.Scanner;

public class Ex1_ValidarNumeroInformado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota = 0;

        do 
        {
            System.out.println("Informe uma nota entre 0 e 10: ");
            nota = input.nextInt();
            if (nota < 0 || nota > 10)
                System.out.println("A nota informada e invalida.");
        } while (nota < 0 || nota > 10);
        

        input.close();
        
    }

}
