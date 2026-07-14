package estudos_Java.Exer_11;

import java.util.ArrayList;


public class Produto {
    //Atributos
    String nome;
    int quant;
    double preço;
    //Métodos
    public double subtotal(ArrayList<Produto> carrinho){
        //Variaveis
        double tot = 0;
        double parcial = 0;
        int quant_Itens = carrinho.size();
        //Introdução
        System.out.println("===== CUPOM FISCAL =====");
        //laço de Valores
        for(int i=0;i<quant_Itens;i++){
            Produto item = carrinho.get(i);
            parcial = item.preço * item.quant;
            tot +=parcial;
            System.out.printf("%s | %dx R$%.2f = R$%.2f\n\n",item.nome,item.quant,item.preço,parcial);
        }
        //Valor subtotal
        System.out.printf("Subtotal = R$%.2f\n",tot);
        //Desconto
        double desconto = 0;
        if(tot <= 100 && tot >= 50){
            // 5%
            desconto = tot * 0.05;
            //Resposta
            System.out.printf("Desconto(5%%): - R$%.2f",desconto);
        }
        if (tot > 100) {
            // 10%
            desconto = tot * 0.1;
            //Resposta
            System.out.printf("Desconto(10%%): - R$%.2f",desconto);
        }
        //Espaçamento
        System.out.println();
        //Aplicando Desconto
        tot -= desconto;
        //Retorno final
        System.out.printf("Total: R$%.2f\n",tot);
        return tot;
    }
}
