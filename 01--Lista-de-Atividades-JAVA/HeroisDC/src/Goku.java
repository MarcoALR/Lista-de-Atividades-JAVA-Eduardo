public class Goku extends Heroi {

    public Goku() {
        super("Goku", 100, 100, 100);
    }

    @Override
    public void usarPoder() {
        System.out.println(getNome() + " kamehameha!");
    }
}
