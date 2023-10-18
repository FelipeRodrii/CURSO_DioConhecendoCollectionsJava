import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> conjuntoContatos;

    public AgendaContatos() {
        conjuntoContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        conjuntoContatos.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(conjuntoContatos);
    }

    public void pesquisarPorNome(String nome){
        for (Contato c : conjuntoContatos) {
            if(c.getNome().equalsIgnoreCase(nome)){
                System.out.println("Contato:"+c.getNome()+" Numero: "+ c.getNumeroTelefone());
                break;
            }
        }
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        for (Contato c : conjuntoContatos) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                break;
            }   
        }
    }

    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContato();

       agendaContatos.pesquisarPorNome("Camila");
    }
}
