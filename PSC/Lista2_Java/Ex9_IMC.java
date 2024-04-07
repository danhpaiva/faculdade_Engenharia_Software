package Lista2_Java;

/*Crie um programa para calcular o IMC de uma pessoa. Ele deve receber o peso atual em quilogramas e a altura em 
centímetros, e exibir o peso ideal e o peso ideal ajustado. 
Dica: https://eurofarma.com.br/calculadoras/calculadora-de-peso-ideal Utilize este como referência para seus testes. 
Obs. O IMC é apenas uma referência, um médico deve ser consultado para entender as necessidades de cada indivíduo. */

import java.util.Scanner;

public class Ex9_IMC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso = 0;
        double altura = 0;
        String genero = null;

        double pesoIdeal = 0;
        double pesoAjustado = 0;

        System.out.println("Informe o seu peso em kg: ");
        peso = input.nextDouble();

        System.out.println("Informe sua altura em centimetros: ");
        altura = input.nextDouble();

        System.out.println("Informe o seu gênero: \nF - Feminino \nM - Masculino \nY - Nao informar");
        genero = input.nextLine();


        pesoIdeal = genero == "F" ?  52 + (0.67 * (altura - 152.4)) : 52 + (0.75 * (altura - 152.4));

        pesoAjustado = ((peso - pesoIdeal) * 0.25) + pesoIdeal;
        

        System.out.printf("\nO seu peso ideal é: %.1fkg. \n", pesoIdeal);
        System.out.printf("O seu peso ajustado é: %.1fkg. \n", pesoAjustado);

        input.close();

    }
}
