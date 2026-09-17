package filas;

public class Tarefa implements Comparable<Tarefa> {

    private String nome;
    private int prioridade; // quanto menor, mais prioritária

    public Tarefa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public int compareTo(Tarefa outra) {
        return Integer.compare(this.prioridade, outra.prioridade);
    }

    @Override
    public String toString() {
        return nome + " (prioridade " + prioridade + ")";
    }
}