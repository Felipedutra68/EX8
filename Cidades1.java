package EX8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Cidades1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> listaDeNomes = new ArrayList<>();

        System.out.println("Digite o nome de uma cidade");
        String n1 = teclado.nextLine();

        System.out.println("Digite o nome de uma cidade");
        String n2 = teclado.nextLine();

        System.out.println("Digite o nome de uma cidade");
        String n3 = teclado.nextLine();

        System.out.println("Digite o nome de uma cidade");
        String n4 = teclado.nextLine();

        System.out.println("Digite o nome de uma cidade");
        String n5 = teclado.nextLine();

        listaDeNomes.add(n1);
        listaDeNomes.add(n2);
        listaDeNomes.add(n3);
        listaDeNomes.add(n4);
        listaDeNomes.add(n5);

        for (String nome : listaDeNomes) {

            System.out.println(nome);

        }

    }
}
