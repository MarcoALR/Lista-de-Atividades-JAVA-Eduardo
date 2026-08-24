package Biblioteca;

import java.util.ArrayList;

public class Biblioteca implements Gerenciavel {

    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Membro> membros = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public ArrayList<Membro> getMembros() {
        return membros;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        livro.cadastrar();
    }

    public void editarLivro(int posicao, String titulo, String autor) {
        livros.get(posicao).editar(titulo, autor);
    }

    public void removerLivro(int posicao) throws BibliotecaException {
        if (!livros.get(posicao).isDisponivel()) {
            throw new BibliotecaException("Nao pode remover livro emprestado.");
        }

        livros.get(posicao).remover();
        livros.remove(posicao);
    }

    public void listarLivros() {
        System.out.println("\n--- LIVROS ---");

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        }

        for (int i = 0; i < livros.size(); i++) {
            System.out.print((i + 1) + " - ");
            livros.get(i).listar();
        }
    }

    public void adicionarMembro(Membro membro) {
        membros.add(membro);
        membro.cadastrar();
    }

    public void editarMembro(int posicao, String nome, String email) {
        membros.get(posicao).editar(nome, email);
    }

    public void listarMembros() {
        System.out.println("\n--- MEMBROS ---");

        if (membros.isEmpty()) {
            System.out.println("Nenhum membro cadastrado.");
        }

        for (int i = 0; i < membros.size(); i++) {
            System.out.println((i + 1) + " - " + membros.get(i).getNome()
                    + " | " + membros.get(i).getEmail()
                    + " | " + membros.get(i).getMatricula());
        }
    }

    public void realizarEmprestimo(int posLivro, int posMembro)
            throws BibliotecaException {

        Emprestimo emprestimo = new Emprestimo(
                livros.get(posLivro),
                membros.get(posMembro)
        );

        emprestimo.realizar();
        emprestimos.add(emprestimo);
    }

    public void encerrarEmprestimo(int posicao) throws BibliotecaException {
        emprestimos.get(posicao).encerrar();
    }

    public void listarEmprestimos() {
        System.out.println("\n--- EMPRESTIMOS ---");

        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum emprestimo cadastrado.");
        }

        for (int i = 0; i < emprestimos.size(); i++) {
            Emprestimo e = emprestimos.get(i);
            System.out.println((i + 1) + " - "
                    + e.getLivro().getTitulo()
                    + " | " + e.getMembro().getNome()
                    + " | " + (e.isAtivo() ? "Ativo" : "Encerrado"));
        }
    }

    @Override
    public void listar() {
        listarLivros();
        listarMembros();
        listarEmprestimos();
    }
}
