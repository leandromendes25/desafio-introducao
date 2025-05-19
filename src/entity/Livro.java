package entity;

import java.time.LocalDate;

public class Livro {
    private Integer id;
    private String titulo;
    private Autor autor;
    private Boolean disponivel = true;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    public Livro(Integer id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.dataCadastro = LocalDate.now();
        this.dataCadastro = LocalDate.now();
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

}