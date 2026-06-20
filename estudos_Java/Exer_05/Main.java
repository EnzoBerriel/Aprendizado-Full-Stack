package estudos_Java.Exer_05;

import java.util.Scanner;

/*Escreva um programa que leia uma palavra (String) digitada pelo usuário e conte quantas vogais ela possui. */
public class Main {
    public static void main(String[] args) {
        //Variaveis
        String str;
        int quant_Vogal;
        //Abrindo Scanner
        Scanner rl = new Scanner(System.in);
        //Requerimentos
        System.out.printf("Digite uma palavra: ");
        str = rl.nextLine();
        //Fechando Scanner
        rl.close();
        //Criando objeto
        Contador count = new Contador();
        //método
        quant_Vogal = count.lenVogal(str);
        //Resposta
        System.out.printf("A palavra %s possui %d vogais.",str, quant_Vogal);
    }
}
