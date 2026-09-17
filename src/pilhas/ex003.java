package pilhas;

public class ex003 {

    public static void main(String[] args) {

        String palavra = "hello";
        String invertida = inverter(palavra);

        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida: " + invertida);
    }

    private static String inverter(String palavra) {
        Pilha<Character> pilha = new Pilha<>(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }

        StringBuilder resultado = new StringBuilder();
        while (!pilha.estaVazia()) {
            resultado.append(pilha.desempilha());
        }

        return resultado.toString();
    }
}