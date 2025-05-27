package entity;


import java.time.LocalDateTime;

public class Emprestimo {
    private Livro livro;
    private Cliente cliente;
    private LocalDateTime dataEmprestimo;
    public Emprestimo(Livro livro, Cliente cliente) {
        this.livro = livro;
        this.cliente = cliente;
        this.dataEmprestimo = LocalDateTime.now();
    }

    public Livro getLivro() {
        return livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }
}
