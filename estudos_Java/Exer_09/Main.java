/*4. Médio/Difícil — Matriz de Notas com Loops Aninhados
Tópicos: vetores (matriz), loops aninhados, tipos primitivos, condicionais
Contexto: Um professor quer organizar as notas de 4 alunos em 3 provas diferentes, usando uma matriz (vetor de duas dimensões), e calcular a média de cada aluno.
Tarefa:

Crie uma matriz double[][] notas de tamanho 4x3 e preencha com valores (pode ser fixo ou usando Math.random()).
Use loops aninhados (for dentro de for) para:

Calcular a média de cada aluno (some as 3 notas e divida por 3).
Use condicionais para classificar cada aluno como "Aprovado" (média ≥ 6.0) ou "Reprovado".


Exiba os resultados no formato: "Aluno 1: média 7.33 - Aprovado".
*/

package estudos_Java.Exer_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variaveis
        String[] nome = new String[4];
        Double[][] matriz = new Double[4][3];
        Double[] media = new Double[4];
        Double tot;
        //Abrindo Scanner
        Scanner rl = new Scanner(System.in);
        //Requerimentos
        for(int i=0;i<4;i++){
            System.out.printf("Digite o Nome do %d Aluno:",i+1);
            nome[i] = rl.nextLine();
            tot = 0.0;
            for(int c=0;c<3;c++){
                System.out.printf("%d Nota: ",c+1);
                matriz[i][c] = rl.nextDouble();
                tot+=matriz[i][c];
            }
            //Media
            media[i] = tot/3;
            //Buffer
            rl.nextLine();
        }
        //Fechando Scanner
        rl.close();
        //Resposta
        for (int i=0;i<4;i++){
            System.out.printf("Aluno: %s\nMédia: %.2f\n",nome[i],media[i]);
            if(media[i] >=6){
                System.out.printf("Situação: Aprovado");
            }
            else{
                System.out.printf("Situação: Reprovado");
            }
            System.out.printf("\n\n");
        }

    }
}
