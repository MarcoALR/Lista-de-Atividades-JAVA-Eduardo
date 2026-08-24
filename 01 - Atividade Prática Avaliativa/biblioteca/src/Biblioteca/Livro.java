package Biblioteca;

public class Livro implements Gerenciavel {

    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void cadastrar() {
        System.out.println("Livro cadastrado: " + titulo);
    }

    public void editar(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        System.out.println("Livro editado com sucesso.");
    }

    public void remover() {
        System.out.println("Livro removido: " + titulo);
    }

    @Override
    public void listar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String situacao;

        if (disponivel) {
            situacao = "Disponivel";
        } else {
            situacao = "Emprestado";
        }

        return "Titulo: " + titulo
                + " | Autor: " + autor
                + " | Situacao: " + situacao;
    }
}
