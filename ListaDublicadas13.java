package EX8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ListaDublicadas13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> listaDeNomes = new ArrayList<>();

        ArrayList<Integer> listaDeNomes2 = new ArrayList<>();

        ArrayList<Integer> interseccao = new ArrayList<>();

        int n1 = 0;
        for (int i = 0; i < 5; i++) {

            System.out.println("Digite um numero");
            n1 = teclado.nextInt();

            if (!listaDeNomes.contains(n1)) {

                listaDeNomes.add(n1);

            }

        }

        int n2 = 0;
        for (int f = 0; f < 5; f++) {

            System.out.println("Digite um numero");
            n2 = teclado.nextInt();

            if (!listaDeNomes2.contains(n2)) {

                listaDeNomes2.add(n2);

            }

        }

        for (Integer nome1 : listaDeNomes) {
            if (listaDeNomes2.contains(nome1)) {
                interseccao.add(nome1);

            }
        }

        System.out.println(interseccao);

    }
}
