import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class QuartaLista5 {
    public static void main(String[] args) {

        String[] baralho = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        String[] naipes = { "Paus", "Copas", "Espada", "Ouro" };
        Set<String> carta = new HashSet<>(); //random
        SortedSet<String> cartaOrdenada = new TreeSet<>(); //ordenado

        for (String baralhos : baralho){
            for (String naipe : naipes){
                String res = baralhos + " " + naipe; //ordenado
                carta.add(baralhos + " " + naipe);
                cartaOrdenada.add(res);
            }
        }
               
        for (String string : carta){ //random
            System.out.println(string);
        }

        for (String string1 : cartaOrdenada){ //ordenado
            System.out.println(string1);
        }
    }
}