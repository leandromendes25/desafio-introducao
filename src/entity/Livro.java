package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private Integer id;
    private String titulo;
    private Autor autor;
    private Boolean disponivel = true;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;
    private List<Emprestimo> emprestimoParaCliente = new ArrayList<>();


    public Livro(Integer id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.dataCadastro = LocalDate.now();
        this.dataAtualizacao = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public void addEmprestismoDeCliente(Emprestimo livroEmprestado) {
        emprestimoParaCliente.add(livroEmprestado);
    }

    public void listarQuemPegouEmprestado() {
        for (Emprestimo emprestimo : emprestimoParaCliente) {
            System.out.println(emprestimo);
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", disponivel=" + disponivel +
                ", dataCadastro=" + dataCadastro +
                ", dataAtualizacao=" + dataAtualizacao +
                ", emprestimoParaCliente=" + emprestimoParaCliente +
                '}';
    }
}