/*Você está criando um pequeno sistema de monitoramento climático 
para uma estação de pesquisa. Os sensores enviam a temperatura em 
Celsius como double, mas o sistema de exibição antigo só aceita valores inteiros (int).
 */
/*Tarefa:
Crie uma variável double temperaturaCelsius com um valor decimal (ex: 23.7).
Converta (faça o casting) para int e armazene em outra variável.
Use uma estrutura condicional para classificar a temperatura (depois de convertida) em:
< 10 → "Frio"
10 a 25 → "Agradável"
> 25 → "Calor"
Exiba o valor original, o valor convertido e a classificação. */
package estudos_Java.Exer_06;
public class Main {
    public static void main(String[] args) {
        //Variavel Inicial
        double temperaturaCelsius = 23.7;
        //Casting Implícito
        int temperaturaINT = (int) temperaturaCelsius;
        //Condicional
        if (temperaturaINT < 10){
            System.out.printf("A condição do clima está fria");
        }
        else if (temperaturaINT < 25) {
            System.out.printf("A condição do clima está Agradável");
        }
        else{
            System.err.printf("A condição do clima está Calor");
        }
    }  
}