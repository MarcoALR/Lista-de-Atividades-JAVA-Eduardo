public class Cavalo extends Animal {

    public Cavalo(String nome, int idade, String cor) {
        super(nome, idade, cor, "Relincho!");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " (cavalo) diz: " + getSom());
    }
}
