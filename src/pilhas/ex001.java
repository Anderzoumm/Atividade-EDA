package pilhas;

public class ex001 {

    public static void main(String[] args) {

        Pilha<String> pilha = new Pilha<>(5);

        pilha.empilha("A");

        pilha.empilha("B");

        pilha.empilha("C");

        System.out.println("Topo: " + pilha.topo());

        String removido = pilha.desempilha();
        System.out.println("Removido: " + removido);

        System.out.println("Topo: " + pilha.topo());
    }
}