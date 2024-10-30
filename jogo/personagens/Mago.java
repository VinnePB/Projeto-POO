package jogo.personagens;

import jogo.habilidades.PoderMagico;

public class Mago extends Personagem {
    private PoderMagico poderMagico;

    public Mago(String nome, int vida) {
        super(nome, vida);
        this.poderMagico = new PoderMagico("Bola de Fogo");
    }

    @Override
    public void usarHabilidade() {
        poderMagico.ativar();
    }
}