package filas;

public class ex004 {

    public static void main(String[] args) {

        Fila<Pessoa> filaPrioritaria = new Fila<>(5);
        Fila<Pessoa> filaNormal = new Fila<>(5);

        // cadastra as pessoas nas filas correspondentes
        cadastrar(filaPrioritaria, filaNormal, new Pessoa("Idoso José", "prioritaria"));
        cadastrar(filaPrioritaria, filaNormal, new Pessoa("Gestante Maria", "prioritaria"));
        cadastrar(filaPrioritaria, filaNormal, new Pessoa("Cliente Ana", "normal"));
        cadastrar(filaPrioritaria, filaNormal, new Pessoa("Cliente Bruno", "normal"));
        cadastrar(filaPrioritaria, filaNormal, new Pessoa("PcD Carlos", "prioritaria"));
        cadastrar(filaPrioritaria, filaNormal, new Pessoa("Idoso Pedro", "prioritaria"));
        cadastrar(filaPrioritaria, filaNormal, new Pessoa("Cliente Diana", "normal"));
        cadastrar(filaPrioritaria, filaNormal, new Pessoa("Cliente Eduardo", "normal"));

        System.out.println("Fila prioritária: " + filaPrioritaria);
        System.out.println("Fila normal: " + filaNormal);
        System.out.println();
        System.out.println("=== Ordem de atendimento (regra 3 prioritárias : 1 normal) ===");

        int atendidosPrioridadeSeguidos = 0;
        int ordem = 1;

        while (!filaPrioritaria.estaVazia() || !filaNormal.estaVazia()) {

            Pessoa atendido;

            if (atendidosPrioridadeSeguidos < 3) {
                // regra: se não houver prioritárias, atende a normal
                if (!filaPrioritaria.estaVazia()) {
                    atendido = filaPrioritaria.desenfileirar();
                    atendidosPrioridadeSeguidos++;
                } else if (!filaNormal.estaVazia()) {
                    atendido = filaNormal.desenfileirar();
                    atendidosPrioridadeSeguidos = 0;
                } else {
                    break;
                }
            } else {
                // já atendeu 3 prioritárias seguidas -> atende 1 normal
                // regra: se não houver normais, atende a prioritária
                if (!filaNormal.estaVazia()) {
                    atendido = filaNormal.desenfileirar();
                } else if (!filaPrioritaria.estaVazia()) {
                    atendido = filaPrioritaria.desenfileirar();
                } else {
                    break;
                }
                atendidosPrioridadeSeguidos = 0;
            }

            System.out.println(ordem + "º atendido: " + atendido);
            ordem++;
        }
    }

    private static void cadastrar(Fila<Pessoa> filaPrioritaria, Fila<Pessoa> filaNormal, Pessoa pessoa) {
        if (pessoa.ehPrioritaria()) {
            filaPrioritaria.enfileirar(pessoa);
        } else {
            filaNormal.enfileirar(pessoa);
        }
    }
}