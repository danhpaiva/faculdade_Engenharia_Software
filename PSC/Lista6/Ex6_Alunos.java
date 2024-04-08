package Lista6;

import java.util.Scanner;

class Aluno {

    public int id;
    public double media;

    public Aluno(int id, double media) {
        this.id = id;
        this.media = media;
    }
}

public class Ex6_Alunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Aluno[] alunos = new Aluno[10];
        int[] notas = new int[4];

        int somaNotas = 0;
        double media = 0.0;
        int contAlunoMediaMaiorQue7 = 0;

        
        System.out.println("Informe as 4 notas de 10 alunos: ");

        for (int i = 0; i < alunos.length; i++) 
        {
            for (int j = 0; j < notas.length; j++)
            {
                notas[j] = input.nextInt();
            }
            
            for (int nota : notas){
                somaNotas += nota;
            }

            media = (double)somaNotas / notas.length;
            alunos[i] = new Aluno(i, media); 
        }

        for (Aluno aluno : alunos) {
            if (aluno.media >= 7){
                contAlunoMediaMaiorQue7++;
            }
        }

        System.out.println("A quantidade de alunos com média maior ou igual a 7 é: " + contAlunoMediaMaiorQue7);

        input.close();
        
    }
    
}
