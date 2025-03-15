package EX8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class IntersecçãoListas12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> listaDeNomes = new ArrayList<>();

        ArrayList<String> listaDeNomes2 = new ArrayList<>();

         ArrayList<String> interseccao = new ArrayList<>();
        
           
         
         System.out.println("Digite um nome");
        String n1 = teclado.nextLine();

        System.out.println("Digite um nome");
        String n2 = teclado.nextLine();

        System.out.println("Digite um nome");
        String n3 = teclado.nextLine();

        System.out.println("Digite um nome");
        String n4 = teclado.nextLine();
        
         listaDeNomes.add(n1);
        listaDeNomes.add(n2);
        listaDeNomes2.add(n3);
        listaDeNomes2.add(n4);
        
        
        
        
        for (String nome1 : listaDeNomes) {  
if (listaDeNomes2.contains(nome1)) {  
interseccao.add(nome1); 

  
} 
        }
      
   
        for (String nome2 : listaDeNomes) {

  System.out.println(nome2); 
        
  
        }  
      }
        
    }
