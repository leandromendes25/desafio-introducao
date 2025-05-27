package entity;

import exceptions.LivroException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<LivrosDevolvidos> livrosDevolvidos = new ArrayList<>();

    public void addLivros(Livro livro) {
        livros.add(livro);
    }

    public void addAutores(Autor ator) {
        autores.add(ator);
    }

    public void addEmprestimos(String tituloDesejado, Cliente cliente) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(tituloDesejado)) {
                if (!livro.getDisponivel()) {
                    throw new LivroException("Livro não está disponível");
                }
                Emprestimo emp = new Emprestimo(livro, cliente);
                emprestimos.add(emp);
                livro.addEmprestismoDeCliente(emp);
                livro.setDataAtualizacao(LocalDate.now());
                livro.setDisponivel(false);
            }
            throw new LivroException("Livro não encontrado");
        }
    }

    public void removerEmprestimos(String tituloDesejado, Cliente cliente) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(tituloDesejado)) {
                if (livro.getDisponivel()) {
                    throw new LivroException("Livro não pode ser devolvido");
                }
                Emprestimo emp = new Emprestimo(livro, cliente);
                emprestimos.remove(emp);

                livro.setDisponivel(true);
                livro.setDataAtualizacao(LocalDate.now());
            }
        }
    }

    public void listarEmprestimos() {
        for (Emprestimo emp : emprestimos) {
            System.out.println(emp.getLivro().getTitulo());
        }
    }

    public void listarLivros() {
        for (Livro x : livros) {
            System.out.println(x.getTitulo());
        }
    }

    public void listarClientes() {
        for (Emprestimo e : emprestimos) {
            System.out.println(e.getCliente().getNome());
            System.out.println(e.getLivro());
        }
    }


}
