package pilhas;

public class ex005 {

    public static void main(String[] args) {

        String frase = "eu gosto de java";
        String invertida = inverterPalavras(frase);

        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida: " + invertida);
    }

    private static String inverterPalavras(String frase) {
        String[] palavras = frase.split(" ");

        Pilha<String> pilha = new Pilha<>(palavras.length);

        for (String palavra : palavras) {
            pilha.empilha(palavra);
        }

        StringBuilder resultado = new StringBuilder();
        while (!pilha.estaVazia()) {
            resultado.append(pilha.desempilha());
            if (!pilha.estaVazia()) {
                resultado.append(" ");
            }
        }

        return resultado.toString();
    }
}