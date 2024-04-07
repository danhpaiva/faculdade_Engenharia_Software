package Lista5_Desafio;


import java.util.Scanner;

public class MedirTemperaturas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float[] temperaturas = new float[12];
        float temperatura = 0;

        int cont = 0;
        float soma = 0;

        System.out.print("\n");
        
        while (cont < temperaturas.length) 
        {
            System.out.print("Informe a temperatura " + (cont + 1) + " do dia: ");
            temperatura = input.nextInt();
            
            while(temperatura < 4 || temperatura > 10)
            {
                System.out.print("Lembre-se que a temperatura deve estar entre 4º e 10º. Digite novamente: ");
                temperatura = input.nextInt();
            }
    
            temperaturas[cont] = temperatura;
            cont++;

        }

        for (int i = 0; i < temperaturas.length; i++)
        {
            soma += temperaturas[i];
        }
           

        System.out.printf("\nA Media das temperaturas informadas hoje eh: %.1f Cº", (soma/temperaturas.length));


        input.close();
    }
        
}

