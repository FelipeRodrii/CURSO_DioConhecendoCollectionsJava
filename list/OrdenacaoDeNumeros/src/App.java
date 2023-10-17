public class App {
    public static void main(String[] args) throws Exception {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();


        System.out.println("ADICIONANDO NUMEROS");
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(8);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(16);
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(21);
        numeros.adicionarNumero(29);
        numeros.adicionarNumero(48);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(10098);

        System.out.println("ORDENAÇÃO ASCENDENTE");
        numeros.ordenarAscendente();

        System.out.println("ORDENAÇÃO DESCENDENTE");
        numeros.ordenarDescendente();

    }
}
