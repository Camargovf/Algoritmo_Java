package org.algoritmos.exercicios;

import java.util.Scanner;

public class exercicio06 {
    /**
     *
     (*) E.P.J. para receber o nome de um aluno com suas respectivas 2 notas, em seguida calcular a média do aluno e apresentar ao final a média calculada e a situação de Aprovação do aluno.
     (aprovado com média >= 6).

     (*) Utilizar o código para uma turma de 30 alunos.
     (*) Calcular e mostrar a média geral da turma
     (*) Mostrar a maior média da turma
     (*) Mostrar a menor média da turma

     */

    public static void main(String a[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        String aluno;
        float nota1, nota2, media, soma, mediaTurma;

        soma = 0;
        for(int i=0; i<3; i++)
        {
            System.out.print("Nome do Aluno: ");
            aluno = teclado.nextLine();
            System.out.print("Nota 1: ");
            nota1 = teclado.nextFloat();
            System.out.print("Nota 2: ");
            nota2 = teclado.nextFloat();
            teclado.nextLine();

            media = (nota1+nota2)/2;
            soma = soma + media;
            System.out.printf("Média do aluno é %.1f\n",  media);
            if (media >= 6)
                System.out.println("Aluno Aprovado. Parabéns.");
            else
                System.out.println("Reprovado! Estude mais.");
        }

        mediaTurma = soma/3;
        System.out.printf("Média da Turma = %.1f\n",  mediaTurma);

        teclado.close();
    }

}
