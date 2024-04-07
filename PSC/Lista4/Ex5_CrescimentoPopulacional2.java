package Lista4;

/*
Altere o programa anterior permitindo ao usuário informar as populações e as 
taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.

*/


import java.util.Scanner;
import java.lang.Character;


public class Ex5_CrescimentoPopulacional2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double populacaoA = 0;
        double populacaoB = 0;

        int contAnos = 0;

        char repetirAcaoUsuario = ' ';
        boolean repetirAcao = false;

        do
        {
            do 
            {
                System.out.print("Informe a populacao do pais A: ");
                populacaoA = input.nextDouble();
                System.out.print("Informe a populacao do pais B: ");
                populacaoB = input.nextDouble();

                if(populacaoB <= populacaoA)
                    System.out.println("Para a execução deste programa, a população de A deve ser menor que a população de B.");
                
            } while (populacaoB <= populacaoA);
            

            while (!(populacaoA >= populacaoB))
            {
            populacaoB += (populacaoB * 0.15);
            populacaoA += (populacaoA * 0.3);
            contAnos++;
            }
            System.out.printf("\nSerá necessario %d anos para que a populacao de A supere a populacao de B.\n", contAnos);

            System.out.println("\nRepetir Acao? (S/N)");
            repetirAcaoUsuario = input.next().charAt(0);
            repetirAcao = Character.toUpperCase(repetirAcaoUsuario) == 'S' ? true : false;

        } while(repetirAcao);

        input.close();

    }

}

