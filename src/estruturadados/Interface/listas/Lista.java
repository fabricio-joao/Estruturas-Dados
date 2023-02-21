package estruturadados.Interface.listas;

import java.util.*;

public class Lista {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Alan");
        nomes.add("Higor");

        System.out.println("*** Interface List<> extendida de Collection + classe ArrayList<>()***");
        System.out.println("*** Ordenação por inserção - Classe ArrayList<>() ***");
        System.out.println(nomes);

        System.out.println("*** Ordenação alfabetica ou numerica com interface Collection - metodo sort()***");
        Collections.sort(nomes);
        System.out.println(nomes);

        System.out.println(" ");
        System.out.println("*** Interface List<> extendida de Collection + classe LinkedList<>()***");

        List<String> nomesLink = new LinkedList<>();
        nomesLink.add("João");
        nomesLink.add("Maria");
        nomesLink.add("Alan");
        nomesLink.add("Higor");

        System.out.println("*** Ordenação por inserção - Classe LinkedList<>() ***");
        System.out.println(nomesLink);


       System.out.println("*** Ordenação alfabetica ou numerica com interface Collection - metodo sort()***");
       Collections.sort(nomesLink);
       System.out.println(nomesLink);
    }
}
