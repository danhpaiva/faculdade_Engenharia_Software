package Lista2_Java;

/*Escreva um algoritmo que recebe dois pontos no plano cartesiano, P1=(x1,y1) e P2=(x2,y2)e calcula a distância 
entre eles, dada por d(P1,P2)=(x1-x2)2+(y1-y2)2 . */

import java.util.Scanner;

public class Ex14_DistanciaPontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;

        double distanciaEntrePontos = 0;

        System.out.println("Informe a posicao x do ponto 1: ");
        x1 = input.nextInt();

        System.out.println("Informe a posicao y do ponto 1: ");
        y1 = input.nextInt();

        System.out.println("Informe a posicao x do ponto 2: ");
        x2 = input.nextInt();

        System.out.println("Informe a posicao y do ponto 2: ");
        y2 = input.nextInt();

        distanciaEntrePontos = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

        System.out.println("A distancia entre os dois pontos e: " + distanciaEntrePontos);

        input.close();
    }

}
