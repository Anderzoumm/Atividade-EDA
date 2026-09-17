package filas;

public class ex003 {

    public static void main(String[] args) {

        Fila<ClienteMercado> filaCaixa = new Fila<>(5);

        // enfileirar 5 clientes
        filaCaixa.enfileirar(new ClienteMercado("Marcos", 8));
        filaCaixa.enfileirar(new ClienteMercado("Juliana", 15));
        filaCaixa.enfileirar(new ClienteMercado("Renata", 3));
        filaCaixa.enfileirar(new ClienteMercado("Paulo", 22));
        filaCaixa.enfileirar(new ClienteMercado("Sofia", 6));

        System.out.println("Fila do caixa: " + filaCaixa);
        System.out.println();

        // atender um cliente por vez
        while (!filaCaixa.estaVazia()) {
            ClienteMercado cliente = filaCaixa.desenfileirar();
            System.out.println("Atendendo: " + cliente.getNome());
            System.out.println("Clientes restantes na fila: " + filaCaixa.tamanho());
            System.out.println();
        }
    }
}