package estudos_Java.Exer_10;

import java.util.ArrayList;

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
public class Funcionario {
    //Atributos
    String nome;
    int idade;
    double salario;
    String departamento;
    //Métodos
    public void Ajuste(ArrayList<Funcionario> Cadastrados){
        //Variaveis
        double salario = 0;
        int quant = Cadastrados.size();
        //Execução de Função
        for(int i=0;i<quant;i++){
            Funcionario fc = Cadastrados.get(i);
            salario = fc.salario;
            if (salario < 2000){
                salario = salario + (salario/10);
            }
            else{
                salario = salario + (salario/20);
            }
            fc.salario = salario;
        }
    }
    public void folhaPagamento(ArrayList<Funcionario> Cadastrados){
        ArrayList<String> DP = new ArrayList<String>();
        ArrayList<Double> FP = new ArrayList<Double>();
        int quantCDT = Cadastrados.size();
        double valorAtual;
        //Execução de Função
        for(int i=0;i<quantCDT;i++){
            //Reiniciando Valor
            int verificador = 0;
            Funcionario fc = Cadastrados.get(i);
            //Verificando em lista
            for(int j=0;j<DP.size();j++){
                if(fc.departamento.equals(DP.get(j))){
                    verificador = 1;
                    valorAtual = FP.get(j);
                    valorAtual += fc.salario;
                    FP.set(j, valorAtual);
                    break;
                }
            }
            if(verificador == 0){
                DP.add(fc.departamento);
                FP.add(fc.salario);
            }
        }
        //Resposta
        for(int i=0;i<DP.size();i++){
            System.out.printf("Departamento: %s\nFolha de Pagamento: R$%.2f",DP.get(i),FP.get(i));
            System.out.printf("\n\n");
        }
    }
    public void dadosFunc(ArrayList<Funcionario> Cadastrados){
        int quant = Cadastrados.size();
        //Execução de Função
        for(int i=0;i<quant;i++){
            Funcionario fc = Cadastrados.get(i);
            System.out.printf("Nome: %s\nSalário: %.2f\nDepartamento: %s",fc.nome,fc.salario,fc.departamento);
            System.out.printf("\n\n");
        }
    }
    public double idadeMedia(ArrayList<Funcionario> Cadastrados){
        double totIdade = 0, media;
        int quant = Cadastrados.size();
        for(int i=0;i<quant;i++){
            Funcionario FC = new Funcionario();
            totIdade += FC.idade;
        }
        media = totIdade/quant;
        return media;
    }
}
