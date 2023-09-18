class Pedido {
    private int numero;
    private Item[] itens;

    public Pedido(int numero, Item[] itens) {
        this.numero = numero;
        this.itens = itens;
    }

    public double getTotalPedido() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getTotalItem();
        }
        return total;
    }

    public int getNumero() {
        return numero;
    }
}
