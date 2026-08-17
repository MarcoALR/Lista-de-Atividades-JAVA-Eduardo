public class Sonic extends Heroi {

    public Sonic() {
        super("Sonic", 100, 50, 100);
    }

    @Override
    public void usarPoder() {
        System.out.println(getNome() + " Rolou!");
    }
}
