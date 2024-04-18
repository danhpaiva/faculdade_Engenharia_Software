import java.util.Scanner;
import java.util.ArrayList;

public class Ex2_Investigacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vitima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vitima?");
        perguntas.add("Devia para a vitima?");
        perguntas.add("Já trabalhou com a vitima?");

        Character resposta = ' ';
        int contRespostaSuspeita = 0;

        System.out.println("Instruções: ");
        System.out.println("Para responder Sim, digite S.");
        System.out.println("Para responder Nao, digite N.");
        
        for (String pergunta : perguntas) 
        {
            System.out.println("\n" + pergunta);
            resposta = input.next().charAt(0);
            resposta = Character.toUpperCase(resposta);

            while(!(resposta == 'S' || resposta == 'N'))
            {
                System.out.println("Responda com S ou N, tente novamente.");
                resposta = input.next().charAt(0);
                resposta = Character.toUpperCase(resposta);
            }

            if (resposta == 'S')
                contRespostaSuspeita++;
        }

        if (contRespostaSuspeita == 2)
            System.out.println("\nSuspeita.");
        else if (contRespostaSuspeita == 3 || contRespostaSuspeita == 4)
            System.out.println("\nCumplice.");
        else if (contRespostaSuspeita == 5)
            System.out.println("\nAssassino.");
        else 
            System.out.println("\nInocente.");

        input.close();        
    }
}
