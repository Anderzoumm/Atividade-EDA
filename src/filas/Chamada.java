package filas;

public class Chamada {

    private String nome;
    private String assunto;

    public Chamada(String nome, String assunto) {
        this.nome = nome;
        this.assunto = assunto;
    }

    public String getNome() {
        return nome;
    }

    public String getAssunto() {
        return assunto;
    }

    @Override
    public String toString() {
        return nome + " - " + assunto;
    }
}