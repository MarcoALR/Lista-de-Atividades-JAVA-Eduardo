public class Principal {

    public static void main(String[] args) {

        Veterinario vet = new Veterinario("Dr. Marcão");

        Cachorro rex = new Cachorro("Rex", 3, "Caramelo");
        Gato mimi = new Gato("Mimi", 2, "Branco");
        Cavalo trovao = new Cavalo("Trovao", 7, "Preto");
        Coelho pipoca = new Coelho("Pipoca", 1, "Cinza");

        vet.adicionarAnimal(rex);
        vet.adicionarAnimal(mimi);
        vet.adicionarAnimal(trovao);
        vet.adicionarAnimal(pipoca);

        rex.setSom("AUUUUU! (uivo)");

        vet.atender();
        vet.mostrarCarrocinha();
    }
}
