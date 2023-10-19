import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome= null;
        if(!agendaContatoMap.isEmpty()){
           numeroPorNome= agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Neste Map (Dicionário) ele não deixa chaves duplicatas, no caso quando adicionamos uma mesma chave ele apenas substitui o valor, e não deixa dois.
        agendaContatos.adicionarContato("Felipe", 972008066);
        agendaContatos.adicionarContato("Felipe", 954541880);
        agendaContatos.adicionarContato("Cintia", 986835044);
        agendaContatos.adicionarContato("Teves", 988542136);
        agendaContatos.adicionarContato("Caio", 972008635);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Teves");
        agendaContatos.exibirContatos();

        System.out.println("O numero é: "+ agendaContatos.pesquisarPorNome("Felipe"));

       

    }

}
