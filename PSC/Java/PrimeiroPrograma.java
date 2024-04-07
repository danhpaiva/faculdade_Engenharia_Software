import java.util.Scanner;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        
        Scanner entradaDoUsuario = new Scanner(System.in);
        String nome;

        System.out.println("Informe seu nome: ");
        nome = entradaDoUsuario.nextLine();

        System.out.println("O nome informado foi: " + nome);

        entradaDoUsuario.close();
    }
    
}
