package estruturadados.Interface.listas;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversorArrayToList {
    public static void main(String[] args) {

        String[] liguagens = {"Java", "PHP", "PYTHON", "C", "Dart"};
        System.out.println("Array: " + Arrays.toString(liguagens));

        List<String> lista = new ArrayList<>();
        for (String l : liguagens) {
            lista.add(l);
        }
        System.out.println("Array convertido em List<>: " + Arrays.toString(liguagens));
    }
}
