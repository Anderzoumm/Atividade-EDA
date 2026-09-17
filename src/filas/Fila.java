package filas;

public class Fila<T> {

    protected T[] elementos;
    protected int tamanho;

    public Fila(int capacidade) {
        this.tamanho = 0;
        this.elementos = (T[]) new Object[capacidade];
    }

    public int tamanho() {
        return this.tamanho;
    }

    protected void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {

            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

            for (int i = 0; i < this.tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public void enfileirar(T elemento) {
        // verificacao de capacidade
        // adicionar um elemento no final da fila (q posicao é essa?)
        // lidar com o atributo tamanho
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public T desenfileirar() {
        //remover o primeiro elemento
        //lidar com o tamanho
        //guardar o elemento a ser retornado
        //realocar todos os elementos posteriores
        //retornar o elemento
        if (estaVazia()) {
            return null;
        }
        T el = this.elementos[0];

        for (int i = 0; i < tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        elementos[tamanho] = null;
        tamanho--;
        return el;
    }
}



