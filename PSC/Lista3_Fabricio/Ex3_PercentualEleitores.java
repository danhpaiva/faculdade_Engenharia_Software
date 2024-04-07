package Lista3_Fabricio;

/*
Escreva um programa em Java para ler o número total de eleitores de um município, o número de votos brancos, 
nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
*/


import java.util.Scanner;

public class Ex3_PercentualEleitores {

    public static float Percentual (int valorParcial, int valorTotal)
    {
        //float teste = (valorParcial/valorTotal) * 100;
        return ((float)valorParcial/valorTotal) * 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroEleitores = 0;
        int votosValidos = 0;
        int votosBrancos = 0;
        int votosNulos = 0;

        int somaTotal = 0;

        System.out.println("Informe a quantidade total de eleitores: ");
        numeroEleitores = input.nextInt();

        System.out.println("Informe a quantidade de votos validos: ");
        votosValidos = input.nextInt();
        if (votosValidos > numeroEleitores)
        {
            System.out.println("\nA quantidade de votos validos nao pode ser maior que a quantidade de eleitores.");
            return;
        }

        System.out.println("Informe a quantidade de votos em branco: ");
        votosBrancos = input.nextInt();
        if (votosBrancos > numeroEleitores)
        {
            System.out.println("\nA quantidade de votos brancos nao pode ser maior que a quantidade de eleitores.");
            return;
        }

        System.out.println("Informe a quantidade de votos nulos: ");
        votosNulos = input.nextInt();
        if (votosNulos > numeroEleitores)
        {
            System.out.println("\nA quantidade de votos validos nao pode ser maior que a quantidade de eleitores.");
            return;
        }

        System.out.printf("\nVotos validos representam %.2f do total de eleitores %d", Percentual(votosValidos, numeroEleitores), numeroEleitores);
        System.out.printf("\nVotos brancos representam %.2f do total de eleitores %d", Percentual(votosBrancos, numeroEleitores), numeroEleitores);
        System.out.printf("\nVotos nulos representam %.2f do total de eleitores %d", Percentual(votosNulos, numeroEleitores), numeroEleitores);

        somaTotal = votosValidos + votosBrancos + votosNulos;

        if ( somaTotal < 100 )        {
            System.out.printf("\nA quantidade de pessoas que nao votaram eh: %d", numeroEleitores - somaTotal);
        }

        input.close();
    }

}
