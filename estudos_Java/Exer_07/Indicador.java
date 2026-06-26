package estudos_Java.Exer_07;

import java.util.ArrayList;

public class Indicador {
    public int maior(ArrayList<Integer> numbers){
        int maior = numbers.get(0);
        for(Integer n : numbers){
            if ( n > maior){
                maior = n;
            }
        }
        return maior;
    }
    public int menor(ArrayList<Integer> numbers){
        int menor = numbers.get(0);
        for(Integer n : numbers){
            if ( n < menor){
                menor = n;
            }
        }
        return menor;
    }
}
