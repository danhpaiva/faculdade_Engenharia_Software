package Lista3;

import java.util.Scanner;

public class Ex2_Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int referencia = 0;

        System.out.print("Informe o numero que voce deseja ver a tabuada: ");
        referencia = input.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(referencia * i);
        }

        input.close();
    }
}
