package filas;

public class ClienteMercado {

    private String nome;
    private int quantidadeProdutos;

    public ClienteMercado(String nome, int quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    @Override
    public String toString() {
        return nome + " (" + quantidadeProdutos + " produtos)";
    }
}