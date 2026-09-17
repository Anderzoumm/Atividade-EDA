package vetor;

public class Vetores {
    private String[] elementos;
    private int tamanho; //qtdade de elementos

    public Vetores(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }
//    public void adiciona(String elemento) {
//        for (int i = 0; i < elementos.length; i++) {
//            if(this.elementos[i] == null) {
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }

//    public void adiciona(String elemento) throws Exception {
//        if(this.tamanho < this.elementos.length) {
//            this.elementos[this.tamanho] = elemento;
//            this.tamanho++;
//        } else {
//            throw new Exception("O elemento nao pode ser adicionado");
//        }
//    }

    public boolean adiciona(String elemento)  {

        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    //adicionar em qualquer posicao
    //percorrer o array do ultimo ate posicao

    public void adiciona(int posicao, String elemento){
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao inválida");
        }

        this.aumentaCapacidade();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    public int tamanho() {
        return this.tamanho;
    }

//    @Override
//    public String toString() {
//        String s = "[";
//
//        for (int i = 0; i < this.tamanho - 1; i++) {
//            s += this.elementos[i];
//            s += ", ";
//        }
//        if(this.tamanho > 0) {
//            s += this.elementos[this.tamanho - 1];
//        }
//        s += "]";
//        return s;
//    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if(this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }

    public String busca(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    //aumentar capacidade
    //verificar se o vetor esta cheio
    //criar um novo array com o dobro da capacidade do anterior
    // copiar os elementos
    //percorrer o array
    //atribuir os valores
    //mudar a referencia do atributo


    private void aumentaCapacidade() {
        if(this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length*2];
            for (int i = 0; i < tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    // remover de qualquer posicao
    // validar posicao
    // percorrer array
    // deslocar elementos

    public void remove(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int i = posicao; i < tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.elementos[tamanho -1] = null;
        this.tamanho--;

    }












}
