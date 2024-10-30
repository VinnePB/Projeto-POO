package jogo.habilidades;

public class PoderMagico implements Habilidade {
    private String nomeMagia;

    public PoderMagico(String nomeMagia) {
        this.nomeMagia = nomeMagia;
    }

    @Override
    public void ativar() {
        System.out.println("Lançando a magia: " + nomeMagia);
    }
}