
/*Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se 
passaram desde o início do dia (00:00). */

import java.util.Scanner;

public class Ex1_Minutos {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String hora;
        String[] tempo;
        Double horaParaMinuto;
        Double tempoTotal;

        System.out.println("Informe uma hora (separe com :)");
        hora = input.nextLine();

        tempo = hora.split(":");

        horaParaMinuto = Double.parseDouble(tempo[0]) * 60;

        tempoTotal = horaParaMinuto + Double.parseDouble(tempo[1]);

        System.out.println("Desde o ínicio do dia se passaram " + tempoTotal + " minutos.");

        input.close();


    }
}
