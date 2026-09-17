package vetor;

public class ex002 {
    static void main(String[] args) {
        Vetores produtos = new Vetores(2);
        produtos.adiciona("Detergente");
        produtos.adiciona("Sabao");
        produtos.adiciona("Bucha");
        produtos.adiciona("Desinfetante");
        produtos.adiciona("Veja");
        System.out.println(produtos);
        produtos.adiciona("teste");
        produtos.adiciona("teste");
        produtos.adiciona("teste");
        produtos.adiciona("teste");
        produtos.adiciona("teste");
        System.out.println(produtos);
        // a parte de retornar o usuario eu fiz mas tirei do codigo pois ficou obsoleta depois do metodo de aumentar capacitade
        /*

        if (this.tamanho == this.elementos.length){
            throw new IllegalArgumentException("Vetor Cheio!");
        }

       */

    }
}
