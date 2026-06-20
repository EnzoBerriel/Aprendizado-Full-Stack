package estudos_Java.Exer_02;
import java.util.Scanner;

/*Escreva um programa que leia três números e mostre qual é o maior deles. */

public class Main {
    public static void main(String[] args) {
        //Variaveis
        int[] lista = new int[3];
        int maior;
        //Abrindo Scanner
        Scanner rl = new Scanner(System.in);
        //Requerimentos
        for (int i=0; i<3;i++){
            System.out.printf("Digite o %d numero: ", i + 1);
            lista[i] = rl.nextInt() ;
        }
        //Fechando Scanner
        rl.close();
        //Criando objeto
        Maior objeto = new Maior();
        //método
        maior = objeto.getMaior(lista);
        //Resposta
        System.out.printf("O maior numero da Lista é %d", maior);
    }
}
