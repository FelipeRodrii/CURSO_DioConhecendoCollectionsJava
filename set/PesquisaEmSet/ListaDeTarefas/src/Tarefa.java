public class Tarefa {
    //Atributos
    private String descricao;
    private boolean status;


    public Tarefa(String descricao){
        this.descricao= descricao;
        this.status= false;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Descricao=" + descricao + ", Status=" + status + "\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
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
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null) {
                return false;
            }
        } else if (!descricao.equals(other.descricao)) {
            return false;
        }
        return true;
    }
}
