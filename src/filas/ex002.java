package filas;

public class ex002 {

    public static void main(String[] args) {

        Fila<ClienteBanco> filaBanco = new Fila<>(6);

        // enfileirar 6 clientes
        filaBanco.enfileirar(new ClienteBanco("Ana", 101));
        filaBanco.enfileirar(new ClienteBanco("Bruno", 102));
        filaBanco.enfileirar(new ClienteBanco("Carla", 103));
        filaBanco.enfileirar(new ClienteBanco("Daniel", 104));
        filaBanco.enfileirar(new ClienteBanco("Elaine", 105));
        filaBanco.enfileirar(new ClienteBanco("Fábio", 106));

        System.out.println("Fila do banco: " + filaBanco);
        System.out.println();

        // atender os clientes em ordem de chegada
        while (!filaBanco.estaVazia()) {
            ClienteBanco cliente = filaBanco.desenfileirar();
            System.out.println("Chamando: " + cliente);
        }

        // informar que a fila ficou vazia
        System.out.println();
        System.out.println("Atendimento encerrado. A fila está vazia.");
    }
}