import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

    public class QuartaLista6 {
        public static void main(String[] args) {

            Integer[] arrMinhaLista = { 1, 3, 5, 7 }; //criando lista com valores
            ArrayList<Integer> minhaLista = new ArrayList<>(); //criando lista sem valores
            Collections.addAll(minhaLista, arrMinhaLista); //adicionando dados na lista vazia
            
            Integer[] arrOutraLista = { 2, 4, 6, 8 };
            ArrayList<Integer> outraLista = new ArrayList<>();
            Collections.addAll(outraLista, arrOutraLista);
        
            ArrayList<Integer> novaLista = new ArrayList<>();
                for (Integer integer : minhaLista) {
                    novaLista.add((Integer) integer);
                }
                for (Integer integer : outraLista) {
                    novaLista.add((Integer) integer);
                }
            System.out.println(novaLista);
    }
}