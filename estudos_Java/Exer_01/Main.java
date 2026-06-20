package estudos_Java.Exer_01;

import java.util.Scanner;

/*Escreva um programa que leia um número inteiro e diga se ele é par ou ímpar. */
public class Main {
    public static void main(String[] args) {
        //Variaveis
        int num;
        //Abrindo Scanner
        Scanner rl = new Scanner(System.in);
        //Requerimentos
        System.out.println("Digite um numero: ");
        num = rl.nextInt();
        //Fechando Scanner
        rl.close();
        //Condicional/Resposta
        if (num % 2 == 0){
            System.out.print("O numero é par!!!");
        }
        else{
            System.out.print("O numero é ímpar!!!");
        }
        
    }
}
