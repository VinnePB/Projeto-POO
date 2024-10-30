package jogo.personagens;

import jogo.habilidades.Habilidade;

public class Guerreiro extends Personagem {
    private Habilidade habilidade;

    public Guerreiro(String nome, int vida) {
        super(nome, vida);
        this.habilidade = () -> System.out.println("Ataque poderoso com a espada!");
    }

    @Override
    public void usarHabilidade() {
        habilidade.ativar();
    }
}