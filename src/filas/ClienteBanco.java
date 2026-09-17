package filas;

public class ClienteBanco {

    private String nome;
    private int senha;

    public ClienteBanco(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public int getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Senha " + senha + " - " + nome;
    }
}