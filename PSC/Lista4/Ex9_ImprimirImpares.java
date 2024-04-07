package Lista4;

/*
 Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50
*/

public class Ex9_ImprimirImpares {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 50; numero++)
        {
            if (numero % 2 != 0)
                System.out.println(numero);
        }

    }

}
