

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Atributos
   private List<Item> listaItens;
   private double total;
   private int quant;

   public CarrinhoDeCompras(){
        this.listaItens = new ArrayList<>();
   }

   public void adicionarItem(String nome, double preco, int quantidade){
         listaItens.add(new Item(nome, preco, quantidade));

   }

   public void removerItem(String nome){
      List<Item> itensParaRemover = new ArrayList<>();
      for (Item i : listaItens) {
         if(i.getNomeDoItem().equalsIgnoreCase(nome)){
            itensParaRemover.add(i);
         }
      }
      listaItens.removeAll(itensParaRemover);
   }

   public String calcularValorTotal(){
      total=0;
      quant=0;
         for (Item i : listaItens) {
         total += (i.getValorDoItens()*i.getQuantidadeDoItens());
         quant += i.getQuantidadeDoItens();
      }
         
       return "Valor total: "+total+"\nQuantidade de Itens: "+ quant;
   }

   public void exibirItens(){
      for (Item i : listaItens) {
         System.out.println(i.mostrarItem());
      }
   } 


   public static void main(String[] args) {
      CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();

      meuCarrinho.adicionarItem("Leite", 4.70, 6);
      meuCarrinho.adicionarItem("Coca-Cola", 4.20, 8);
      meuCarrinho.adicionarItem("Bolacha", 2.45, 6);
      meuCarrinho.adicionarItem("Arroz 5Kg", 5.00, 1);
      meuCarrinho.adicionarItem("Carne-Moída 2Kg", 30.49, 1);

      meuCarrinho.exibirItens();
      System.out.println(meuCarrinho.calcularValorTotal());

      meuCarrinho.removerItem("Bolacha");
      System.out.println("\nCALCULO TOTAL (APÓS REMOÇAO DA BOLACHA)");
      meuCarrinho.exibirItens();
      System.out.println(meuCarrinho.calcularValorTotal());

   }

}
