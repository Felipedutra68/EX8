package EX8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ListaOrdenada7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> listaDeNomes = new ArrayList<>();

        System.out.println("Digite um numero");
        int n1 = teclado.nextInt();

        System.out.println("Digite um numero");
        int n2 = teclado.nextInt();

        System.out.println("Digite um numero");
        int n3 = teclado.nextInt();

        System.out.println("Digite um numero");
        int n4 = teclado.nextInt();

        System.out.println("Digite um numero");
        int n5 = teclado.nextInt();

        System.out.println("Digite um numero");
        int n6 = teclado.nextInt();

        System.out.println("Digite um numero");
        int n7 = teclado.nextInt();

        System.out.println("Digite um numero");
        int n8 = teclado.nextInt();

        System.out.println("Digite um numero");
        int n9 = teclado.nextInt();

        System.out.println("Digite um numero");
        int n10 = teclado.nextInt();

        listaDeNomes.add(n1);
        listaDeNomes.add(n2);
        listaDeNomes.add(n3);
        listaDeNomes.add(n4);
        listaDeNomes.add(n5);
        listaDeNomes.add(n6);
        listaDeNomes.add(n7);
        listaDeNomes.add(n8);
        listaDeNomes.add(n9);
        listaDeNomes.add(n10);

        Collections.sort(listaDeNomes);

        for (Integer nome : listaDeNomes) {

            System.out.println(nome);

        }
    }

}
