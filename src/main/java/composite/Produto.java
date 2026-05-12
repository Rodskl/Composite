package composite;

public class Produto extends Item {
    private float preco;

    public Produto(String descricao, float preco) {
        super(descricao);
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String getDetalhes() {
        return "Produto: " + this.getDescricao() + " - R$ " + this.preco + "\n";
    }
}