public class Mario extends Heroi {

    public Mario() {
        super("Mario", 100, 50, 100);
    }

    @Override
    public void usarPoder() {
        System.out.println(getNome() + " Entrou no Cano!");
    }
}
