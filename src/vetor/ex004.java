package vetor;

public class ex004 {

    public static void main(String[] args) {

        VetorGenerico<String> livros = new VetorGenerico<>(10);

        livros.adiciona("Dom Casmurro");
        livros.adiciona("O Cortiço");
        livros.adiciona("1984");
        livros.adiciona("O Senhor dos Anéis");
        livros.adiciona("Harry Potter e a Pedra Filosofal");
        livros.adiciona("Clean Code");
        livros.adiciona("Introdução aos Algoritmos");

        System.out.println("Livros cadastrados: " + livros);

        System.out.println("Quantidade de livros: " + livros.tamanho());

        try {
            int posicaoConsulta = 3;
            String livro = livros.busca(posicaoConsulta);
            System.out.println("Livro na posição " + posicaoConsulta + ": " + livro);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao consultar posição: " + e.getMessage());
        }

        String tituloBuscado1 = "1984";
        int posicaoEncontrada1 = livros.busca(tituloBuscado1);
        if (posicaoEncontrada1 != -1) {
            System.out.println( tituloBuscado1 + " encontrado na posição " + posicaoEncontrada1);
        } else {
            System.out.println(tituloBuscado1 + " não foi encontrado.");
        }

        String tituloBuscado2 = "O Pequeno Príncipe";
        int posicaoEncontrada2 = livros.busca(tituloBuscado2);
        if (posicaoEncontrada2 != -1) {
            System.out.println("" + tituloBuscado2 + " encontrado na posição " + posicaoEncontrada2);
        } else {
            System.out.println(tituloBuscado2 + " não foi encontrado no cadastro.");
        }



        try {
            int posicaoInvalida = 20;
            System.out.println("Tentando consultar a posição " + posicaoInvalida + "...");
            String livro = livros.busca(posicaoInvalida);
            System.out.println("Livro: " + livro);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção tratada: posição inválida -> " + e.getMessage());
        }
    }
}