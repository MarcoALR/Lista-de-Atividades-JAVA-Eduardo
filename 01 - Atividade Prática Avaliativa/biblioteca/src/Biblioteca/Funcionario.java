package Biblioteca;

public class Funcionario extends Usuario {

    private String cargo;

    public Funcionario(String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void cadastrarMembro(Membro membro) {
        if (membro != null) {
            membro.cadastrar();
        }
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Cargo: " + cargo);
    }
}
