import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        convidadoSet = new HashSet<>();
    }

    public void adicionandoConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    
   
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        for (Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite){
                convidadoSet.remove(c);
                break;
            }
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        for (Convidado c : convidadoSet) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " Convidados");

        conjuntoConvidados.adicionandoConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionandoConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionandoConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionandoConvidado("Convidado 4", 1236);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " Convidados");

    }
}
