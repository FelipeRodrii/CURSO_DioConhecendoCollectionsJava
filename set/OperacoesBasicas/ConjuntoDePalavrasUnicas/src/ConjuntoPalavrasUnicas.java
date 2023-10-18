import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas(){
        palavrasUnicas = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }
    public void removerPalavra(String palavra){
        for (String p : palavrasUnicas) {
            if(p == palavra){
                palavrasUnicas.remove(p);
                break;
            }
        }
    }
    public void verificarPalavra(String palavra){
        for (String p : palavrasUnicas) {
            if(p == palavra){
                System.out.println("Palavra dentro do Conjunto !");
                break;
            }
        }
    }
    // Faz com que imprimirmos o conteuno de nossas variáveis 
    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas [palavrasUnicas=" + palavrasUnicas + "]";
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas);
    }
    // Hash para controlar a e validar a quantidade de itens, impedindo duplicatas
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavrasUnicas == null) ? 0 : palavrasUnicas.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (palavrasUnicas == null) {
            if (other.palavrasUnicas != null) {
                return false;
            }
        } else if (!palavrasUnicas.equals(other.palavrasUnicas)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas  conjuntoPalavras = new ConjuntoPalavrasUnicas();

        System.out.println("ADICIONANDO AS PALAVRAS...\n");
        conjuntoPalavras.adicionarPalavra("Avião");
        conjuntoPalavras.adicionarPalavra("Caixa");
        conjuntoPalavras.adicionarPalavra("Abobora");
        conjuntoPalavras.adicionarPalavra("Papel");
        conjuntoPalavras.adicionarPalavra("Carro");
        conjuntoPalavras.adicionarPalavra("Freio de mão");
        conjuntoPalavras.adicionarPalavra("Acelerador");
        conjuntoPalavras.adicionarPalavra("Computador");
        conjuntoPalavras.adicionarPalavra("LegTransito");
        conjuntoPalavras.adicionarPalavra("Racha");

        System.out.println("LISTA DE TODAS AS PALAVRAS");
        conjuntoPalavras.exibirPalavrasUnicas();

        System.out.println("VERIFIANDO SE A PALAVRA 'PAPEL' EXISTE");
        conjuntoPalavras.verificarPalavra("Papel");

        System.out.println("REMOVENDO A PALAVRA PAPEL");
        conjuntoPalavras.removerPalavra("Papel");

        System.out.println("VERIFICANDO SE PAPEL FOI REMOVIDO");
        conjuntoPalavras.exibirPalavrasUnicas();

    }
}
