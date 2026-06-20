package estudos_Java.Exer_05;

public class Contador {
    public int lenVogal(String str){
        char[] Vogais = {'a','e','i','o', 'u'};
        int total = 0;
        //Transformando para minusculo
        str = str.toLowerCase();
        for (char c : str.toCharArray()/*Tranformando em Array de Char*/){
            for (char v : Vogais){
                if (c == v){
                    total+=1;
                }
            }
        }
        return total;
    }
}
