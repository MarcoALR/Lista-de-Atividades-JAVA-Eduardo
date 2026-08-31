public class Coelho extends Animal {

    public Coelho(String nome, int idade, String cor) {
        super(nome, idade, cor, "Chiou!");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " (coelho) diz: " + getSom());
    }
}
