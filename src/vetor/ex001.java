package vetor;

public class ex001 {
    static void main() {
        Vetores alunos = new Vetores(10);
        alunos.adiciona("Ana");
        alunos.adiciona("Anderson");
        alunos.adiciona("Theo");
        alunos.adiciona("Camila");
        alunos.adiciona("Mariana");
        alunos.adiciona("Dominique");
        System.out.println(alunos);
        System.out.println(alunos.getTamanho());
        System.out.println(alunos.busca( 3));
        System.out.println(alunos.busca("Ana"));
    }
}