package filas;

public class Pessoa {

    private String nome;
    private String tipoSenha; // "normal" ou "prioritaria"

    public Pessoa(String nome, String tipoSenha) {
        this.nome = nome;
        this.tipoSenha = tipoSenha;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoSenha() {
        return tipoSenha;
    }

    public boolean ehPrioritaria() {
        return "prioritaria".equalsIgnoreCase(this.tipoSenha);
    }

    @Override
    public String toString() {
        return nome + " (" + tipoSenha + ")";
    }
}