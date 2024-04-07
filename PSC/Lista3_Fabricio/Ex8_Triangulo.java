package Lista3_Fabricio;

/*
Você está trabalhando em uma startup voltada para educação, e ficou responsável por criar a lógica de uma das 
atividades. Seu programa deve receber o valor dos três lados de um triângulo, e informar se ele é equilátero, 
isósceles ou escaleno. Restrição: Em um triângulo, o comprimento de um lado é sempre menor do que a soma dos 
outros dois! */


import java.util.Scanner;

public class Ex8_Triangulo {

    public static boolean ValidarLadosTriangulo (float lado1, float lado2, float lado3)
    {
        boolean parar = false;
        if (lado1 > (lado2 + lado3) || lado2 > (lado1 + lado3) || lado3 > (lado1 + lado2))
            parar = true;
        if (lado1 < 0 || lado2 < 0 || lado3 < 0)
            parar = true;

        return parar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float lado1 = 0;
        float lado2 = 0;
        float lado3 = 0;

        System.out.println("Informe os tres lados do triangulo: ");
        lado1 = input.nextFloat();
        lado2 = input.nextFloat();
        lado3 = input.nextFloat();

        if (ValidarLadosTriangulo(lado1, lado2, lado3))
        {
            System.out.println("Os valores informados para os lados do triangulo sao invalidos.");
            return;
        }

        if ( lado1 != lado2 && lado1 != lado3 && lado2 != lado3 )
            System.out.println("Triangulo Escaleno.");
        if ( (lado1 == lado2 && lado1 != lado3)|| (lado1 == lado3 && lado1 != lado3) || (lado2 == lado3 && lado2 != lado1) )
            System.out.println("Triangulo Isosceles.");
        if ( lado1 == lado2 && lado1 == lado3 && lado2 == lado3 )
            System.out.println("Triangulo Equilatero.");

        input.close();

    }

}
