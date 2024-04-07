package Lista3;


import java.util.Scanner;

public class Ex1_Numeros {

    private static double mediaTresNumeros (int n1, int n2, int n3)
    {
        double numero1 = (double) n1;
        double numero2 = (double) n2;
        double numero3 = (double) n3;

        double resultado = (numero1+numero2+numero3)/3;
        return resultado;
    }

    private static void validarNumeros (int n1, int n2, int n3)
    {
        int menor = 0;
        String resultado = null;

        if (n1 > n2 && n1 > n3)
        {
            System.out.println(String.format("O maior numero e %d.", n1));

            menor = n2 < n3 ? n2 : n3;
            System.out.println(String.format("O menor numero e %d.", menor));
        }
        else if (n2 > n1 && n2 > n3)
        {
            System.out.println(String.format("O maior numero e %d.", n2));

            menor = n1 < n3 ? n1 : n3;
            System.out.println(String.format("O menor numero e %d.", menor));
        }
        else if (n3 > n1 && n3 > n2)
        {
            System.out.println(String.format("O maior numero e %d.", n3));

            menor = n1 < n2 ? n1 : n2;
            System.out.println(String.format("O menor numero e %d.", menor));
        }
        else if ( n1 == n2 && n1 == n3)
            System.out.println("Os numeros sao iguais.");
        else if (n1 == n2 && n1 != n3)
            resultado = n1 < n3 ? ("O maior numero e " + n3 + ".\nO menor numero e: " + n1) : ("O maior numero e " + n1 + ".\nO menor numero e: " + n3);
        else if(n1 == n3 && n1 != n2)
            resultado = n1 < n2 ? ("O maior numero e " + n2 + ".\nO menor numero e: " + n1) : ("O maior numero e " + n1 + ".\nO menor numero e: " + n2);

        if (resultado != null)
            System.out.printf(resultado);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        System.out.println("Informe três numeros: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        validarNumeros (n1, n2, n3);

        System.out.printf("\nA média entre %d, %d, %d eh %.2f\n", n1, n2, n3, mediaTresNumeros(n1, n2, n3));

        input.close();
    }

}
