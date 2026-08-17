
public class MulherMaravilha extends Heroi {

    public MulherMaravilha() {
        super("Mulher-Maravilha", 100, 95, 70);
    }

    @Override
    public void usarPoder() {
        System.out.println(getNome() + " usou o Laco da Verdade!");
    }
}
