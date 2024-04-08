package Lista6;

import java.util.Scanner;
import java.lang.Character;

public class Ex4_Vogais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] letras = new char[10];
        int contConsoantes = 0;

        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        boolean ehVogal;

        char[] consoantes = new char[10];

        System.out.println("Informe 10 caracteres: ");
        for (int i = 0; i < letras.length; i++) {
            letras[i] = input.next().charAt(0);
            char letra = Character.toLowerCase(letras[i]);
            ehVogal = false;

            for (char vogal : vogais) {
                if (letra == vogal) {
                    ehVogal = true;
                    break;
                }
            }

            if (!ehVogal) {
                contConsoantes++;
                consoantes[contConsoantes - 1] = letra;
            }
        }

        System.out.println("Das letras informadas " + contConsoantes + " são consoantes.");
        System.out.println("Essas são as consoantes: ");
        for (int i = 0; i < contConsoantes; i++) {
            System.out.println(consoantes[i]);
        }

        input.close();

    }
}
