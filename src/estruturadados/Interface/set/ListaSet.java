package estruturadados.Interface.set;

import java.util.HashSet;
import java.util.Set;

public class ListaSet {

    public static void main(String[] args) {
        Set<String> nome = new HashSet<>();
        nome.add("Alaidio");
        nome.add("Renato");
        nome.add("Bruna");
        nome.add("Tais");
        nome.add("Leila");
        nome.add("Tais");

        System.out.println("*** Ordenação é aleatoria - Classe HashSet<>() ***");
        System.out.println(nome);
    }
}
