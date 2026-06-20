package estudos_Java.Exer_03;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //Variaveis
        int num;
        //Abrindo Scanner
        Scanner rl = new Scanner(System.in);
        //Requerimentos
        System.out.print("Digite um número:");
        num = rl.nextInt();
        //Fechando Scanner
        rl.close();
        //Crinado Objeto
        Tabuada TB = new Tabuada();
        //Método/Resposta
        TB.getTabuada(num);
    }
}