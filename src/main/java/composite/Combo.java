package composite;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Item {
    private List<Item> itens;

    public Combo(String descricao) {
        super(descricao);
        this.itens = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }

    @Override
    public String getDetalhes() {
        String saida = "Combo: " + this.getDescricao() + "\n";
        for (Item item : itens) {
            saida += item.getDetalhes();
        }
        return saida;
    }
}