import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> setTarefas;

    public ListaTarefas(){
        setTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        setTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        for (Tarefa t : setTarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                setTarefas.remove(t);
                break;
            }
        }
    }

    public Set<Tarefa> exibirTarefas(){
        return setTarefas;
    }

    public int contarTarefas(){
        return setTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> setTarefasConcluidas = new HashSet<>();
        for (Tarefa t : setTarefas) {
            if(t.isStatus() == true){
                setTarefasConcluidas.add(t);
            }
        }
        return setTarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> setTarefasPendentes = new HashSet<>();
        for (Tarefa t : setTarefas) {
            if(t.isStatus() == false){
                setTarefasPendentes.add(t);
            }
        }
        return setTarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : setTarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setStatus(true);
                break;
            }
        }
    }

        public void marcarTarefaPendente(String descricao){
        for (Tarefa t : setTarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setStatus(false);
                break;
            }
        }
    }

    public void limparListaTarefas(){
        Set<Tarefa> setTarefasRemover = new HashSet<>();
        for (Tarefa t : setTarefasRemover) {
            setTarefasRemover.add(t);
        }
        setTarefas.removeAll(setTarefasRemover);
    }


    public static void main(String[] args) {
        ListaTarefas tarefasSetMain = new ListaTarefas();

        System.out.println("EXIBINDO TAREFAS");
        System.out.println(tarefasSetMain.exibirTarefas());
        
        System.out.println("ADICIONANDO TAREFAS...");
        tarefasSetMain.adicionarTarefa("Limpar a Casa");
        tarefasSetMain.adicionarTarefa("Estudar");
        tarefasSetMain.adicionarTarefa("Banho Cachorros");
        tarefasSetMain.adicionarTarefa("Assistir HXH");
        tarefasSetMain.adicionarTarefa("Preparar Bolo");
        tarefasSetMain.adicionarTarefa("Deveres");
        tarefasSetMain.adicionarTarefa("Separar Projeto");
        tarefasSetMain.adicionarTarefa("Curso Trabalho");
        tarefasSetMain.adicionarTarefa("Fofocar");
        tarefasSetMain.adicionarTarefa("Estudar");
        tarefasSetMain.adicionarTarefa("Estudar");

        System.out.println(tarefasSetMain.contarTarefas());

        System.out.println("EXIBINDO TAREFAS");
        System.out.println(tarefasSetMain.exibirTarefas());;

        System.out.println("REMOVENDO TAREFA...");
        tarefasSetMain.removerTarefa("Fofocar");

        System.out.println("MARCANDO AS TAREFAS CONCLUIDAS...");
        tarefasSetMain.marcarTarefaConcluida("Estudar");
        tarefasSetMain.marcarTarefaConcluida("Assistir HXH");
        tarefasSetMain.marcarTarefaConcluida("Banho Cachorros");
        tarefasSetMain.marcarTarefaConcluida("Limpar a Casa");

        System.out.println("MOSTRANDO TAREFAS CONCLUIDAS");
        System.out.println(tarefasSetMain.obterTarefasConcluidas());

        System.out.println("MARCANDO AS TAREFAS PENDENTES");
        tarefasSetMain.marcarTarefaPendente("Curso Trabalho");
        tarefasSetMain.marcarTarefaPendente("Deveres");
        tarefasSetMain.marcarTarefaPendente("Separar Projeto");
        tarefasSetMain.marcarTarefaPendente("Preparar Bolo");
        
        System.out.println("MOSTRANDO AS TAREFAS PENDENTES");
        System.out.println(tarefasSetMain.obterTarefasPendentes());
    }
}
