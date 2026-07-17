package estudos_Java.Exer_12;
/*private
:
String titular
,
String numeroConta
e
double saldo */
public class ContaBancaria {
    //Atributos
    private String titular;
    private String numConta;
    private double saldo;
    //Métodos Get
    public String getTitular() {
        return titular;
    }
    public String getNumConta() {
        return numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    //Metodos set
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //Metodos
    public void depositar(double valor){
        saldo+= valor;
    }
    public void sacar(double valor){
        if(valor > saldo || valor <= 0 ){
            throw new IllegalArgumentException("Valor Irregular para Operação");
        }
        saldo -= valor;
    }
    public void dadosConta(){
        System.out.printf("Titular: %s\nNumeração da Conta: %s\nSaldo: R$%.2f\n\n",getTitular(),getNumConta(),getSaldo());
    }
}
