package EX8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Contem4 {
    
public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
 
 ArrayList<String> listaDeNomes = new ArrayList<>();
    
   listaDeNomes.add("Vermelho"); 
   listaDeNomes.add("Verde"); 
   listaDeNomes.add("Azul");         
        
   
   boolean cont1 = listaDeNomes.contains("Amarelo");
  
  System.out.println("A cor amarela esta na lista? " + cont1);      
        
 }
}
