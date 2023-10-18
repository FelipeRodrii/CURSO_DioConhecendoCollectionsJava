import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos(){
        alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double nota){
        alunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(int matricula){
        for (Aluno a : alunos) {
            if(a.getMatricula() == matricula){
                alunos.remove(a);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> nomesOrdemAlfabetica = new TreeSet<>(alunos);
        return nomesOrdemAlfabetica;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosOrdemNotas = new TreeSet<>(new ComparadorNota());
        alunosOrdemNotas.addAll(alunos);
        return alunosOrdemNotas;
    }

    public Set<Aluno> exibirAlunos(){
        return alunos;
    }

    public static void main(String[] args) {
        GerenciadorAlunos listaAlunos = new GerenciadorAlunos();

        System.out.println("MOSTRANDO TODOS OS ALUNOS");
        System.out.println(listaAlunos.exibirAlunos());

        System.out.println("ADICIONANDO NOMES... \n");
        listaAlunos.adicionarAluno("Felipe", 129849, 10);
        listaAlunos.adicionarAluno("Giovana", 129850, 10);
        listaAlunos.adicionarAluno("Andrea", 129851, 100);
        listaAlunos.adicionarAluno("Zeus", 129852, 6);
        listaAlunos.adicionarAluno("Caio", 129853, 4);
        listaAlunos.adicionarAluno("Cintia", 129854, 9);
        listaAlunos.adicionarAluno("Haroldo", 129855, 7);
        listaAlunos.adicionarAluno("Jean", 129856, 8);
        listaAlunos.adicionarAluno("Gabriela", 129856, 9.5);
        listaAlunos.adicionarAluno("Cristiano", 129857, 0);

        System.out.println("\nMOSTRANDO TODOS OS ALUNOS");
        System.out.println(listaAlunos.exibirAlunos());

        System.out.println("\nEXIBINDO ALUNOS EM ORDEM ALFABETICA");
        System.out.println(listaAlunos.exibirAlunosPorNome());

        System.out.println("\nEXIBINDO ALUNOS POR NOTA");
        System.out.println(listaAlunos.exibirAlunosPorNota());

        System.out.println("\nREMOVENDO ALUNO CAIO");
        listaAlunos.removerAluno(129853);

        System.out.println("\nMOSTRANDO LISTA ATUALIZADA DE ALUNOS");
        System.out.println(listaAlunos.exibirAlunosPorNome());
    }

}
