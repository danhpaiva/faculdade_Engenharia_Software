package Lista5_Fabricio;

import java.util.Scanner;

public class Cobaias {

    class Teste {

        public int quantidadeCobaias;
        public char cobaia;
    
        public Teste(int quantidadeCobaias, char cobaia) {
            this.quantidadeCobaias = quantidadeCobaias;
            this.cobaia = cobaia;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int casosTeste = 0;
        casosTeste = input.nextInt();

        Teste[] testes = new Teste[casosTeste];
        int quantidadeCobaias = 0;
        char cobaia = ' ';

        float percentualSapos = 0;
        float percentualRatos = 0;
        float percentualCoelhos = 0;

        int contCobais = 0;
        int contSapo = 0;
        int contRato = 0;
        int contCoelho = 0;

        for (int i = 0; i < casosTeste; i++) {

            do {
                quantidadeCobaias = input.nextInt();

                if (quantidadeCobaias < 1 || quantidadeCobaias > 15)
                    System.out.println("Quantidade de cobais utilizadas deve ser um numero entre 1 e 15. Tente novamente.");

            } while (quantidadeCobaias < 1 || quantidadeCobaias > 15);

            do {
                cobaia = input.next().charAt(0);

                if (cobaia != 'S' && cobaia != 'R' && cobaia != 'C')
                    System.out.println("Tipo de cobaia invalido. Tente novamente.");

            } while (cobaia != 'S' && cobaia != 'R' && cobaia != 'C');

            testes[i] = new Teste(quantidadeCobaias, cobaia);
            contCobais += quantidadeCobaias;

            
        }

        for (Teste teste : testes) {
            if (cobaia == 'S')
                contSapo += teste.quantidadeCobaias;
            else if (cobaia == 'R')
                contRato += teste.quantidadeCobaias;
            else if (cobaia == 'C')
                contCoelho += teste.quantidadeCobaias;
            
        }

        percentualSapos = ((float) contSapo / contCobais) * 100;
        percentualRatos = ((float) contRato / contCobais) * 100;
        percentualCoelhos = ((float) contCoelho / contCobais) * 100;

        System.out.println("Total " + contCobais + " cobaias");
        System.out.println("Total de sapos: " + contSapo);
        System.out.println("Total de ratos: " + contRato);
        System.out.println("Total de coelhos: " + contCoelho);
        System.out.println("Percentual de sapos: %.2f" + percentualSapos + " %");
        System.out.println("Percentual de ratos: %.2f" + percentualRatos + " %");
        System.out.println("Percentual de coelhos: %.2f" + percentualCoelhos+ " %");

        input.close();
    }

}
