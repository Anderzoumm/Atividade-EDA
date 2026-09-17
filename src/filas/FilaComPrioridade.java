package filas;

/**
 * Fila com prioridade: os elementos precisam implementar Comparable<T>,
 * onde o "menor" elemento (segundo compareTo) é o de maior prioridade
 * (ex.: prioridade 1 = urgente, deve vir na frente).
 *
 * A cada enfileirar(), o elemento é inserido na posição correta para que
 * a fila permaneça sempre ordenada por prioridade. Quando dois elementos
 * têm a mesma prioridade, o novo elemento é inserido DEPOIS dos elementos
 * já existentes com a mesma prioridade, preservando a ordem de chegada
 * (comportamento estável / FIFO entre elementos de mesma prioridade).
 */
public class FilaComPrioridade<T extends Comparable<T>> extends Fila<T> {

    public FilaComPrioridade(int capacidade) {
        super(capacidade);
    }

    @Override
    public void enfileirar(T elemento) {
        this.aumentaCapacidade();

        // encontra a primeira posição cujo elemento é "menos prioritário"
        // (estritamente maior) que o novo elemento
        int posicao = this.tamanho;
        for (int i = 0; i < this.tamanho; i++) {
            if (elemento.compareTo(this.elementos[i]) < 0) {
                posicao = i;
                break;
            }
        }

        // abre espaço deslocando os elementos posteriores
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
    }
}