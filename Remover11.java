package EX8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Remover11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> listaDeNomes = new ArrayList<>();

        int n1 = 0;
        for (int i = 0; i < 10; i++) {

            System.out.println("Digite um numero");
            n1 = teclado.nextInt();

            if (!listaDeNomes.contains(n1)) {

                listaDeNomes.add(n1);
            
            }

        }

         for ( Integer nome2 : listaDeNomes) {

            System.out.println(nome2);

        }
        
        
    }

}
