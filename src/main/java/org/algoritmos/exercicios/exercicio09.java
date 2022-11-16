package org.algoritmos.exercicios;

// EPJ para receber os nomes dos 5 candidatos a líder de turma,
// em seguida receber os votos dos alunos existentes na sala, e ao final mostrar o total de votos de cada candidato e ainda o candidato vencedor da eleição.

import java.util.Scanner;

public class exercicio09 {
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        String candidato[] = new String[5];
        int votos[] = new int[5];
        int votacao, totalVotos, maiorVotacao;
        for (int i=0; i<5; i++)
        {
            votos[i] = 0;
            System.out.print("Candidato "+(i+1)+": ");
            candidato[i] = sc.nextLine();
        }
        totalVotos = 0;

        do {
            System.out.print("Digite seu voto: ");
            votacao = sc.nextInt();
            if (votacao > 0 && votacao < 6)
            {
                votos[votacao-1]++;
                totalVotos++;
            }
            else
            {
                if (votacao != 0)
                {
                    System.out.println("Voto Inválido!");
                }
            }
        } while (votacao != 0);

        for (int i=0; i<5; i++)
        {
            System.out.printf("Candidato %s teve %d votos\n",
                    candidato[i], votos[i]);
        }

        System.out.printf("Total de Votos da Eleição: %d\n",
                totalVotos);

        maiorVotacao = votos[0];
        for (int i=0; i<5; i++)
        {
            if (votos[i] > maiorVotacao)
                maiorVotacao = votos[i];
        }


        System.out.println("Candidato(s) Vencedor(es) da Eleição:");
        for (int i=0; i<5; i++)
        {
            if (votos[i] == maiorVotacao)
                System.out.println(candidato[i]);
        }

        sc.close();
    }
}