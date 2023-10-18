import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos{
    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNomne(){
        /* Aqui estaremos usando o TreeSet no lugar do HashSet, pois o TreeSet, permite ordenar os dados
            O TReeSet entende automaticamente que precisa usar o compareTo do Comparable implementado na 
            Classe Produto. Não utilizamos o Collections como sempre, pois ele faz apenas o uso de Listas
            Então podemos usar apenas Set para organizar um Set, neste caso o TreeSet.    
        */
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibiProdutosPorPreco(){
        Set<Produto> produtoPorPreco= new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }
    
}
