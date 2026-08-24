# Diagrama de classes
diagrama-classes.svg
## Explicacao
O sistema tem a classe Biblioteca, que organiza livros, membros e emprestimos.
Livro guarda os dados do livro. Emprestimo liga um Livro a um Membro.

Usuario e a classe base. Dela saem Membro e Funcionario, mostrando
heranca. Os atributos ficam privados, mostrando encapsulamento. A interface
Gerenciavel define o metodo listar(). A classe BibliotecaException trata
erros do sistema.

No Principal existe um menu simples para cadastrar, editar, remover e listar
livros; cadastrar, editar e listar membros; realizar, encerrar e listar
emprestimos.
