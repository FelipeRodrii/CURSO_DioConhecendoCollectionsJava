import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  //Atributos
  Map<String, String> palavraDefinicao;

  public Dicionario(){
    palavraDefinicao = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao){
    palavraDefinicao.put(palavra, definicao);
  }

  public void removerPalavra(String palavra){
    palavraDefinicao.remove(palavra);
  }

  public Map<String, String> exibirPalavras(){
    return palavraDefinicao; 
  }

  public String pesquisarPorPalavra(String palavra){
    String definicaoPalavra = null;
    if(!palavraDefinicao.isEmpty()){
        definicaoPalavra= palavraDefinicao.get(palavra);
    }
    return definicaoPalavra;
  }


  public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();

    System.out.println("EXIBINDO PALAVRAS...");
    dicionario.exibirPalavras();
    System.out.println("\nADICIONANDO PALAVRAS E SUAS DEFINIÇÕES...");
    dicionario.adicionarPalavra("Opulencia", "Excesso de Riqueza");
    dicionario.adicionarPalavra("Hipocrita", "Aquele que Comete o ato que condena");
    dicionario.adicionarPalavra("Carro", "Veiculo Automotivo");
    dicionario.adicionarPalavra("Pobreza", "Fatal daquilo que pe necessário");
    dicionario.adicionarPalavra("Escassez", "Falta de um bem ou serviço");

    System.out.println("\nEXIBINDO PALAVRAS...");
    System.out.println(dicionario.exibirPalavras());

    System.out.println("\nPROCURANDO A PALAVRA OPULÊNCIA....");
    System.out.println(dicionario.pesquisarPorPalavra("Opulencia"));

  }

}
