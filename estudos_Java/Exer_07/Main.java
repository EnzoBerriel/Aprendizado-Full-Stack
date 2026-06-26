/*Contexto: Uma loja registrou as vendas diárias da semana em um vetor de inteiros e quer saber qual foi o melhor e o pior dia de vendas.
Tarefa:

Crie um vetor int[] vendas com 7 valores (um para cada dia da semana).
Use um for para percorrer o vetor.
Dentro do loop, use condicionais (if) para identificar o maior e o menor valor.
No final, exiba: "Maior venda: X" e "Menor venda: Y", junto com a posição (dia) em que ocorreram.
 */
package estudos_Java.Exer_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variaveis
        ArrayList<Integer> Vendas = new ArrayList<>();
        String[] week_Days ={"Segunda","Terça","Quarta","Quinta","Sexta","Sábado","Domingo"};
        int maior,menor;
        //Abrindo Scanner
        Scanner rl = new Scanner(System.in);
        //Requerimentos
        for (int i=0;i<7;i++){
            System.out.printf("%s quantidade vendas: ", week_Days[i]);
            Vendas.add(rl.nextInt());
        }
        //Fechando Scanner
        rl.close();
        //Criando objeto
        Indicador ind = new Indicador();
        //Método
        maior = ind.maior(Vendas);
        menor = ind.menor(Vendas);
        //Resposta
        System.out.printf("A maior quantidade de vendas foi %d, %s.\n",maior, week_Days[Vendas.indexOf(maior)]);
        System.out.printf("A menor quantidade de vendas foi %d, %s.", menor, week_Days[Vendas.indexOf(menor)]);
    }
}
