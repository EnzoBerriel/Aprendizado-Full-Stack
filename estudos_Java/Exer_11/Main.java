package estudos_Java.Exer_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criando Array
        ArrayList<Produto> carrinho = new ArrayList<Produto>();
        //Variaveis
        int quant = 0;
        double tot = 0;
        double pago = 0;
        //Abrindo Scanner
        Scanner rl = new Scanner(System.in);
        //Requerimento
        System.out.printf("Digite quantos produtos o caixa possui: ");
        quant = rl.nextInt();
        //Cadastro
        for(int i=0;i<quant;i++){
            //Criando objeto
            Produto produto = new Produto();
            //Requerimento de items
            System.out.printf("Produto: ");
            produto.nome = rl.next();
            System.out.printf("quantidade: ");
            produto.quant = rl.nextInt();
            System.out.printf("Valor: R$");
            produto.preço = rl.nextDouble();
            //adicionado ao Array
            carrinho.add(produto);
            //Espaçamento
            System.out.println("\n");
        }
        //Valor pago
        System.out.printf("Quanto será pago: ");
        pago = rl.nextDouble();
        //Fechando Scanner
        rl.close();
        //Reinicialização
        Produto pd = new Produto();
        //Método
        tot = pd.subtotal(carrinho);
        //saldo
        System.out.printf("Saldo: R$ %.2f",pago - tot);
    }
}
/*Você vai construir um mini-sistema de checkout que gerencia produtos, aplica descontos e gera um cupom fiscal simples.

Contexto
Um pequeno mercado precisa de um sistema de caixa básico. O caixa insere uma lista de produtos comprados, cada um com nome, quantidade e preço unitário. O sistema deve calcular o subtotal de cada item, aplicar descontos por faixa de valor total, exibir o cupom e informar o troco.

Tópicos abordados
ArrayList
casting
tipos primitivos
loops
condicionais
vetores
O que você deve implementar
1
Crie uma classe Produto com os atributos String nome, int quantidade e double precoUnitario. Adicione um método subtotal() que retorna quantidade * precoUnitario.

2
No main, crie um ArrayList<Produto> e popule com pelo menos 5 produtos diferentes (ex: arroz, feijão, leite, macarrão, óleo).

3
Use um for-each para percorrer a lista, exibir cada item no formato nome | qtd x R$ preço = R$ subtotal e acumular o total em uma variável double.

4
Aplique desconto com if / else if / else: total abaixo de R$ 50 → sem desconto; entre R$ 50 e R$ 100 → 5% de desconto; acima de R$ 100 → 10% de desconto. Armazene a porcentagem em uma variável int desconto (use casting).

5
Receba o valor pago pelo cliente em um vetor double[] pagamento = {50.0, 60.0} (simulando duas notas). Use um for para somar o vetor e calcular o troco. Se o troco for negativo, exiba "Valor insuficiente!".

Exemplo de saída esperada
// console output

===== CUPOM FISCAL =====

Arroz | 2x R$5,50 = R$11,00

Feijão | 1x R$8,90 = R$8,90

Leite | 3x R$4,20 = R$12,60

Macarrão | 2x R$3,75 = R$7,50

Óleo | 1x R$14,90 = R$14,90

------------------------

Subtotal: R$54,90

Desconto (5%): -R$2,74

Total: R$52,16

Pago: R$110,00

Troco: R$57,84

======================== */