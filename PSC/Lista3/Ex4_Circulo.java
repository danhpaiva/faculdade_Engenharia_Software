package Lista3;


import java.util.Scanner;

public class Ex4_Circulo {

    private static void VolumeCirculo (float raio)
    {
        System.out.printf("O volume do circulo e: %.2f", 4.0/3 * (Math.PI * Math.pow(raio, 3)));
    }

    private static void AreaCirculo (float raio)
    {
        System.out.printf("O area do circulo e: %.2f", (Math.PI * Math.pow(raio, 2)));
    }

    private static void PerimetroCirculo (float raio)
    {
        System.out.printf("O perimetro do circulo e: %.2f", (2 * Math.PI * raio));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int operacao = 0;
        float raioCirculo = 0;

        System.out.println("Informe o código da operação: ");
        System.out.println("\n1 - Perimetro do Circulo ");
        System.out.println("\n2 - Area do Circulo ");
        System.out.println("\n3 - Volume do Circulo\n ");
        operacao = input.nextInt();

        System.out.println("Informe o raio do circulo: ");
        raioCirculo = input.nextFloat();

        switch (operacao) {
            case 1:
                PerimetroCirculo (raioCirculo);
                break;

            case 2:
                AreaCirculo (raioCirculo);
                break;

            case 3:
                VolumeCirculo (raioCirculo);
                break;
        
            default:
                System.out.println("O codigo de operacao e invalido.");
                break;
        }

        input.close();

    }

    


}
