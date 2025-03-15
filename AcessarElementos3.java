package EX8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class AcessarElementos3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Double> listaDeNomes = new ArrayList<>();

        System.out.println("Digite um numero");
        double n1 = teclado.nextDouble();

        System.out.println("Digite um numero");
        double n2 = teclado.nextDouble();

        System.out.println("Digite um numero");
        double n3 = teclado.nextDouble();

        System.out.println("Digite um numero");
        double n4 = teclado.nextDouble();

        System.out.println("Digite um numero");
        double n5 = teclado.nextDouble();

        listaDeNomes.add(n1);
        listaDeNomes.add(n2);
        listaDeNomes.add(n3);
        listaDeNomes.add(n4);
        listaDeNomes.add(n5);

        System.out.println(listaDeNomes.get(2));
        
    }

}

