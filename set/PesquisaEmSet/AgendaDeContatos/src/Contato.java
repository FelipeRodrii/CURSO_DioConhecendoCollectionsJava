public class Contato {
    private String nome;
    private int  numero;


    public Contato(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numero = numeroTelefone;
    }


    public String getNome() {
        return nome;
    }


    public int getNumeroTelefone() {
        return numero;
    }


    @Override
    public String toString() {
        return "[nome=" + nome + ", numero=" + numero + "]";
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null) {
                return false;
            }
        } else if (!nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

    
    
}


