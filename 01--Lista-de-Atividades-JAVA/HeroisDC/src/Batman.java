
public class Batman extends Heroi {

    public Batman() {
        super("Batman", 100, 90, 60);
    }

    @Override
    public void usarPoder() {
        System.out.println(getNome() + " lancou um Batarangue!");
    }
}
