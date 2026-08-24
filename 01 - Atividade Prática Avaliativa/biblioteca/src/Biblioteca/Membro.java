package Biblioteca;

public class Membro extends Usuario {

    private String matricula;

    public Membro(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void cadastrar() {
        System.out.println("Membro cadastrado: " + getNome());
    }

    public void editar(String nome, String email) {
        setNome(nome);
        setEmail(email);
        System.out.println("Membro editado com sucesso.");
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Matricula: " + matricula);
    }
}
