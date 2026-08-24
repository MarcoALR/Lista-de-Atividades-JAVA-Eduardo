package Biblioteca;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--BIBLIOTECA--");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Editar livro");
            System.out.println("3 - Remover livro");
            System.out.println("4 - Listar livros");
            System.out.println("5 - Cadastrar membro");
            System.out.println("6 - Editar membro");
            System.out.println("7 - Listar membros");
            System.out.println("8 - Realizar emprestimo");
            System.out.println("9 - Encerrar emprestimo");
            System.out.println("10 - Listar emprestimos");
            System.out.println("0 - Sair");

            try {
                System.out.print("Opcao: ");
                opcao = Integer.parseInt(entrada.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.print("Titulo: ");
                        String titulo = entrada.nextLine();
                        System.out.print("Autor: ");
                        String autor = entrada.nextLine();
                        biblioteca.adicionarLivro(new Livro(titulo, autor));
                        break;

                    case 2:
                        biblioteca.listarLivros();
                        System.out.print("Numero do livro: ");
                        int livroEditar = Integer.parseInt(entrada.nextLine()) - 1;
                        System.out.print("Novo titulo: ");
                        titulo = entrada.nextLine();
                        System.out.print("Novo autor: ");
                        autor = entrada.nextLine();
                        biblioteca.editarLivro(livroEditar, titulo, autor);
                        break;

                    case 3:
                        biblioteca.listarLivros();
                        System.out.print("Numero do livro: ");
                        int livroRemover = Integer.parseInt(entrada.nextLine()) - 1;
                        biblioteca.removerLivro(livroRemover);
                        break;

                    case 4:
                        biblioteca.listarLivros();
                        break;

                    case 5:
                        System.out.print("Nome: ");
                        String nome = entrada.nextLine();
                        System.out.print("Email: ");
                        String email = entrada.nextLine();
                        System.out.print("Matricula: ");
                        String matricula = entrada.nextLine();
                        biblioteca.adicionarMembro(new Membro(nome, email, matricula));
                        break;

                    case 6:
                        biblioteca.listarMembros();
                        System.out.print("Numero do membro: ");
                        int membroEditar = Integer.parseInt(entrada.nextLine()) - 1;
                        System.out.print("Novo nome: ");
                        nome = entrada.nextLine();
                        System.out.print("Novo email: ");
                        email = entrada.nextLine();
                        biblioteca.editarMembro(membroEditar, nome, email);
                        break;

                    case 7:
                        biblioteca.listarMembros();
                        break;

                    case 8:
                        biblioteca.listarLivros();
                        System.out.print("Numero do livro: ");
                        int livroEmprestimo = Integer.parseInt(entrada.nextLine()) - 1;
                        biblioteca.listarMembros();
                        System.out.print("Numero do membro: ");
                        int membroEmprestimo = Integer.parseInt(entrada.nextLine()) - 1;
                        biblioteca.realizarEmprestimo(livroEmprestimo, membroEmprestimo);
                        break;

                    case 9:
                        biblioteca.listarEmprestimos();
                        System.out.print("Numero do emprestimo: ");
                        int emprestimo = Integer.parseInt(entrada.nextLine()) - 1;
                        biblioteca.encerrarEmprestimo(emprestimo);
                        break;

                    case 10:
                        biblioteca.listarEmprestimos();
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opcao invalida.");
                }
            } catch (BibliotecaException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Valor invalido.");
            }
        }

        entrada.close();
    }
}
