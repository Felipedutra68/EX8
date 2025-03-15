package EX8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ListaDeNumeros2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> listaDeNomes = new ArrayList<>();

        listaDeNomes.add(1);
        listaDeNomes.add(2);
        listaDeNomes.add(3);
        listaDeNomes.add(4);
        listaDeNomes.add(5);
        listaDeNomes.add(6);
        listaDeNomes.add(7);
        listaDeNomes.add(8);
        listaDeNomes.add(9);
        listaDeNomes.add(10);

      
         listaDeNomes.removeIf(n -> n % 2 == 0);
        
        for (Integer nome : listaDeNomes) {

            System.out.println(nome);
        
        }
    }
}
