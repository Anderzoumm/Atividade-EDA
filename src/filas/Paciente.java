package filas;

public class Paciente implements Comparable<Paciente> {

    private String nome;
    private int prioridade; // 1 = urgente, 2 = média, 3 = baixa

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    private String descricaoPrioridade() {
        switch (prioridade) {
            case 1:
                return "urgente";
            case 2:
                return "média";
            case 3:
                return "baixa";
            default:
                return "desconhecida";
        }
    }

    @Override
    public int compareTo(Paciente outro) {
        // menor número de prioridade = mais urgente = vem primeiro
        return Integer.compare(this.prioridade, outro.prioridade);
    }

    @Override
    public String toString() {
        return nome + " (prioridade " + prioridade + " - " + descricaoPrioridade() + ")";
    }
}