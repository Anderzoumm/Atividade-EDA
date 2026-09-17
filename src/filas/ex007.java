package filas;

public class ex007 {

    public static void main(String[] args) {

        Fila<Chamada> filaChamadas = new Fila<>(5);

        // enfileirar as chamadas recebidas
        filaChamadas.enfileirar(new Chamada("Roberto", "Problema na fatura"));
        filaChamadas.enfileirar(new Chamada("Larissa", "Cancelamento de plano"));
        filaChamadas.enfileirar(new Chamada("Fernando", "Suporte técnico"));
        filaChamadas.enfileirar(new Chamada("Camila", "Dúvida sobre cobrança"));

        System.out.println("Chamadas recebidas: " + filaChamadas);
        System.out.println();

        // atender uma chamada por vez
        while (!filaChamadas.estaVazia()) {
            Chamada chamadaAtual = filaChamadas.desenfileirar();
            System.out.println("Atendendo agora: " + chamadaAtual);
            System.out.println("Chamadas aguardando: " + filaChamadas.tamanho());
            System.out.println();
        }
    }
}