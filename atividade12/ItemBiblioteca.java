class ItemBiblioteca {
    private String titulo;
    private int anoPublicacao;
    private int numCopias;

    public ItemBiblioteca(String titulo, int anoPublicacao, int numCopias) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.numCopias = numCopias;
    }

    public double calcularMulta(String dataDevolucao) {
        String[] partesDataDevolucao = dataDevolucao.split("-");
        int anoDevolucao = Integer.parseInt(partesDataDevolucao[0]);
        int mesDevolucao = Integer.parseInt(partesDataDevolucao[1]);
        int diaDevolucao = Integer.parseInt(partesDataDevolucao[2]);

        int anoAtual = 2023;
        int mesAtual = 10;
        int diaAtual = 23;

        if (anoDevolucao > anoAtual || (anoDevolucao == anoAtual && mesDevolucao > mesAtual) ||
                (anoDevolucao == anoAtual && mesDevolucao == mesAtual && diaDevolucao >= diaAtual)) {
            return 0;
        } else {
            int atraso = ((anoAtual - anoDevolucao) * 365) + ((mesAtual - mesDevolucao) * 30) + (diaAtual - diaDevolucao);
            double multa = atraso * 1.0;
            return multa;
        }
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void emprestar() {
        numCopias--;
    }

    public void devolver() {
        numCopias++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}
