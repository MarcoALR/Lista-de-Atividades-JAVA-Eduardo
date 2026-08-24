package Biblioteca;

import java.time.LocalDate;

public class Emprestimo implements Gerenciavel {

    private LocalDate data;
    private boolean ativo;
    private Livro livro;
    private Membro membro;

    public Emprestimo(Livro livro, Membro membro) {
        this.livro = livro;
        this.membro = membro;
        this.data = LocalDate.now();
        this.ativo = false;
    }

    public LocalDate getData() {
        return data;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Livro getLivro() {
        return livro;
    }

    public Membro getMembro() {
        return membro;
    }

    public void realizar() throws BibliotecaException {

        if (livro == null) {
            throw new BibliotecaException("Livro invalido.");
        }

        if (membro == null) {
            throw new BibliotecaException("Membro invalido.");
        }

        if (!livro.isDisponivel()) {
            throw new BibliotecaException("Livro nao esta disponivel.");
        }

        livro.setDisponivel(false);
        ativo = true;
        data = LocalDate.now();

        System.out.println("Emprestimo realizado com sucesso.");
    }

    public void encerrar() throws BibliotecaException {

        if (!ativo) {
            throw new BibliotecaException("Emprestimo ja esta encerrado.");
        }

        ativo = false;
        livro.setDisponivel(true);

        System.out.println("Emprestimo encerrado com sucesso.");
    }

    @Override
    public void listar() {

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Membro: " + membro.getNome());
        System.out.println("Data: " + data);
        System.out.println("Status: " + (ativo ? "Ativo" : "Encerrado"));
    }
}
