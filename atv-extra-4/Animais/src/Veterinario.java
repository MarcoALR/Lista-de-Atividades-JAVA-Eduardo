import java.util.ArrayList;

public class Veterinario {

    private String nome;
    private ArrayList<Animal> animais = new ArrayList<>();
    private ArrayList<Animal> carrocinha = new ArrayList<>();

    public Veterinario(String nome) {
        this.nome = nome;
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void atender() {
        System.out.println("--- Atendimento do veterinario " + nome + " ---");
        for (Animal animal : animais) {
            animal.emitirSom();
            carrocinha.add(animal);
        }
        animais.clear();
    }

    public void mostrarCarrocinha() {
        System.out.println("\n--- Animais na carrocinha ---");
        for (Animal animal : carrocinha) {
            System.out.println("- " + animal);
        }
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public ArrayList<Animal> getCarrocinha() {
        return carrocinha;
    }
}
