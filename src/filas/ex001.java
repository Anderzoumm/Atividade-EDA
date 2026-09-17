package filas;

public class ex001 {

    public static void main(String[] args) {

        Fila<Documento> filaImpressao = new Fila<>(5);

        filaImpressao.enfileirar(new Documento("Relatorio.pdf", 12));
        filaImpressao.enfileirar(new Documento("Contrato.docx", 5));
        filaImpressao.enfileirar(new Documento("Apresentacao.pptx", 20));
        filaImpressao.enfileirar(new Documento("Planilha.xlsx", 3));
        filaImpressao.enfileirar(new Documento("Boleto.pdf", 1));

        System.out.println("Fila de impressão inicial: " + filaImpressao);
        System.out.println();

        while (!filaImpressao.estaVazia()) {
            Documento documento = filaImpressao.desenfileirar();
            System.out.println("Imprimindo: " + documento);
        }

        System.out.println();
        System.out.println("Fila de impressão final: " + filaImpressao);
    }
}