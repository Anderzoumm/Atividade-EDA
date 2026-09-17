package pilhas;
public class ex002 {

    public static void main(String[] args) {

        Pilha<String> pilha = new Pilha<>(5);

        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");

        System.out.println(pilha);
    }
}