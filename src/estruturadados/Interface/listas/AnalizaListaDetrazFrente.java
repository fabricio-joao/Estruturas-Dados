package estruturadados.Interface.listas;

import java.util.*;

public class AnalizaListaDetrazFrente {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Adão");
        nomes.add("Luiz");
        nomes.add("Maria");
        nomes.add("Bianca");
        nomes.add("Ronaldo");
        nomes.add("Tião");

        System.out.println(nomes);

        Iterator<String> nomesIterados  = nomes.iterator();
       while (nomesIterados.hasNext()){
           String n = nomesIterados.next();
           System.out.println(n);
       }

        /*ListIterator<String> listaInt = nomes.listIterator();
        System.out.println("De cima para baixo");
        while (listaInt.hasNext()){
            System.out.println("index:" + listaInt.nextIndex()+"  valor:"+listaInt.next());
        }
        System.out.println("");
        System.out.println("De debaixo para cima");
        while (listaInt.hasPrevious()){
            System.out.println("index:" + listaInt.previousIndex()+"  valor:"+listaInt.previous());
        }*/
    }
}
