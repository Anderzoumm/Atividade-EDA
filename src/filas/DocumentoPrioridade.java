package filas;

public class DocumentoPrioridade implements Comparable<DocumentoPrioridade> {

    private String nome;
    private int paginas;
    private int prioridade; // quanto menor, mais urgente

    public DocumentoPrioridade(String nome, int paginas, int prioridade) {
        this.nome = nome;
        this.paginas = paginas;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public int compareTo(DocumentoPrioridade outro) {
        // compara SOMENTE pela prioridade; a estabilidade da inserção
        // (na FilaComPrioridade) garante que, em caso de empate, a ordem
        // de chegada seja preservada.
        return Integer.compare(this.prioridade, outro.prioridade);
    }

    @Override
    public String toString() {
        return nome + " (" + paginas + " páginas, prioridade " + prioridade + ")";
    }
}