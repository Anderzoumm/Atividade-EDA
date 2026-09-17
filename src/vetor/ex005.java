package vetor;

public class ex005 {

    public static void main(String[] args) {

        VetorGenerico<Integer> numeros = new VetorGenerico<>(5);

        numeros.adiciona(10);
        numeros.adiciona(20);
        numeros.adiciona(30);
        numeros.adiciona(40);
        numeros.adiciona(50);

        System.out.println("Vetor: " + numeros);

        System.out.println("Tamanho: " + numeros.tamanho());

        System.out.println("Tentando adicionar um 6º elemento (60)...");
        boolean adicionou = numeros.adiciona(60);

        System.out.println("Retorno de adiciona(60): " + adicionou);

        if (adicionou) {
            System.out.println("O elemento foi adicionado com sucesso.");
        } else {
            System.out.println("Não foi possível adicionar o elemento.");
        }

        System.out.println("Vetor após a tentativa: " + numeros);
        System.out.println("Tamanho após a tentativa: " + numeros.tamanho());

        System.out.println("=== Capacidade x Tamanho ===");
        System.out.println("Capacidade: é o espaço total reservado internamente no");
        System.out.println("array para guardar elementos (quantas posições existem),");
        System.out.println("definida na criação do vetor (nesse caso, 5).");

        System.out.println("Tamanho: é a quantidade de elementos que realmente foram");
        System.out.println("adicionados/estão armazenados no vetor no momento (nesse caso, "
                + numeros.tamanho() + ").");
        /*
        Observação: nesta implementação, o métdo adiciona(T) chama
        aumentaCapacidade() antes de inserir, o que faz o vetor DOBRAR
        de capacidade automaticamente quando ela é atingida. Por isso,
        o retorno de adiciona() sempre será 'true' e o 6º elemento
        acabou sendo inserido normalmente, pois a capacidade interna
        do array cresceu de 5 para 10 antes da inserção.
    */
    }
}