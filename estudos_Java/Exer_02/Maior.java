package estudos_Java.Exer_02;

public class Maior {
    public int getMaior(int[] lista){
        int maior = 0;
        for ( int c : lista){
            if (c > maior){
                maior = c;
            }
        }
        return maior;
    }
}
