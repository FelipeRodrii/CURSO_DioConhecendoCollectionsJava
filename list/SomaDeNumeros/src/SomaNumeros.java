import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listNumeros;
    
    public SomaNumeros(){
         listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listNumeros.add(numero);
    }
    public int calcularSoma(){
        int total=0;
        for (Integer i : listNumeros) {
            total += i;
        }
        return total;
    }
    public int encontrarMaiorNumero(){
        Collections.sort(listNumeros);
        int maior = (int) listNumeros.get(listNumeros.size()-1);
        return maior;
    }
    public int encontrarMenorNumero(){
        Collections.sort(listNumeros, Collections.reverseOrder());
        int menor = (int) listNumeros.get(listNumeros.size()-1);
        return menor;
    }
    public void exibirNumeros(){
        System.out.println(listNumeros);
    }
}
