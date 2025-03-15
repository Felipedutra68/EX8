package EX8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Lista5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Character> listaDeNomes = new ArrayList<>();

        System.out.println("Digite uma letra");
        char n1 = teclado.next().charAt(0);

        System.out.println("Digite uma letra");
        char n2 = teclado.next().charAt(0);

       System.out.println("Digite uma letra");
         char n3 = teclado.next().charAt(0);

     System.out.println("Digite uma letra");
        char n4 = teclado.next().charAt(0);

       

        listaDeNomes.add(n1);
        listaDeNomes.add(n2);
        listaDeNomes.add(n3);
        listaDeNomes.add(n4);
       
        
         int tamanho = listaDeNomes.size();
          
  System.out.println("\nNa lista possuem " + tamanho + " letras"); 
        
        

    

   
    }
}
