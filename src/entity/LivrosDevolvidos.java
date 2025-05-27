package entity;

public class LivrosDevolvidos {
    private Livro livro;
    private Cliente cliente;

    public LivrosDevolvidos(Livro livro, Cliente cliente) {
        this.livro = livro;
        this.cliente = cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
