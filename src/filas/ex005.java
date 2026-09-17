package filas;

public class ex005 {

    public static void main(String[] args) {

        FilaComPrioridade<Paciente> filaPS = new FilaComPrioridade<>(6);

        // enfileirar 6 pacientes (em ordem de chegada, não de prioridade)
        filaPS.enfileirar(new Paciente("Marcos", 3));   // baixa
        filaPS.enfileirar(new Paciente("Juliana", 1));  // urgente
        filaPS.enfileirar(new Paciente("Renata", 2));   // média
        filaPS.enfileirar(new Paciente("Paulo", 1));    // urgente
        filaPS.enfileirar(new Paciente("Sofia", 3));    // baixa
        filaPS.enfileirar(new Paciente("Diego", 2));    // média

        // mostrar a fila organizada por prioridade
        System.out.println("Fila organizada por prioridade: " + filaPS);
        System.out.println();

        // atender os pacientes em ordem de prioridade
        System.out.println("=== Atendimento ===");
        int ordem = 1;
        while (!filaPS.estaVazia()) {
            Paciente paciente = filaPS.desenfileirar();
            System.out.println(ordem + "º atendido: " + paciente);
            ordem++;
        }
    }
}