package estudos_Java.Exer_04;
/*Escreva um programa que calcule e mostre a soma de todos os números pares entre 1 e 100. */
public class Main {
    public static void main(String[] args) {
        //Varoiaveis
        int i, total = 0;
        //Laço
        for(i=1;i<=100;i++ ){
            //Condicional
            if (i % 2 == 0){
                total+=i;
            }
        }
        System.out.printf("Valor da Soma de todos os pares entre 1 e 100: %d", total);
    }
}
