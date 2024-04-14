package Lista2;

import java.util.Scanner;

public class Ex5_Palindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String palavra = null;

        System.out.println("Digite uma palavra para verificar se é um palíndromo:");
        palavra = input.nextLine().toLowerCase();

        int i = 0;
        int j = palavra.length() - 1;
        
        while (i < j) {
            if (palavra.charAt(i) != palavra.charAt(j)) {
                System.out.println("Não é um palíndromo.");
                System.exit(0);
            }
            i++;
            j--;
        }
        
        System.out.println("É um palíndromo!");
        
        input.close();
    }
}

