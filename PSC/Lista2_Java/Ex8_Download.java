package Lista2_Java;

/*Faça um programa que calcule o tempo necessário para o download de um arquivo qualquer da internet. 
Deve-se informar o tamanho do arquivo em MB, a velocidade do link em Mbps e, retornar o tempo total em minutos. */

import java.util.Scanner;

public class Ex8_Download {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tamanhoArquivoMB = 0;
        double velocidadeMbps = 0;

        double tamanhoArquivoBits = 0;

        System.out.println("Informe o tamanho do arquivo em MB: ");
        tamanhoArquivoMB = input.nextDouble();

        System.out.println("Informe a velocidade de download em Mega Bits por segundo (Mpbs): ");
        velocidadeMbps = input.nextDouble();

        tamanhoArquivoBits = tamanhoArquivoMB * 8;

        System.out.printf("A velocidade do download em segundos é: %.0f segundos", tamanhoArquivoBits/velocidadeMbps);

        input.close();
    }
}
