/*Tópicos: ArrayList, loops, condicionais, casting (opcional)
Contexto: Você está desenvolvendo um app simples de lista de compras, onde cada item tem um nome e um preço.
Tarefa:

Crie uma classe simples Produto com atributos String nome e double preco.
Crie um ArrayList<Produto> e adicione pelo menos 5 produtos.
Percorra a lista com um for (ou for-each) e:

Calcule o valor total da compra (soma de todos os preços).
Use condicionais para exibir apenas os produtos com preço acima de um valor X (ex: R$ 20,00).
*/

package estudos_Java.Exer_08;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Variaveis
        ArrayList<Produto> lista = new ArrayList<>();
        double tot = 0;
        int quant;
        //Abrindo Scanner
        Scanner rl = new Scanner(System.in);
        //Requerimento
        System.out.printf("Quantos produtos serão Registrados: ");
        quant = rl.nextInt();
        rl.nextLine();
        for(int i=0;i<quant;i++){
            //Criando objeto
            Produto object = new Produto();
            //Produto
            System.out.printf("Nome do %d Produto: ",i+1);
            object.nome = rl.nextLine();
            System.out.printf("Preço de %s: R$",object.nome);
            object.preço = rl.nextDouble();
            //Espaçamento
            System.out.println();
            rl.nextLine();
            //Lista
            lista.add(object);
        }
        //Fechando Scanner
        rl.close();
        //Calculo
        for(int i=0;i<quant;i++){
            Produto object = lista.get(i);
            tot += object.preço;
            if (object.preço >= 20){
                System.out.printf("Valor de %s maior que R$20.\n",object.nome);
            }
        }
        //Resposta
        System.out.println("O valor total da Compra é "+tot);
    }
}
