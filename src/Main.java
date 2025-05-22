import entity.Autor;
import entity.Biblioteca;
import entity.Cliente;
import entity.Livro;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean response = false;
        boolean entradaValida = false;

    do{
        System.out.println("Deseja pegar um livro emprestado? S/N");
       char character = sc.next().toUpperCase().trim().charAt(0);
        System.out.println(character);
       switch (character){
           case 'S': {
            response = true;
            entradaValida = true;
            break;
           }
           case 'N': {
               response = false;
               entradaValida = true;
               break;
           }
           default: {
               System.out.println("Opção invalida");
               break;
           }
       }

    }while (!entradaValida);
        Autor aut1 = new Autor(1,"Nana",LocalDate.of(1976,8,24));
        Autor aut2 = new Autor(2,"Baba",LocalDate.of(2000,1,12));
        Livro book1 = new Livro(1,"Harry",aut1);
        Livro book2 = new Livro(2,"Petter",aut2);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addLivros(book1);
        biblioteca.addLivros(book2);
        biblioteca.addAutores(aut1);
        biblioteca.addAutores(aut2);
        biblioteca.listarLivros();

        Cliente cl1 = new Cliente(1,"Neo",LocalDate.of(2004,9,15),"neo@email.com");
        Cliente cl2 = new Cliente(2,"gabriel",LocalDate.of(2001,12,30),"gabriel@email.com");
        Cliente cl3 = new Cliente(3,"elon",LocalDate.of(2004,9,15),"elon@email.com");
        biblioteca.addEmprestimos(book1,cl1);
    }
}