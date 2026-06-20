package estudos_Java.Exer_03;

/*Escreva um programa que leia um número e imprima a tabuada dele (de 1 a 10), usando um laço for. */

public class Tabuada {
    public void getTabuada(int num){
        for(int i=0;i<=10;i++){
            System.out.printf("%d x %d = %d\n",num,i,i*num);
        }
    }
}
