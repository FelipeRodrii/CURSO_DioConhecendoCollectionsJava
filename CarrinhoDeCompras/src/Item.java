

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade ){
        this.nome= nome;
        this.preco= preco;
        this.quantidade= quantidade;
    }

    public String getNomeDoItem(){
        return nome;
    }

    public double getValorDoItens(){
        return preco;
    }

    public int getQuantidadeDoItens(){
        return quantidade;
    }

    public String mostrarItem(){
        return"Preço: "+ nome+" Valor: "+preco+" Un: "+quantidade;
    }
}
