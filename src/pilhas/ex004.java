package pilhas;

public class ex004 {

    public static void main(String[] args) {

        testaPalindromo("arara");
        testaPalindromo("casa");
    }

    private static void testaPalindromo(String palavra) {
        boolean resultado = ehPalindromo(palavra);
        if (resultado) {
            System.out.println(palavra + " -> É palíndromo");
        } else {
            System.out.println(palavra + " -> Não é palíndromo");
        }
    }

    private static boolean ehPalindromo(String palavra) {
        Pilha<Character> pilha = new Pilha<>(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }

        StringBuilder invertida = new StringBuilder();
        while (!pilha.estaVazia()) {
            invertida.append(pilha.desempilha());
        }

        return palavra.equals(invertida.toString());
    }
}