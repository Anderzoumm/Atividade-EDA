package filas;

public class ex006 {

    public static void main(String[] args) {

        FilaComPrioridade<DocumentoPrioridade> filaImpressao = new FilaComPrioridade<>(6);

        // enfileirar documentos com diferentes prioridades
        // (dois documentos com prioridade 2, para testar o desempate por chegada)
        filaImpressao.enfileirar(new DocumentoPrioridade("Relatorio.pdf", 12, 2));
        filaImpressao.enfileirar(new DocumentoPrioridade("Contrato.docx", 5, 1));
        filaImpressao.enfileirar(new DocumentoPrioridade("Planilha.xlsx", 3, 2));
        filaImpressao.enfileirar(new DocumentoPrioridade("Boleto.pdf", 1, 1));
        filaImpressao.enfileirar(new DocumentoPrioridade("Apresentacao.pptx", 20, 3));

        System.out.println("Fila de impressão organizada por urgência: " + filaImpressao);
        System.out.println();

        // documentos mais urgentes são impressos primeiro;
        // observe que "Contrato.docx" sai antes de "Boleto.pdf" (ambos prioridade 1)
        // pois chegou primeiro na fila, e o mesmo vale para
        // "Relatorio.pdf" antes de "Planilha.xlsx" (ambos prioridade 2)
        System.out.println("=== Ordem de impressão ===");
        while (!filaImpressao.estaVazia()) {
            DocumentoPrioridade documento = filaImpressao.desenfileirar();
            System.out.println("Imprimindo: " + documento);
        }
    }
}