package estudos_Java.Exer_12;
/*Um banco precisa de uma classe que represente uma conta corrente. Os dados internos não devem ser acessados
 diretamente — apenas por métodos controlados, que validam as operações antes de executá-las. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variaveis
        String titular;
        String numConta;
        double saldo;
        int condition;
        //Criando objeto
        ContaBancaria conta = new ContaBancaria();
        //Abrindo Scanner
        Scanner rl = new Scanner(System.in);
        //Requerimento
        System.out.printf("Titular: ");
        titular = rl.next();
        System.out.printf("Numeração da Conta: ");
        numConta = rl.next();
        System.out.printf("Saldo: R$");
        saldo = rl.nextDouble();
        //Acrest. objeto
        conta.setTitular(titular);
        conta.setNumConta(numConta);
        conta.setSaldo(saldo);
        //Espaçamento
        System.out.println("\n");
        //Operação
        while(true){
            //dados
            conta.dadosConta();
            //ações
            System.out.printf("Digite:\n0 - Depositar\n1 - Sacar\n2 - Sair\nR:");
            condition = rl.nextInt();
            if (condition == 0) {
                System.out.printf("Quanto deseja Depositar: ");
                conta.depositar(rl.nextDouble());
            }
            else if (condition == 1){
                try{
                    System.out.printf("Quanto deseja Sacar: ");
                    conta.sacar(rl.nextDouble());
                } catch (IllegalArgumentException e) {
                    System.err.println("Erro: " + e.getMessage()); // captura e exibe, não derruba
                }
            }
            else if(condition == 2){
                System.out.println("Obrigado");
                break;
            }
            else{
                System.err.println("Erro Digite Novamente");
            }
            //Espaçamento
            System.out.println("\n");
        }
        //Fechando Scanner
        rl.close();
    }
}
