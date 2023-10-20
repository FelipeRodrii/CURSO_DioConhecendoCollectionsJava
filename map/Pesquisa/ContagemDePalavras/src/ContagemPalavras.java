import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //Atributos
    Map<String, Integer> contagemPalavras;

    public ContagemPalavras(){
        contagemPalavras = new HashMap();

       
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        contagemPalavras.remove(palavra);
    }

    public Map<String, Integer> exibirContagemPalavras(){
        return contagemPalavras;
    }

    public String encontrarPalavraMaisFrequente(){
       String palavraMaiorQuantidade= null;
       int maiorQuantidade= 0;
       if(!contagemPalavras.isEmpty()){
            for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
                String palavra= entry.getKey();
                int quantidade= entry.getValue();

                if(quantidade > maiorQuantidade){
                    palavraMaiorQuantidade = palavra;
                    maiorQuantidade = quantidade;
                }
            }
        }
        if(palavraMaiorQuantidade != null){
            return "A palavra que mais apareceu foi:" + palavraMaiorQuantidade + " Aparecendo:"+ maiorQuantidade +" Vezes";
        }else{
            return null;
        }
    }



    public static void main(String[] args) {
        ContagemPalavras contadorpalavras = new ContagemPalavras();

        System.out.println("ADICIONANDO PALAVRAS...\n");
        contadorpalavras.adicionarPalavra("Calor", 8);
        contadorpalavras.adicionarPalavra("Radiação", 10);
        contadorpalavras.adicionarPalavra("Reação", 12);
        contadorpalavras.adicionarPalavra("Teste", 3);
        contadorpalavras.adicionarPalavra("Nuclear", 9);
        contadorpalavras.adicionarPalavra("Explosão", 1);

        System.out.println("EXIBINDO TODAS AS PALAVRAS ADICIONADAS");
        System.out.println(contadorpalavras.exibirContagemPalavras());

        System.out.println("\nMOSTRANDO PALAVRA COM MAIOR NUMERO DE OCORRÊNCIAS");
        System.out.println( contadorpalavras.encontrarPalavraMaisFrequente());

        System.out.println("\nREMOVENDO A PALAVRA MAIS FREQUENTE...\n");
        contadorpalavras.removerPalavra("Reação");

        System.out.println("MOSTRANDO A NOVA PALAVRA QUE ESTÁ SENDO A MAIS RECENTE AGORA");
        System.out.println(contadorpalavras.encontrarPalavraMaisFrequente());
    }
}

