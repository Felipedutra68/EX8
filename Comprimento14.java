package EX8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Comprimento14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> listaDeNomes = new ArrayList<>();

        ArrayList<String> listaDeNomes2 = new ArrayList<>();

        String n1 = "op";

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite uma palavra");
            n1 = teclado.nextLine();

            listaDeNomes.add(n1);

        }

        for (String palavra : listaDeNomes) {
            if (palavra.length() > 5) {

                listaDeNomes2.add(palavra);
            }
        }

        for (String nome2 : listaDeNomes2) {

            System.out.println(nome2);

        }

    }

}
