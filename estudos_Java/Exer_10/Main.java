/*5. Difícil — Sistema de Cadastro de Funcionários
Tópicos: ArrayList, vetores, casting, tipos primitivos, loops, condicionais (todos juntos)
Contexto: Uma empresa quer um pequeno sistema para gerenciar seus funcionários, calculando bônus e organizando informações por departamento.
Tarefa:

Crie uma classe Funcionario com atributos: String nome, int idade, double salario, String departamento.
Crie um ArrayList<Funcionario> e cadastre pelo menos 6 funcionários, distribuídos em 2 ou 3 departamentos diferentes.
Implemente as seguintes regras usando loops e condicionais:

Funcionários com salário menor que R$ 2.000,00 recebem 10% de bônus; os demais recebem 5%.
Some os salários (com bônus já aplicado) de cada departamento e armazene os totais em um vetor double[] (um índice para cada departamento).
Converta (cast) a idade média dos funcionários (que será double) para int, exibindo apenas a parte inteira.


No final, exiba:

Lista de funcionários com nome, salário final (com bônus) e departamento.
Total da folha de pagamento por departamento.
Idade média (em int) de todos os funcionários. */
package estudos_Java.Exer_10;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Lista
        ArrayList<Funcionario> Cadastrados = new ArrayList<>();
        //Variaveis
        int quant = 0;
        //Abrindo Scanner
        Scanner rl = new Scanner(System.in);
        //Requerimentos_1
        System.out.printf("Quantos funcionários serão cadastrados: ");
        quant = rl.nextInt();
        //Requerimento_2
        for(int i=0;i<quant;i++){
            //Criando Objeto
            Funcionario funcionario = new Funcionario();
            //Dados de Cadastro
            System.out.printf("Funcionário %d\n",i+1);
            System.out.printf("Digite o nome do funcionário: ");
            funcionario.nome = rl.next();
            System.out.printf("Digite a idade do funcionário: ");
            funcionario.idade = rl.nextInt();
            System.out.printf("Digite o salário do funcionário: ");
            funcionario.salario = rl.nextDouble();
            rl.nextLine();
            System.out.printf("Digite o departamento do funcionário: ");
            funcionario.departamento = rl.nextLine();
            System.out.printf("\n");
            //Armazenamento
            Cadastrados.add(funcionario);
        }
        //Fechando Scanner
        rl.close();
        //Método/Resposta
            //Criando objeto
        Funcionario funcionario = new Funcionario();
            //Dados Originais
        funcionario.dadosFunc(Cadastrados);
            //Dados Ajustados
        System.out.println("Novo ajuste:");
        funcionario.Ajuste(Cadastrados);
        funcionario.dadosFunc(Cadastrados);
            //Idade Média dos Funcionários
        System.out.println("Media ded idade dos Funcionários: "+funcionario.idadeMedia(Cadastrados));
            //Folha de Pagamento dos Departamentos
        System.out.println("Dados da Folha de Pagamento");
        funcionario.folhaPagamento(Cadastrados);
    }
}
