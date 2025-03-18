package EX8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Animais10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> listaDeNomes = new ArrayList<>();

        ArrayList<String> listaDeNomes2 = new ArrayList<>();

        System.out.println("Digite o nome de um Animal");
        String n1 = teclado.nextLine();

        System.out.println("Digite o nome de um Animal");
        String n2 = teclado.nextLine();

        System.out.println("Digite o nome de um Animal");
        String n3 = teclado.nextLine();

        System.out.println("Digite o nome de um Animal");
        String n4 = teclado.nextLine();

        listaDeNomes.add(n1);
        listaDeNomes.add(n2);
        listaDeNomes.add(n3);
        listaDeNomes.add(n4);

        for (String nome : listaDeNomes) {
            listaDeNomes2.add(nome);

        }

        for (String nome2 : listaDeNomes2) {

            System.out.println(nome2);

        }

        
        
    }
}
