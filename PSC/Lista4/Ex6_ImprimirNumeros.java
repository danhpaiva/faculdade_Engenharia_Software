package Lista4;

/*
Faça um programa que imprima na tela os números de 1 a 20, um abaixo do 
outro. Depois modifique o programa para que ele mostre os números um ao 
lado do outro.
*/

public class Ex6_ImprimirNumeros {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 20; numero++)
        {
            System.out.println(numero);
        }

        for (int numero = 1; numero <= 20; numero++)
        {
            System.out.print(numero + " ");
        }

    }

}
