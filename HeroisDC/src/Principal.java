import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

      
        List<Heroi> herois = new ArrayList<>();
        herois.add(new Batman());
        herois.add(new Superman());
        herois.add(new MulherMaravilha());
        herois.add(new Goku());
        herois.add(new Sonic());
        herois.add(new Mario());


        for (Heroi heroi : herois) {
            heroi.apresentar();
            heroi.usarPoder();
            System.out.println("----------------------------------");
        }
    }
}
