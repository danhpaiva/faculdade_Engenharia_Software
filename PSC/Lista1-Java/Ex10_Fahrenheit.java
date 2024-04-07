//Faça um programa que converta a temperatura dada em Fahrenheit para Celsius.  Para testar se a sua resposta está correta saiba que 100ºC = 212F. Considere C/5 = (F-32)/9

import java.util.Scanner;

public class Ex10_Fahrenheit{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double temperaturaFahrenheit = 0.0;
        Double temperaturaCelsius = 0.0;

        System.out.println("Informe a temperatura em Fahrenheit: ");
        temperaturaFahrenheit = input.nextDouble();

        temperaturaCelsius = 5 * ((temperaturaFahrenheit - 32)/9);

        System.out.printf("A temperatura informada em Celsius eh: %.0fCº", temperaturaCelsius);

        input.close();
    }
}
