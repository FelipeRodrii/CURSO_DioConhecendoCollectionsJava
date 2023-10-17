import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    private List<Integer> listNumeros;

    public OrdenacaoNumeros(){
        listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listNumeros.add(numero);
    }

    public void ordenarAscendente(){
        Collections.sort(listNumeros);
        System.out.println(listNumeros);

    }

    public void ordenarDescendente(){
        Collections.sort(listNumeros, Collections.reverseOrder());
        System.out.println(listNumeros);
    }
}