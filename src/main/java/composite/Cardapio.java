package composite;

public class Cardapio {
    private Item raiz;

    public void setRaiz(Item raiz) {
        this.raiz = raiz;
    }

    public String getDescricaoCardapio() {
        if (this.raiz == null) {
            throw new NullPointerException("Cardápio sem itens");
        }
        return this.raiz.getDetalhes();
    }
}