package Lista4;

/*
Supondo que a população de um país A seja da ordem de 80000 habitantes 
com uma taxa anual de crescimento de 3% e que a população de B seja 200000 
habitantes com uma taxa de crescimento de 1.5%. 
Faça um programa que calcule e escreva o número de anos necessários para 
que a população do país A ultrapasse ou iguale a população do país B, 
mantidas as taxas de crescimento.
*/


public class Ex4_CrescimentoPopulacional {
    public static void main(String[] args) {
        
        double populacaoA = 80000;
        double populacaoB = 200000;

        int contAnos = 0;

        while (!(populacaoA >= populacaoB))
        {
            populacaoB += (populacaoB * 0.15);
            populacaoA += (populacaoA * 0.3);
            contAnos++;
        }

        System.out.printf("\nSerá necessario %d anos para que a populacao de A supere a populacao de B.", contAnos);


    }

}
