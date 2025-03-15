package EX8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Inverter15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> listaDeNomes = new ArrayList<>();

        System.out.println("Digite uma palavra");
        String n1 = teclado.nextLine();

        System.out.println("Digite uma palavra");
        String n2 = teclado.nextLine();

        System.out.println("Digite uma palavra");
        String n3 = teclado.nextLine();

        System.out.println("Digite uma palavra");
        String n4 = teclado.nextLine();

        System.out.println("Digite uma palavra");
        String n5 = teclado.nextLine();

        System.out.println("Digite uma palavra");
        String n6 = teclado.nextLine();

        listaDeNomes.add(n1);
        listaDeNomes.add(n2);
        listaDeNomes.add(n3);
        listaDeNomes.add(n4);
        listaDeNomes.add(n5);
        listaDeNomes.add(n6);

        
        
        int tamanho = listaDeNomes.size();  
for (int i = 0; i < tamanho / 2; i++) {  
String temp = listaDeNomes.get(i);  
listaDeNomes.set(i,listaDeNomes.get(tamanho - 1 - i));  
listaDeNomes.set(tamanho - 1 - i, temp); 
}
        
        
        
        
        
        
         for (String nome : listaDeNomes) {
 
   System.out.println(nome); 
   
         }
        
    }
}
