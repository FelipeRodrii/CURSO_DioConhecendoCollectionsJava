
public class Terminal {  
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        System.out.println("Adicionando Numeros Aqui....\n");
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(8);
        numeros.adicionarNumero(14);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(55);
        numeros.adicionarNumero(52);
        numeros.adicionarNumero(23);
        numeros.adicionarNumero(16);

        System.out.println("SOMA DOS NUMEROS, TEM QUE SER -> 198");
        System.out.println(numeros.calcularSoma());

        System.out.println("A MAIOR NUMERO DA LISTA");
        System.out.println(numeros.encontrarMaiorNumero());

        System.out.println("MENOR NUMERO DA LISTA");
        System.out.println(numeros.encontrarMenorNumero());

    }
}
