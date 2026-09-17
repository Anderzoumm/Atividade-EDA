package filas;

public class Processo {

    private String identificador;
    private int tempoEstimado; // em segundos, por exemplo

    public Processo(String identificador, int tempoEstimado) {
        this.identificador = identificador;
        this.tempoEstimado = tempoEstimado;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getTempoEstimado() {
        return tempoEstimado;
    }

    @Override
    public String toString() {
        return identificador + " (tempo estimado: " + tempoEstimado + "s)";
    }
}