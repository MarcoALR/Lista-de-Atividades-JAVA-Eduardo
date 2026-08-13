
public class Superman extends Heroi {

    public Superman() {
        super("Superman", 100, 100, 80);
    }

    @Override
    public void usarPoder() {
        System.out.println(getNome() + " usou a visao de calor!");
    }
}
