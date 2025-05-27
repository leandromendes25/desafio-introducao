import entity.*;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean entradaValida = true;

        Autor aut1 = new Autor(1, "Nana", LocalDate.of(1976, 8, 24));
        Autor aut2 = new Autor(2, "Baba", LocalDate.of(2000, 1, 12));
        Livro book1 = new Livro(1, "h", aut1);
        Livro book2 = new Livro(2, "p", aut2);
        Livro book3 = new Livro(3, "c", aut2);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addLivros(book1);
        biblioteca.addLivros(book2);
        biblioteca.addLivros(book3);
        biblioteca.addAutores(aut1);
        biblioteca.addAutores(aut2);
        Cliente cl1 = new Cliente(1, "Neo", LocalDate.of(2004, 9, 15), "neo@email.com");
        Scanner sc = new Scanner(System.in);

        while (entradaValida) {
            System.out.println("Deseja pegar um entrar na biblioteca? S/N");
            char caracter = sc.next().toUpperCase().trim().charAt(0);
            switch (caracter) {
                case 'S': {
                    entradaValida = true;
                    break;
                }
                case 'N': {
                    entradaValida = false;
                    break;
                }
                default: {
                    System.out.println("Opção invalida");
                    break;
                }
            }

            System.out.println("Deseja pegar livro emprestado? ");
            char respostaEmprestimo = sc.next().toUpperCase().trim().charAt(0);
            sc.nextLine();
            if (respostaEmprestimo == 'S') {
                System.out.println("Livros disponíveis, escolha um");
                biblioteca.listarLivros();
                String livroTitulo = sc.nextLine();
                biblioteca.addEmprestimos(livroTitulo, cl1);
            }
            System.out.println("Deseja devolver Livro? S/N");
            char caracterDeDevolverLivro = sc.next().toUpperCase().trim().charAt(0);
            sc.nextLine();
            if (caracterDeDevolverLivro == 'S') {
                System.out.println("livros emprestados");
                biblioteca.listarEmprestimos();
                String livroTitulo = sc.nextLine();
                biblioteca.removerEmprestimos(livroTitulo, cl1);
            }
        }
        System.out.println("Saindo da biblioteca");
        sc.close();
    }
}