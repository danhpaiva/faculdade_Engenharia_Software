import java.util.Scanner;
import java.util.ArrayList;

public class Ex4_Comissao {

    public enum Condicao {

        PARADA(-1);
    
        private final float valor;
    
        private Condicao(final float valor)
        {
            this.valor = valor;
        }
    
        public float getValor()
        {
            return this.valor;
        }
    
    }

    public static class Comissao {

        int id;
        int limiteInferior;
        int limiteSuperior;
        int contador;

        public Comissao (int id, int limiteInferior, int limiteSuperior, int contador)
        {
            this.id = id;
            this.limiteInferior = limiteInferior;
            this.limiteSuperior = limiteSuperior;
            this.contador = contador;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Comissao> contadores = new ArrayList<>();
        contadores.add(new Comissao(1, 200, 299, 0));
        contadores.add(new Comissao(2, 300, 399, 0));
        contadores.add(new Comissao(3, 400, 499, 0));
        contadores.add(new Comissao(4, 500, 599, 0));
        contadores.add(new Comissao(5, 600, 699, 0));
        contadores.add(new Comissao(6, 700, 799, 0));
        contadores.add(new Comissao(7, 800, 899, 0));
        contadores.add(new Comissao(8, 900, 999, 0));
        contadores.add(new Comissao(9, 1000, 100000000, 0));

        ArrayList<Double> vendas = new ArrayList<>();
        float entrada = 0;
        System.out.println("Informe o valor de vendas brutas dos vendedores na semana. ");
        System.out.println("Digite -1 para encerrar. ");
        do 
        {
            entrada = input.nextFloat();
            if (entrada != Condicao.PARADA.getValor())
            {
                double venda = (entrada * 0.09) + 200; 
                vendas.add(venda);
            }

        } while (entrada != Condicao.PARADA.getValor());

        for (Double valor : vendas) {

            for (int i = 0; i < contadores.size(); i++) 
            {
                if (valor >= contadores.get(i).limiteInferior && valor <= contadores.get(i).limiteSuperior)
                    contadores.get(i).contador++;
            }
        }

        for (int i = 0; i < contadores.size(); i++) 
        {
            System.out.println("Intervalo: R$" + contadores.get(i).limiteInferior + " - R$" + contadores.get(i).limiteSuperior + " | Numero de vendedores: " + contadores.get(i).contador);
        }

        input.close();
        
    }
}
