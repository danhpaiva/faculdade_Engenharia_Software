package Lista3;


import java.util.Scanner;

public class Ex3_EquacaoSegundoGrau {

    private static double calcularRaiz2 (float a, float b, double delta)
    {
        return (((-b) - Math.sqrt(delta)) / (2 * a));
    }

    private static double calcularRaiz1 (float a, float b, double delta)
    {
        return (((-b) + Math.sqrt(delta)) / (2 * a));
    }

    private static boolean validarDiscriminante(double delta)
    {
        if (delta < 0)
        {
            System.out.println("Esta equacao nao possui raizes reais.");
            return false;
        }
        else if (delta == 0)
            System.out.println("Esta equacao possui  duas raizes reais iguais.");
        else if (delta > 0)
            System.out.println("Esta equacao possui  duas raizes reais diferentes.");

        return true;

    }

    private static double calcularDiscriminante(float a, float b, float c)
    {
        return (Math.pow(b, 2) - (4*a*c));
    }

    private static double calcularRaizEquacaoPrimeiroGrau(float b, float c)
    {
        return (-c)/b;
    }
    
    private static boolean validarCoeficientes(float a, float b, float c)
    {
        if (a == 0 && b == 0 && (c != 0 || c == 0)){
            System.out.println("Coeficientes informados incorretamente.");
            return false;
        }
        
        if (a == 0 && b != 0 )
        {
            System.out.println("Essa e uma equacao de primeiro grau");
            System.out.printf("\nA raiz dessa equacao e: %.2f", calcularRaizEquacaoPrimeiroGrau(b, c));
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float a = 0;
        float b = 0;
        float c = 0;

        double delta = 0;

        double raiz1 = 0;
        double raiz2 = 0;

        System.out.println("Informe os valores dos coeficientes a, b, c, nesta ordem: ");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();

        if (!validarCoeficientes(a, b, c))
        {
            input.close();
            return;
        }

        delta = calcularDiscriminante(a, b, c);
        if (!validarDiscriminante(delta))
        {
            input.close();
            return;
        }
        

        raiz1 = calcularRaiz1 (a, b, delta);
        raiz2 = calcularRaiz2 (a, b, delta);

        System.out.printf("\nA primeira raiz e: %.2f\n", raiz1);
        System.out.printf("A segunda raiz e: %.2f\n", raiz2);


        input.close();
        
    }

}
