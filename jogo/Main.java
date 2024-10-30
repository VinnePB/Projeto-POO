package jogo;
import jogo.personagens.Mago;
import jogo.personagens.Guerreiro;
import jogo.personagens.Personagem;

public class Main { 
    public static void
main(String[] args){
// Criação dos personagens
Personagem mago = new Mago("Gandalf", 100);
Personagem guerreiro = new Guerreiro("Arthur", 120);
// Ação dos personagens
System.out.println(mago.getNome() + " usando habilidade:");
mago.usarHabilidade();
System.out.println(guerreiro.getNome() + " usando habilidade:");
guerreiro.usarHabilidade();
}
}