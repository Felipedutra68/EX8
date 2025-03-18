package EX8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Dublicatas9 {
    
 public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> listaDeNomes = new ArrayList<>();

        System.out.println("Digite um numero");
        int n1 = teclado.nextInt();

        System.out.println("Digite um numero");
        int n2 = teclado.nextInt();

     listaDeNomes.add(n1);
        listaDeNomes.add(n2);
    
    HashSet<Integer> set = new HashSet<>(listaDeNomes);
boolean hashDuplicatas = set.size() != listaDeNomes.size();   
        
    System.out.println("Os numeros sao iguais"+ hashDuplicatas);
        
        
   
 }
}
