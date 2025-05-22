package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    public void addLivros(Livro livro){
        livros.add(livro);
    }
    public void addAutores(Autor ator){
    autores.add(ator);
    }
    public void addEmprestimos(Livro livro, Cliente cliente) {
        if(!livro.getDisponivel()){
            try {
                throw new Exception("O livro não está disponivel para ser emprestado");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (livro.getDisponivel()) {
            Emprestimo livroASerImprestado = new Emprestimo(livro, cliente);
            livroASerImprestado.getLivro().setDisponivel(false);
            livroASerImprestado.getLivro().setDataAtualizacao(LocalDate.now());
            emprestimos.add(livroASerImprestado);
        }
    }
    public void listarLivros(){
        for(Livro x : livros){
            System.out.println(x.getTitulo());
        }
    }
    public void listarClientes(){
        for(Cliente c : clientes){
            System.out.println(c.getNome());
        }
    }

}
