package vetor;

public class ex003 {
    static void main(String[] args) {
        VetorGenerico<String> linguagens = new VetorGenerico<>(5);

        linguagens.adiciona("Java");
        linguagens.adiciona("Python");
        linguagens.adiciona("JavaScript");
        linguagens.adiciona("C#");
        linguagens.adiciona("PHP");

        System.out.println("Vetor completo: " + linguagens);


        System.out.println("Elemento na posição 0: " + linguagens.busca(0));

        System.out.println("Elemento na posição 2: " + linguagens.busca(2));


        // buscar "PHP" e informar sua posição
        int posicaoPHP = linguagens.busca("PHP");
        System.out.println("Posição de PHP: " + posicaoPHP);

        int posicaoPython = linguagens.busca("Python");
        System.out.println("Posição de Python: " + posicaoPython);


        int posicaoRuby = linguagens.busca("Ruby");
        if (posicaoRuby == -1) {
            System.out.println("Ruby não foi encontrado no vetor (retorno -1).");
        } else {
            System.out.println("Posição de Ruby: " + posicaoRuby);
        }


        System.out.println(linguagens.busca(10));


    }
}
