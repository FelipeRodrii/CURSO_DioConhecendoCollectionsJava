import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    


    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
        ordenacaoPessoa.adicionarPessoa("Felipe", 24, 1.73);
        ordenacaoPessoa.adicionarPessoa("Giovana", 21, 1.68);
        ordenacaoPessoa.adicionarPessoa("Andrea", 21, 1.70);
        ordenacaoPessoa.adicionarPessoa("Korsica", 26, 1.74);
        ordenacaoPessoa.adicionarPessoa("Pepermint", 25, 1.65);

        System.out.println("ORGANIZAÇÃO POR IDADE");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        System.out.println("\n");
        System.out.println("ORGANIZAÇÃO POR ALTURA");

        System.out.println(ordenacaoPessoa.ordenarPorAltura());


    }
}
