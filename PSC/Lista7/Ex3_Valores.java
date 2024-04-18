import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ex3_Valores {

    public enum Condicao {

        PARADA(-1);
    
        private final int valor;
    
        private Condicao(final int valor)
        {
            this.valor = valor;
        }
    
        public int getValor()
        {
            return this.valor;
        }
    
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> valores = new ArrayList<>();
        int entrada = 0;
        int somaValores = 0;
        int mediaValores = 0;
        int contMaiorMedia = 0;
        int contMenorQueSete = 0;

        System.out.println("Informe quantos valores de notas desejar: ");
        do 
        {
            entrada = input.nextInt();
            if (entrada != Condicao.PARADA.getValor())
                valores.add(entrada);

        } while (entrada != Condicao.PARADA.getValor());



        System.out.println("\nA quantidade de valores informados foi: " + valores.size());
        System.out.println(valores);

        Collections.reverse(valores);
        System.out.println("\n Os valores em ordem inversa sao: ");
        for (Integer valor : valores) 
        {
            System.out.println(valor);
            somaValores += valor;
        }

        mediaValores = somaValores / valores.size();

        System.out.println("\nA soma dos valores eh: " + somaValores);
        System.out.println("\nA media dos valores eh: " + mediaValores);

        for (Integer valor : valores) 
        {
            if (valor >= mediaValores)
                contMaiorMedia++;
            if (valor < 7)
                contMenorQueSete++;
        }

        System.out.println("\nA quantidade de valores acima da media eh: " + contMaiorMedia);
        System.out.println("\nA quantidade de valores abaixo de 7 eh: " +  contMenorQueSete);

        System.out.println("\n\n======= FIM =======");

        input.close();
    }
}
