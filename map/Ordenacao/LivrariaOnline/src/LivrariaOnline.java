import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    // Atributos
    Map<String, Livro> listaLivros;

    public LivrariaOnline(){
        listaLivros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        listaLivros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        if(!listaLivros.isEmpty()){
            for (Livro l : listaLivros.values()) {
                if(l.getTitulo() == titulo){
                    listaLivros.remove(l);
                }
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        Map<String, Livro> listaOrdenadaPreco = new TreeMap<>(listaLivros);
        return listaOrdenadaPreco;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> listaLivroAutor = new HashMap();
        if(!listaLivros.isEmpty()){
            for (Map.Entry<String, Livro> l : listaLivros.entrySet()) {
                if(l.getValue().getAutor() == autor){
                    listaLivroAutor.put(l.getKey(), l.getValue());
                }

            }
        }
        return listaLivroAutor;
    }

    public String obterLivroMaisCaro(){
        double maiorPreco = 0;
        String linkMaiorPreco = null;
        String tituloMaiorPreco= null;
        String autorMaiorPreco = null;

        Map<String, Livro> listaOrdenadaPreco = new TreeMap<>(listaLivros);
        if(!listaOrdenadaPreco.isEmpty()){
            for (Map.Entry<String, Livro> l : listaOrdenadaPreco.entrySet()) {
                if(maiorPreco < l.getValue().getPreco()){
                    maiorPreco= l.getValue().getPreco();
                    tituloMaiorPreco= l.getValue().getTitulo();
                    autorMaiorPreco= l.getValue().getAutor();
                    linkMaiorPreco= l.getKey();
                }
            }
        }
        return "O Livro mais caro atualmente é  o: "+tituloMaiorPreco+" Do autor: "+autorMaiorPreco+" No valor de: "+ maiorPreco+ "\nAcesso via:"+ linkMaiorPreco;
    }

    public String exibirLivroMaisBarato(){
        double menorPreco =100;
        String linkMenorPreco = null;
        String tituloMenorPreco= null;
        String autorMenorPreco = null;

        Map<String, Livro> listaOrdenadaPreco = new TreeMap<>(listaLivros);
        if(!listaOrdenadaPreco.isEmpty()){
            for (Map.Entry<String, Livro> l : listaOrdenadaPreco.entrySet()) {
                if(menorPreco > l.getValue().getPreco()){
                    menorPreco= l.getValue().getPreco();
                    tituloMenorPreco= l.getValue().getTitulo();
                    autorMenorPreco= l.getValue().getAutor();
                    linkMenorPreco= l.getKey();
                }
            }
        }
        return "O Livro mais Barato atualmente é  o: "+tituloMenorPreco+" Do autor: "+autorMenorPreco+" No valor de: "+ menorPreco+ "\nAcesso via:"+linkMenorPreco;
    }


    public static void main(String[] args) {
        LivrariaOnline saraiva = new LivrariaOnline();

        System.out.println("ADICIONANDO LIVROS...");
        saraiva.adicionarLivro("https://www.amazon.com.br/dp/6553932816/ref=s9_acsd_ri_bw_c2_x_0_t?pf_rd_m=A3RN7G7QC5MWSZ&pf_rd_s=merchandised-search-6&pf_rd_r=EKPYNF8540PF5XE6VKWS&pf_rd_t=101&pf_rd_p=b48b103a-7c68-46e4-8839-333f56c21a10&pf_rd_i=6740748011", "A mulher em mim (Pré-venda com camiseta exclusiva)", "Britney Spears", 119.90);
        saraiva.adicionarLivro("https://www.amazon.com.br/guia-definitivo-mochileiro-das-gal%C3%A1xias/dp/8530601491/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=3ECSOC95ZE3UV&keywords=guia+do+mochileiro+das+gal%C3%A1xias&qid=1697835502&s=books&sprefix=guia+do+mochileiro+das+galaxias%2Cstripbooks%2C200&sr=1-1&ufe=app_do%3Aamzn1.fos.6d798eae-cadf-45de-946a-f477d47705b9", "O guia definitivo do mochileiro das galáxias", "Douglas Adams", 103.92);
        saraiva.adicionarLivro("https://www.amazon.com.br/Trono-vidro-Vol-Sarah-Maas/dp/8501401382/ref=sr_1_4?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=2SJAXTNXB23W9&keywords=trono+de+vidro&qid=1697835684&sprefix=trono+de+vidr%2Caps%2C205&sr=8-4", "Trono de vidro (vol. 1)", "Sarah J. Maas", 50.92);
        saraiva.adicionarLivro("https://www.amazon.com.br/Trono-vidro-Coroa-meia-noite-Vol/dp/8501401390/ref=d_pd_sim_sccl_3_1/134-6341847-4592736?pd_rd_w=vSnAh&content-id=amzn1.sym.45c7db3b-eda8-4e45-8990-7b4f7d989e0b&pf_rd_p=45c7db3b-eda8-4e45-8990-7b4f7d989e0b&pf_rd_r=7VE2TF823HF0EPWX5N32&pd_rd_wg=8qvwS&pd_rd_r=c2fb9823-ffac-4236-9d67-1f0b4828ddb2&pd_rd_i=8501401390&psc=1", "Trono de vidro: Coroa da meia noite (vol. 2)", "Sarah J. Maas", 47.92);
        saraiva.adicionarLivro("https://www.amazon.com.br/Trono-Vidro-Herdeira-fogo-Vol/dp/8501401404/ref=pd_bxgy_img_sccl_1/134-6341847-4592736?pd_rd_w=Ji8NH&content-id=amzn1.sym.758f3509-df88-4265-806c-565a738dc05d&pf_rd_p=758f3509-df88-4265-806c-565a738dc05d&pf_rd_r=VX4VC0Y9GD6BMXRX2MAB&pd_rd_wg=42wsk&pd_rd_r=13ade2b8-84b4-4e1e-8914-7dc52fcfecb6&pd_rd_i=8501401404&psc=1", "Trono de vidro: Herdeira do fogo (vol. 3)", "Sarah J. Maas", 58.30);
        saraiva.adicionarLivro("https://www.amazon.com.br/Trono-vidro-Rainha-sombras-Vol/dp/8501106844/ref=d_pd_sim_sccl_3_1/134-6341847-4592736?pd_rd_w=Avsw2&content-id=amzn1.sym.45c7db3b-eda8-4e45-8990-7b4f7d989e0b&pf_rd_p=45c7db3b-eda8-4e45-8990-7b4f7d989e0b&pf_rd_r=Z8RHEEYSFNQTPC01F1NY&pd_rd_wg=YWIQm&pd_rd_r=e03f8ae6-9576-45cc-9e5b-6ecbc02e448c&pd_rd_i=8501106844&psc=1", "Trono de vidro: Rainha das sombras (vol. 4)", "Sarah J. Maas", 55.92);
        saraiva.adicionarLivro("https://www.amazon.com.br/Trono-Vidro-Imp%C3%A9rio-Tempestades-%C3%9Anico/dp/8501112607/ref=d_pd_sim_sccl_3_1/134-6341847-4592736?pd_rd_w=S2w9Z&content-id=amzn1.sym.45c7db3b-eda8-4e45-8990-7b4f7d989e0b&pf_rd_p=45c7db3b-eda8-4e45-8990-7b4f7d989e0b&pf_rd_r=F5BXD971F2BVE28QTWRG&pd_rd_wg=Akq5s&pd_rd_r=accebc07-90a4-4914-950b-fd6a2e2e484f&pd_rd_i=8501112607&psc=1", "Trono de vidro: Império de Tempestades (vol. 5)", "Sarah J. Maas", 69.19);


        System.out.println("\nLISTANDO OS LIVROS...");
        //System.out.println(saraiva.exibirLivrosOrdenadosPorPreco());

        System.out.println("\n");
        System.out.println(saraiva.exibirLivroMaisBarato());

        System.out.println("REMOVENDO LIVRO DA BRITNEY....");
        saraiva.removerLivro("A mulher em mim (Pré-venda com camiseta exclusiva)");

        System.out.println("\nLISTANDO OS LIVROS...");
        //System.out.println(saraiva.exibirLivrosOrdenadosPorPreco());

        System.out.println("PESQUISAR TODOS OS LIVROS DA Sarah J. Maas");
        //System.out.println(saraiva.pesquisarLivrosPorAutor("Sarah J. Maas"));

        System.out.println(saraiva.obterLivroMaisCaro());


    }
}
