package composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CardapioTest {

    @Test
    void deveRetornarDetalhesCardapio() {
        Combo comboFamilia = new Combo("Combo Família");
        
        Produto hamb1 = new Produto("X-Burguer", 15.0f);
        Produto hamb2 = new Produto("X-Bacon", 20.0f);
        
        Combo comboInfantil = new Combo("Combo Kids");
        Produto hambKids = new Produto("Hamburguinho", 10.0f);
        Produto refriKids = new Produto("Suco de Laranja", 5.0f);
        
        comboInfantil.addItem(hambKids);
        comboInfantil.addItem(refriKids);
        
        comboFamilia.addItem(hamb1);
        comboFamilia.addItem(hamb2);
        comboFamilia.addItem(comboInfantil);
        
        Cardapio cardapio = new Cardapio();
        cardapio.setRaiz(comboFamilia);
        
        String esperado = "Combo: Combo Família\n" +
                          "Produto: X-Burguer - R$ 15.0\n" +
                          "Produto: X-Bacon - R$ 20.0\n" +
                          "Combo: Combo Kids\n" +
                          "Produto: Hamburguinho - R$ 10.0\n" +
                          "Produto: Suco de Laranja - R$ 5.0\n";
                          
        assertEquals(esperado, cardapio.getDescricaoCardapio());
    }

    @Test
    void deveRetornarExcecaoCardapioVazio() {
        try {
            Cardapio cardapio = new Cardapio();
            cardapio.getDescricaoCardapio();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Cardápio sem itens", e.getMessage());
        }
    }
}